/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.util;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.annotation.Records;
import coffeepot.bean.wr.types.FormatType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class RecordCounter {

    private static boolean isARecord(Class<?> clazz) {
        Record record = clazz.getAnnotation(Record.class);
        if (record != null) {
            return true;
        }
        Records records = clazz.getAnnotation(Records.class);
        if (records != null) {
            return true;
        }

        return false;
    }

    private static Field[] getFields(Class<?> clazz, FormatType formatType) {

        Record record = null;
        Records records = clazz.getAnnotation(Records.class);
        if (records != null) {
            Record[] arrayRecords = records.value();
            for (Record rec : arrayRecords) {
                if (rec.forFormat().equals(FormatType.ANY)) {
                    record = rec;
                } else if (rec.forFormat().equals(formatType)) {
                    record = rec;
                    break;
                }
            }
            if (record == null) {
                record = arrayRecords[0];
            }
        }
        if (record == null) {
            record = clazz.getAnnotation(Record.class);
        }

        if (record != null) {
            return record.fields();
        }

        return null;
    }

    public static long count(Object obj, FormatType forFormatType) {
        long count = 0;
        if (obj == null || !isARecord(obj.getClass())) {
            return count;
        }
        Field[] fields = getFields(obj.getClass(), forFormatType);
        if (fields == null || fields.length == 0) {
            return count;
        }

        //se o objeto não escreve nenhum campo, então ele não conta.
        // Um exemplo disso é próprio bloco, que contém a estrutura dos registros.
        boolean writesSomeField = false;


        for (Field f : fields) {
            if (!"".equals(f.constantValue())) {
                continue;
            }
            Object o;
            java.lang.reflect.Field declaredField;

            try {
                declaredField = obj.getClass().getDeclaredField(f.name());
                declaredField.setAccessible(true);
                o = declaredField.get(obj);
                if (o == null) {
                    if (!isARecord(declaredField.getType())) {                        
                        writesSomeField = true;
                    }
                    continue;
                }

                if (Collection.class.isAssignableFrom(declaredField.getType())) {
                    Type genericType = declaredField.getGenericType();
                    if (ParameterizedType.class.isAssignableFrom(genericType.getClass())) {
                        ParameterizedType pt = (ParameterizedType) genericType;
                        Type[] actualTypeArguments = pt.getActualTypeArguments();
                        if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                            // verifica se é uma lista de records
                            if (isARecord((Class<?>) actualTypeArguments[0])) {
                                Collection c = (Collection) o;
                                Iterator it = c.iterator();
                                while (it.hasNext()) {
                                    count += count(it.next(), forFormatType);
                                }
                            }
                        }
                    }
                    continue;
                }

                if (isARecord(o.getClass())) {
                    count += count(o, forFormatType);
                } else {
                    writesSomeField = true;                   
                }

            } catch (Exception ex) {
               // Logger.getLogger(RecordCounter.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

        if (writesSomeField) {
            count++;
        }

        return count;
    }

    public static long count(Object obj) {
        return count(obj, FormatType.ANY);
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.reader;

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
import coffeepot.bean.wr.reader.DelimitedReader;
import coffeepot.bean.wr.reader.ObjectReader;
import coffeepot.bean.wr.typeHandler.DefaultDateHandler;
import coffeepot.bean.wr.typeHandler.DefaultDoubleHandler;
import coffeepot.br.sped.fiscal.typeHandler.CustomEnumHandler;
import java.io.Reader;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class ReaderFactory {

    public static ObjectReader createReader(Reader r) {
        DelimitedReader reader = new DelimitedReader(r);
        reader.setDelimiter('|');
        reader.setRecordInitializator("|");
        reader.setRemoveRecordInitializator(true);        
        reader.setIgnoreUnknownRecords(false);

        reader.getObjectMapperFactory().getHandlerFactory().registerTypeHandlerClassFor(Enum.class, CustomEnumHandler.class);

        DefaultDoubleHandler.setPatternDefault("#0.##########");
        DefaultDoubleHandler.setDecimalSeparatorDefault(',');
        DefaultDoubleHandler.setGroupingSeparatorDefault('.');

        DefaultDateHandler.setPatternDefaultForDate("ddMMyyyy");
        DefaultDateHandler.setPatternDefaultForTime("HHmmss");
        DefaultDateHandler.setPatternDefaultForDateTime("ddMMyyyyHHmmss");
        DefaultDateHandler.setPatternDefault("ddMMyyyy");

        return reader;
    }
}

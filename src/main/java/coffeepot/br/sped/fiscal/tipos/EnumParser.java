/*
 * Copyright 2017 Jeandeson O. Merelis.
 *
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
 */
package coffeepot.br.sped.fiscal.tipos;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2017 Jeandeson O. Merelis
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

/**
 *
 * @author Jeandeson O. Merelis
 */
public class EnumParser {

    /**
     *
     * @param <E>
     * @param enumClass
     * @param codigo
     * @return
     *
     * @throws ParseException
     */
    public static <E extends Enum<E>> E parseEnumCodificado( Class<E> enumClass, String codigo ) {
        if (!EnumCodificado.class.isAssignableFrom( enumClass )) {
            throw new IllegalArgumentException( enumClass.getName() + " não implementa a interface EnumCodificado" );
        }

        if (codigo == null) {
            return null;
        }

        E[] enumConstants = enumClass.getEnumConstants();
        for (E enumValue : enumConstants) {
            String enumCod = ( (EnumCodificado) enumValue ).getCodigo();
            if (codigo.equals( enumCod )) {
                return enumValue;
            }
        }

        throw new ParseException( "Não foi possível converter o código '" + codigo + "' para o tipo " + enumClass.getName() );
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

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


/**
 * Indicador do tipo de transporte, referenciado no registro C115.
 * @author Jeandeson O. Merelis
 */
public enum TipoTransporte implements EnumCodificado{
    RODOVIARIO('0'),
    FERROVIARIO('1'),
    RODO_FERRROVIARIO('2'),
    AQUAVIARIO('3'),
    DUTOVIARIO('4'),
    AEREO('5'),
    OUTROS('9');

    private final char codigo;

    private TipoTransporte(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
}

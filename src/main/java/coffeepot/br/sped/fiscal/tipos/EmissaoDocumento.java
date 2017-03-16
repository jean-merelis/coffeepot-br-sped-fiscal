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
 * Indicador do emitente do documento fiscal, referenciado no registro C100 e
 * C140.
 *
 * @author Jeandeson O. Merelis
 */
public enum EmissaoDocumento implements EnumCodificado {

    PROPRIA("0"),
    TERCEIROS("1");
    private final String codigo;

    private EmissaoDocumento(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public EmissaoDocumento parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return PROPRIA;
        }
        if ("1".equals(codigo)) {
            return TERCEIROS;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo EmissaoDocumento");
    }
}

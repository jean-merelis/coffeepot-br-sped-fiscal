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
 *
 * @author Jeandeson O. Merelis
 */
public enum PropriedadeEPosseItem implements EnumCodificado {

    PROP_INFORMANTE_EM_SEU_PODER("0"),
    PROP_INFORMANTE_EM_POSSE_DE_TERCEIROS("1"),
    PROP_TERCEIROS_EM_POSSE_INFORMANTE("2");
    private String codigo;

    private PropriedadeEPosseItem(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public PropriedadeEPosseItem parse(String codigo) throws ParseException {
        switch (codigo) {
            case "0":
                return PROP_INFORMANTE_EM_SEU_PODER;
            case "1":
                return PROP_INFORMANTE_EM_POSSE_DE_TERCEIROS;
            case "2":
                return PROP_TERCEIROS_EM_POSSE_INFORMANTE;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo PropriedadeEPosseItem");
    }
}

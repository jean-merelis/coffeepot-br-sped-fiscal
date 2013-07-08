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
public enum MotivoInventario implements EnumCodificado {

    FINAL_PERIODO("01"),
    MUDANCA_TRIBUTACAO("02"),
    BAIXA_CADASTRAL_E_OUTRAS("03"),
    ALTERACAO_REGIME_PAG("04"),
    DETERMINACAO_FISCO("05");
    private String codigo;

    private MotivoInventario(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public MotivoInventario parse(String codigo) throws ParseException {
        switch (codigo) {
            case "01":
                return FINAL_PERIODO;
            case "02":
                return MUDANCA_TRIBUTACAO;
            case "03":
                return BAIXA_CADASTRAL_E_OUTRAS;
            case "04":
                return ALTERACAO_REGIME_PAG;
            case "05":
                return DETERMINACAO_FISCO;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo MotivoInventario");
    }
}

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
public enum VersaoLayout implements EnumCodificado {

    VERSAO_002("002", "Versão 1.01 Ato COTEPE 01/01/2009"),
    VERSAO_003("003", "Versão 1.02 Ato COTEPE 01/01/2010"),
    VERSAO_004("004", "Versão 1.03 Ato COTEPE 01/01/2011"),
    VERSAO_005("005", "Versão 1.04 Ato COTEPE 01/01/2012"),
    VERSAO_006("006", "Versão 1.05 Ato COTEPE 01/07/2012"),
    VERSAO_007("007", "Versão 1.06 Ato COTEPE 01/01/2013"),
    VERSAO_008("008", "Versão 1.07 Ato COTEPE 01/01/2014"),
    VERSAO_009("009", "Versão 1.08 Ato COTEPE 01/01/2015"),
    VERSAO_010("010", "Versão 1.09 Ato COTEPE 01/01/2016");
    private String codigo;
    private String descricao;

    private VersaoLayout(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public VersaoLayout parse(String codigo) throws ParseException {
        if (codigo == null) {
            return null;
        }
        switch (codigo) {
            case "002":
                return VERSAO_002;
            case "003":
                return VERSAO_003;
            case "004":
                return VERSAO_004;
            case "005":
                return VERSAO_005;
            case "006":
                return VERSAO_006;
            case "007":
                return VERSAO_007;
            case "008":
                return VERSAO_008;
            case "009":
                return VERSAO_009;
            case "010":
                return VERSAO_010;
            default:
                throw new IllegalArgumentException("Tipo de versão não suportado");
        }
    }

    public static VersaoLayout parseByDescription(String descricao) {
        if (VERSAO_002.getDescricao().equals(descricao)) {
            return VERSAO_002;
        }
        if (VERSAO_003.getDescricao().equals(descricao)) {
            return VERSAO_003;
        }
        if (VERSAO_004.getDescricao().equals(descricao)) {
            return VERSAO_004;
        }
        if (VERSAO_005.getDescricao().equals(descricao)) {
            return VERSAO_005;
        }
        if (VERSAO_006.getDescricao().equals(descricao)) {
            return VERSAO_006;
        }
        if (VERSAO_007.getDescricao().equals(descricao)) {
            return VERSAO_007;
        }
        if (VERSAO_008.getDescricao().equals(descricao)) {
            return VERSAO_008;
        }
        if (VERSAO_009.getDescricao().equals(descricao)) {
            return VERSAO_009;
        }
        if (VERSAO_010.getDescricao().equals(descricao)) {
            return VERSAO_010;
        }
        return null;
    }

    /**
     * Versão que este projeto implementa.
     *
     * @return
     */
    public static VersaoLayout getLastVersionImpl() {
        return VERSAO_009;
    }
}

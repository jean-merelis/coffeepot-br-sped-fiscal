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

    VERSAO_100("100", "Versão 100 Ato COTEPE 01/01/2008"),
    VERSAO_101("101", "Versão 101 Ato COTEPE 01/01/2009"),
    VERSAO_102("102", "Versão 102 Ato COTEPE 01/01/2010"),
    VERSAO_103("103", "Versão 103 Ato COTEPE 01/01/2011");
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
    public Enum parse(String codigo) throws ParseException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static VersaoLayout parseByDescription(String descricao) {
        if (VERSAO_100.getDescricao().equals(descricao)) {
            return VERSAO_100;
        }
        if (VERSAO_101.getDescricao().equals(descricao)) {
            return VERSAO_101;
        }
        if (VERSAO_102.getDescricao().equals(descricao)) {
            return VERSAO_102;
        }
        if (VERSAO_103.getDescricao().equals(descricao)) {
            return VERSAO_103;
        }
        return null;
    }
    
    /**
     * Versão que este projeto implementa.
     * @return 
     */
    public static VersaoLayout getLastVersionImpl(){
        return VERSAO_103;
    }
}

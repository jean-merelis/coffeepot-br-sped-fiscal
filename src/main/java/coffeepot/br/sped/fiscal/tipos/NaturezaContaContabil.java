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
 * Natureza da conta/grupo de contas do plano de contas contábil.
 * 
 * @author Jeandeson O. Merelis
 */
public enum NaturezaContaContabil implements EnumCodificado{
    /**
     * Contas de ativo.
     */
    ATIVO("01","Contas de ativo"),
    /**
     * Contas de passivo.
     */
    PASSIVO("02","Contas de passivo"),
    /**
     * Patrimônio líquido.
     */
    PATRIMONIO_LIQUIDO("03","Patrimônio líquido"),
    /**
     * Contas de resultado.
     */
    RESULTADO("04","Contas de resultado"),
    /**
     * Contas de compensação.
     */
    COMPENSACAO("05","Contas de compensação"),
    /**
     * Outras.
     */
    OUTRAS("09","Outras");
    
    private String codigo;
    private String descricao;

    private NaturezaContaContabil(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public NaturezaContaContabil parse(String codigo) throws ParseException{        
        switch (codigo){
            case "01": return ATIVO;
            case "02": return PASSIVO;
            case "03": return PATRIMONIO_LIQUIDO;
            case "04": return RESULTADO;
            case "05": return COMPENSACAO;
            case "09": return OUTRAS;
            default: throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo NaturezaContaContabil");
        }
    }
}

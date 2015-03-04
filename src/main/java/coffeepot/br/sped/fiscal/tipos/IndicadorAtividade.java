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
 * Indicador de tipo de atividade.
 *
 * @author Jeandeson O. Merelis
 */
public enum IndicadorAtividade implements EnumCodificado{

    INDUSTRIAL("0", "Industrial ou equiparado a industrial"),
    OUTROS("1", "Outros");
    
    private String codigo;
    private String descricao;

    private IndicadorAtividade(String codigo, String descricao) {
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

    
    public static IndicadorAtividade parseEnum(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return INDUSTRIAL;
        }
        if ("1".equals(codigo)) {
            return OUTROS;
        }
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo IndicadorAtividade");
    }

    @Override
    public IndicadorAtividade parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return INDUSTRIAL;
        }
        if ("1".equals(codigo)) {
            return OUTROS;
        }
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo IndicadorAtividade");
    }
}

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
 * Situação do Documento, referenciado no registro C100.
 * 
 * @author Jeandeson O. Merelis
 */
public enum SituacaoDocumento  implements EnumCodificado{
    REGULAR("00","Documento regular"),
    EXTEMPORANEA_REGULAR("01","Escrituração extemporânea de documento regular"),
    CANCELADO("02","Documento cancelado"),
    EXTEMPORANEA_CANCELADO("03","Escrituração extemporânea de documento cancelado"),
    DENEGADO("04","NF-e, NFC-e ou CT-e denegado"),
    NUM_INUTILIZADO("05","Numeração inutilizada"),
    COMPLEMENTAR("06","Documento Fiscal Complementar"),
    EXTEMPORANEA_COMPLEMENTAR("07","Escrituração extemporânea de documento complementar"),
    ESPECIAL("08","Documento Fiscal emitido com base em Regime Especial ou Norma Específica");

    private String codigo;
    private String descricao;

    private SituacaoDocumento(String codigo, String descricao) {
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
    public SituacaoDocumento parse(String codigo) throws ParseException{
        if ("00".equals(codigo)) return REGULAR;
        if ("01".equals(codigo)) return EXTEMPORANEA_REGULAR;
        if ("02".equals(codigo)) return CANCELADO;
        if ("03".equals(codigo)) return EXTEMPORANEA_CANCELADO;
        if ("04".equals(codigo)) return DENEGADO;
        if ("05".equals(codigo)) return NUM_INUTILIZADO;
        if ("06".equals(codigo)) return COMPLEMENTAR;
        if ("07".equals(codigo)) return EXTEMPORANEA_COMPLEMENTAR;
        if ("08".equals(codigo)) return ESPECIAL;
        
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo SituacaoDocumento");
    }
}

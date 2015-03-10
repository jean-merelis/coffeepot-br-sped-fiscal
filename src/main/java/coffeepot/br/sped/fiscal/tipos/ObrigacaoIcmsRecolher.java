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
 * Codigo do Ajuste de apuração do ICMS, referenciado no registro E111.
 * @author Mauricio R. Morais
 */
public enum ObrigacaoIcmsRecolher implements EnumCodificado{
    ICMS_RECOLHER("000","ICMS a recolher"),
    ICMS_SUBSTITUICAO_ENTRADAS("001","ICMS da substituicao tributaria pelas entradas"),
    ICMS_SUBSTITUICAO_SAIDAS_ESTADO("002","ICMS da substituicao pelas saidas para o Estado"),
    ANTECIPACAO_DIFERENCIAL_ALIQUOTAS("003","Antecipacao do diferencial de aliquotas do ICMS"),
    ANTECIPACAO_ICMS_IMPORTACAO("004","Antecipacao do ICMS da importacao"),
    ANTECIPACAO_TRIBUTARIA("005","Antecipacao tributaria"),
    ALIQUOTA_ADICIONAL_FUNDO_POBREZA("006","ICMS resultante da aliquota adicional dos itens incluidos no Fundo de Combate a Pobreza"),
    OUTRAS_OBRIGACOES_ICMS("090","Outras obrigacoes do ICMS"),
    ICMS_SUBSTITUICAO_SAIDAS_OUTROS_ESTADOS("999","ICMS da sustituicao tributaria pelas saidas para outro Estado");
    
    private String codigo;
    private String descricao;

    private ObrigacaoIcmsRecolher(String codigo, String descricao) {
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
    public ObrigacaoIcmsRecolher parse(String codigo) throws ParseException{
    	ObrigacaoIcmsRecolher returnValue = null;
        if (codigo == null){
            throw new ParseException("Nao foi possivel conveter para o tipo CodigoAjusteApuracaoIcms");
        }
        for (ObrigacaoIcmsRecolher enumValue : ObrigacaoIcmsRecolher.values()) {
			if(codigo.equals(enumValue.getCodigo())){
				returnValue = enumValue;
				break;
			}
		}
        if(returnValue == null){
        	throw new ParseException("Nao foi possivel conveter para o tipo CodigoAjusteApuracaoIcms");	
        }
        return returnValue;
    }
 }

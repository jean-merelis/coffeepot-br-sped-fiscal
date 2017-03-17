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
 * Codigo do Ajuste de apuração do ICMS, referenciado no registro E116.
 * @author Mauricio R. Morais
 */
public enum ObrigacaoIcmsRecolher implements EnumCodificado{
    /**
     * ICMS a recolher.
     */
    ICMS_RECOLHER( "000" ),
    /**
     * ICMS da substituicao tributaria pelas entradas.
     */
    ICMS_SUBSTITUICAO_ENTRADAS( "001" ),
    /**
     * ICMS da substituicao pelas saidas para o Estado.
     */
    ICMS_SUBSTITUICAO_SAIDAS_ESTADO( "002" ),
    /**
     * Antecipacao do diferencial de aliquotas do ICMS.
     */
    ANTECIPACAO_DIFERENCIAL_ALIQUOTAS( "003" ),
    /**
     * Antecipacao do ICMS da importacao.
     */
    ANTECIPACAO_ICMS_IMPORTACAO( "004" ),
    /**
     * Antecipacao tributaria.
     */
    ANTECIPACAO_TRIBUTARIA( "005" ),
    /**
     * ICMS resultante da aliquota adicional dos itens incluidos no Fundo de
     * Combate a Pobreza.
     */
    ALIQUOTA_ADICIONAL_FUNDO_POBREZA( "006" ),
    /**
     * Outras obrigacoes do ICMS
     */
    OUTRAS_OBRIGACOES_ICMS( "090" ),
    /**
     * ICMS da sustituicao tributaria pelas saidas para outro Estado.
     */
    ICMS_SUBSTITUICAO_SAIDAS_OUTROS_ESTADOS( "999" );

    private final String codigo;

    private ObrigacaoIcmsRecolher( String codigo ) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
 }

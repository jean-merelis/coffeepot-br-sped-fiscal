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
public enum CodigoAjusteApuracaoIcms implements EnumCodificado{
    OUTROS_DEBITOS_ICMS("UF009999","Outros debitos para ajuste de apuracao ICMS"),
    OUTROS_DEBITOS_ICMS_ST("UF109999","Outros debitos para ajuste de apuracao ICMS ST"),
    ESTORNO_CREDITOS_ICMS("UF019999","Estorno de creditos para ajuste de apuracao ICMS"),
    ESTORNO_CREDITOS_ICMS_ST("UF119999","Estorno de creditos para ajuste de apuracao ICMS ST"),
    OUTROS_CREDITOS_ICMS("UF029999","Outros creditos para ajuste de apuracao ICMS"),
    OUTROS_CREDITOS_ICMS_ST("UF129999","Outros creditos para ajuste de apuracao ICMS ST"),
    ESTORNO_DEBITOS_ICMS("UF039999","Estorno de debitos para ajuste de apuracao ICMS"),
    ESTORNO_DEBITOS_ICMS_ST("UF139999","Estorno de debitos para ajuste de apuracao ICMS ST"),
    DEDUCOES_IMPOSTO_ICMS("UF049999","Deducoes do imposto apurado na apuracao ICMS"),
    DEDUCOES_IMPOSTO_ICMS_ST("UF149999","Deducoes do imposto apurado na apuracao ICMS ST"),
    DEBITO_ESPECIAL_ICMS("UF059999","Debito especial de ICMS"),
    DEBITO_ESPECIAL_ICMS_ST("UF159999","Debito especial de ICMS ST"),
    CONTROLE_ICMS_EXTRA_APURACAO("UF099999","Controle de ICMS extra-apuracao");

    private final String codigo;
    private final String descricao;

    private CodigoAjusteApuracaoIcms(String codigo, String descricao) {
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
 }

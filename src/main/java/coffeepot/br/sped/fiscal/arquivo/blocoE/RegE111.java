/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

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


import java.util.List;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E111"),
	@Field(name = "codAjApur"),
	@Field(name = "descrComplAj"),
	@Field(name = "vlAjApur"),
	@Field(name = "regE112List"),
	@Field(name = "regE113List")
})
@Getter
@Setter
public class RegE111{
    /**
     * O valor informado no campo deve existir na tabela de código do ajuste da
     * apuração e dedução de cada Secretaria de Fazenda, conforme a UF do
     * declarante, campo UF do registro 0000 ou, não havendo esta tabela, o
     * valor informado no campo deve existir na tabela de código do ajuste da
     * apuração e dedução, constante da observação do Item 5.1.1. do Ato
     * COTEPE/ICMS no 09, de 18 de abril de 2008. O código do ajuste utilizado
     * deve ter seu terceiro caractere como “0” (zero), indicando ajuste de
     * ICMS, não incluindo ajustes de ICMS-ST. O quarto caractere deve ser
     * preenchido, conforme item 5.1.1. do Ato COTEPE/ICMS no 09, de 18 de abril
     * de 2008, com um dos códigos abaixo: 0 – Outros débitos; 1 – Estorno de
     * créditos; 2 – Outros créditos; 3 – Estorno de débitos; 4 – Deduções do
     * imposto apurado; 5 – Débitos Especiais. Obs.: Na existência de mais de um
     * tipo de crédito que se enquadre no mesmo código de ajuste, deverão ser
     * apresentados tantos registros E111 quantos forem os tipos de créditos.
     */
    private String codAjApur;
    private String descrComplAj;
    private Double vlAjApur;
    private List<RegE112> regE112List;
    private List<RegE113> regE113List;

}

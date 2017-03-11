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
    @Field(name = "reg", id = true, constantValue="E110"),
	@Field(name = "vlTotDebitos"),
	@Field(name = "vlAjDebitos"),
	@Field(name = "vlTotAjDebitos"),
	@Field(name = "vlEstornosCred"),
	@Field(name = "vlTotCreditos"),
	@Field(name = "vlAjCreditos"),
	@Field(name = "vlTotAjCreditos"),
	@Field(name = "vlEstornosDeb"),
	@Field(name = "vlSldCredorAnt"),
	@Field(name = "vlSldApurado"),
	@Field(name = "vlTotDed"),
	@Field(name = "vlIcmsRecolher"),
	@Field(name = "vlSldCredorTransportar"),
	@Field(name = "debEsp"),
	@Field(name = "regE111List"),
	@Field(name = "regE115List"),
	@Field(name = "regE116List")
})
@Getter
@Setter
public class RegE110{
	private Double vlTotDebitos;
	private Double vlAjDebitos;
	private Double vlTotAjDebitos;
	private Double vlEstornosCred;
	private Double vlTotCreditos;
	private Double vlAjCreditos;
	private Double vlTotAjCreditos;
	private Double vlEstornosDeb;
	private Double vlSldCredorAnt;
	private Double vlSldApurado;
	private Double vlTotDed;
	private Double vlIcmsRecolher;
	private Double vlSldCredorTransportar;
	private Double debEsp;
	private List<RegE111> regE111List;
	private List<RegE115> regE115List;
	private List<RegE116> regE116List;
	
}

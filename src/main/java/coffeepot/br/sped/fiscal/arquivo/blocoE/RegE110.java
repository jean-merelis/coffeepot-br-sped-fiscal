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
	
	public Double getVlTotDebitos() {
		return vlTotDebitos;
	}
	public void setVlTotDebitos(Double vlTotDebitos) {
		this.vlTotDebitos = vlTotDebitos;
	}
	public Double getVlAjDebitos() {
		return vlAjDebitos;
	}
	public void setVlAjDebitos(Double vlAjDebitos) {
		this.vlAjDebitos = vlAjDebitos;
	}
	public Double getVlTotAjDebitos() {
		return vlTotAjDebitos;
	}
	public void setVlTotAjDebitos(Double vlTotAjDebitos) {
		this.vlTotAjDebitos = vlTotAjDebitos;
	}
	public Double getVlEstornosCred() {
		return vlEstornosCred;
	}
	public void setVlEstornosCred(Double vlEstornosCred) {
		this.vlEstornosCred = vlEstornosCred;
	}
	public Double getVlTotCreditos() {
		return vlTotCreditos;
	}
	public void setVlTotCreditos(Double vlTotCreditos) {
		this.vlTotCreditos = vlTotCreditos;
	}
	public Double getVlAjCreditos() {
		return vlAjCreditos;
	}
	public void setVlAjCreditos(Double vlAjCreditos) {
		this.vlAjCreditos = vlAjCreditos;
	}
	public Double getVlTotAjCreditos() {
		return vlTotAjCreditos;
	}
	public void setVlTotAjCreditos(Double vlTotAjCreditos) {
		this.vlTotAjCreditos = vlTotAjCreditos;
	}
	public Double getVlEstornosDeb() {
		return vlEstornosDeb;
	}
	public void setVlEstornosDeb(Double vlEstornosDeb) {
		this.vlEstornosDeb = vlEstornosDeb;
	}
	public Double getVlSldCredorAnt() {
		return vlSldCredorAnt;
	}
	public void setVlSldCredorAnt(Double vlSldCredorAnt) {
		this.vlSldCredorAnt = vlSldCredorAnt;
	}
	public Double getVlSldApurado() {
		return vlSldApurado;
	}
	public void setVlSldApurado(Double vlSldApurado) {
		this.vlSldApurado = vlSldApurado;
	}
	public Double getVlTotDed() {
		return vlTotDed;
	}
	public void setVlTotDed(Double vlTotDed) {
		this.vlTotDed = vlTotDed;
	}
	public Double getVlIcmsRecolher() {
		return vlIcmsRecolher;
	}
	public void setVlIcmsRecolher(Double vlIcmsRecolher) {
		this.vlIcmsRecolher = vlIcmsRecolher;
	}
	public Double getVlSldCredorTransportar() {
		return vlSldCredorTransportar;
	}
	public void setVlSldCredorTransportar(Double vlSldCredorTransportar) {
		this.vlSldCredorTransportar = vlSldCredorTransportar;
	}
	public Double getDebEsp() {
		return debEsp;
	}
	public void setDebEsp(Double debEsp) {
		this.debEsp = debEsp;
	}
	public List<RegE111> getRegE111List() {
		return regE111List;
	}
	public void setRegE111List(List<RegE111> regE111List) {
		this.regE111List = regE111List;
	}
	public List<RegE115> getRegE115List() {
		return regE115List;
	}
	public void setRegE115List(List<RegE115> regE115List) {
		this.regE115List = regE115List;
	}
	public List<RegE116> getRegE116List() {
		return regE116List;
	}
	public void setRegE116List(List<RegE116> regE116List) {
		this.regE116List = regE116List;
	}
	
	
}

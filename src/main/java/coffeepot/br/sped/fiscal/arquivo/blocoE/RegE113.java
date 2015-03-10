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


import java.util.Date;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E113"),
	@Field(name = "codPart", maxLength = 60),
	@Field(name = "codMod"),
	@Field(name = "ser"),
	@Field(name = "sub"),
	@Field(name = "numDoc"),
	@Field(name = "dtDoc"),
	@Field(name = "codItem"),
	@Field(name = "vlAjItem")
})
public class RegE113{
	private String codPart;
	private DocumentoFiscal codMod;
	private String ser;
	private Integer sub;
	private Long numDoc;
	private Date dtDoc;
	private String codItem;
	private Double vlAjItem;

	public String getCodPart() {
		return codPart;
	}
	public void setCodPart(String codPart) {
		this.codPart = codPart;
	}
	public DocumentoFiscal getCodMod() {
		return codMod;
	}
	public void setCodMod(DocumentoFiscal codMod) {
		this.codMod = codMod;
	}
	public String getSer() {
		return ser;
	}
	public void setSer(String ser) {
		this.ser = ser;
	}
	public Integer getSub() {
		return sub;
	}
	public void setSub(Integer sub) {
		this.sub = sub;
	}
	public Long getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(Long numDoc) {
		this.numDoc = numDoc;
	}
	public Date getDtDoc() {
		return dtDoc;
	}
	public void setDtDoc(Date dtDoc) {
		this.dtDoc = dtDoc;
	}
	public String getCodItem() {
		return codItem;
	}
	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}
	public Double getVlAjItem() {
		return vlAjItem;
	}
	public void setVlAjItem(Double vlAjItem) {
		this.vlAjItem = vlAjItem;
	}	
}

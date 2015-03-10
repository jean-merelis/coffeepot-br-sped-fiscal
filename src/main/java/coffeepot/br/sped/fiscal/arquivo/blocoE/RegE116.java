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
import coffeepot.br.sped.fiscal.tipos.IndicadorOrigemProcesso;
import coffeepot.br.sped.fiscal.tipos.ObrigacaoIcmsRecolher;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E116"),
	@Field(name = "codOr"),
	@Field(name = "vlOr"),
	@Field(name = "dtVcto"),
	@Field(name = "codRec"),
	@Field(name = "numProc", maxLength = 15),
	@Field(name = "indProc"),
	@Field(name = "proc"),
	@Field(name = "txtCompl"),
	@Field(name = "mesRef")
})
public class RegE116{
	private ObrigacaoIcmsRecolher codOr;
	private Double vlOr;
	private Date dtVcto;
	private String codRec;
	private String numProc;
	private IndicadorOrigemProcesso indProc;
	private String proc;
	private String txtCompl;
	private String mesRef;
	
	public ObrigacaoIcmsRecolher getCodOr() {
		return codOr;
	}
	public void setCodOr(ObrigacaoIcmsRecolher codOr) {
		this.codOr = codOr;
	}
	public Double getVlOr() {
		return vlOr;
	}
	public void setVlOr(Double vlOr) {
		this.vlOr = vlOr;
	}
	public Date getDtVcto() {
		return dtVcto;
	}
	public void setDtVcto(Date dtVcto) {
		this.dtVcto = dtVcto;
	}
	public String getCodRec() {
		return codRec;
	}
	public void setCodRec(String codRec) {
		this.codRec = codRec;
	}
	public String getNumProc() {
		return numProc;
	}
	public void setNumProc(String numProc) {
		this.numProc = numProc;
	}
	public IndicadorOrigemProcesso getIndProc() {
		return indProc;
	}
	public void setIndProc(IndicadorOrigemProcesso indProc) {
		this.indProc = indProc;
	}
	public String getProc() {
		return proc;
	}
	public void setProc(String proc) {
		this.proc = proc;
	}
	public String getTxtCompl() {
		return txtCompl;
	}
	public void setTxtCompl(String txtCompl) {
		this.txtCompl = txtCompl;
	}
	public String getMesRef() {
		return mesRef;
	}
	public void setMesRef(String mesRef) {
		this.mesRef = mesRef;
	}
}

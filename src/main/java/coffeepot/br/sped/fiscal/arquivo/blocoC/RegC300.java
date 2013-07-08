/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

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


import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C300"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDocIni"),
    @Field(name = "numDocFin"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    //--
    @Field(name = "regC310List"),
    @Field(name = "regC320List")
})
public class RegC300 {

    private DocumentoFiscal codMod;
    private String ser;
    private String sub;
    private Integer numDocIni;
    private Integer numDocFin;
    private Date dtDoc;
    private Double vlDoc;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;
    //--
    private List<RegC310> regC310List;
    private List<RegC320> regC320List;

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

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public Integer getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Integer numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Integer getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Integer numDocFin) {
        this.numDocFin = numDocFin;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Double getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }

    public Double getVlPis() {
        return vlPis;
    }

    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }

    public Double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegC310> getRegC310List() {
        return regC310List;
    }

    public void setRegC310List(List<RegC310> regC310List) {
        this.regC310List = regC310List;
    }

    public List<RegC320> getRegC320List() {
        return regC320List;
    }

    public void setRegC320List(List<RegC320> regC320List) {
        this.regC320List = regC320List;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoH;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.tipos.PropriedadeEPosseItem;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "H010"),
    @Field(name = "codItem"),
    @Field(name = "unid"),
    @Field(name = "qtd"),
    @Field(name = "vlUnit"),
    @Field(name = "vlItem"),
    @Field(name = "indProp"),
    @Field(name = "codPart"),
    @Field(name = "txtCompl"),
    @Field(name = "codCta"),
    //--
    @Field(name = "regH020List")
})
public class RegH010 {

    private String codItem;
    private String unid;
    private Double qtd;
    private Double vlUnit;
    private Double vlItem;
    private PropriedadeEPosseItem indProp;
    private String codPart;
    private String txtCompl;
    private String codCta;
    //---
    private List<RegH020> regH020List;

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    public Double getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(Double vlUnit) {
        this.vlUnit = vlUnit;
    }

    public Double getVlItem() {
        return vlItem;
    }

    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }

    public PropriedadeEPosseItem getIndProp() {
        return indProp;
    }

    public void setIndProp(PropriedadeEPosseItem indProp) {
        this.indProp = indProp;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegH020> getRegH020List() {
        return regH020List;
    }

    public void setRegH020List(List<RegH020> regH020List) {
        this.regH020List = regH020List;
    }
}

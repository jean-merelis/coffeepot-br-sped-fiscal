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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C495"),
    @Field(name = "aliqIcms"),
    @Field(name = "codItem"),
    @Field(name = "qtd"),
    @Field(name = "qtdCanc"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "vlCanc"),
    @Field(name = "vlAcmo"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlIsen"),
    @Field(name = "vlNt"),
    @Field(name = "vlIcmsSt")
})
public class RegC495 {

    private Double aliqIcms;
    private String codItem;
    private Double qtd;
    private Double qtdCanc;
    private String unid;
    private Double vlItem;
    private Double vlDesc;
    private Double vlCanc;
    private Double vlAcmo;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlIsen;
    private Double vlNt;
    private Double vlIcmsSt;

    public Double getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    public Double getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(Double qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Double getVlItem() {
        return vlItem;
    }

    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }

    public Double getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Double getVlCanc() {
        return vlCanc;
    }

    public void setVlCanc(Double vlCanc) {
        this.vlCanc = vlCanc;
    }

    public Double getVlAcmo() {
        return vlAcmo;
    }

    public void setVlAcmo(Double vlAcmo) {
        this.vlAcmo = vlAcmo;
    }

    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public Double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public Double getVlIsen() {
        return vlIsen;
    }

    public void setVlIsen(Double vlIsen) {
        this.vlIsen = vlIsen;
    }

    public Double getVlNt() {
        return vlNt;
    }

    public void setVlNt(Double vlNt) {
        this.vlNt = vlNt;
    }

    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
}

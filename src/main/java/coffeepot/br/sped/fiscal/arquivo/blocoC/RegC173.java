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
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C173"),
    @Field(name = "loteMed"),
    @Field(name = "qtdItem"),
    @Field(name = "dtFab"),
    @Field(name = "dtVal"),
    @Field(name = "indMed"),
    @Field(name = "tpProd"),
    @Field(name = "vlTabMax")
})
public class RegC173 {

    private String loteMed;
    private Double qtdItem;
    private Date dtFab;
    private Date dtVal;
    private String indMed;
    private String tpProd;
    private Double vlTabMax;

    public String getLoteMed() {
        return loteMed;
    }

    public void setLoteMed(String loteMed) {
        this.loteMed = loteMed;
    }

    public Double getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(Double qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Date getDtFab() {
        return dtFab;
    }

    public void setDtFab(Date dtFab) {
        this.dtFab = dtFab;
    }

    public Date getDtVal() {
        return dtVal;
    }

    public void setDtVal(Date dtVal) {
        this.dtVal = dtVal;
    }

    public String getIndMed() {
        return indMed;
    }

    public void setIndMed(String indMed) {
        this.indMed = indMed;
    }

    public String getTpProd() {
        return tpProd;
    }

    public void setTpProd(String tpProd) {
        this.tpProd = tpProd;
    }

    public Double getVlTabMax() {
        return vlTabMax;
    }

    public void setVlTabMax(Double vlTabMax) {
        this.vlTabMax = vlTabMax;
    }
}

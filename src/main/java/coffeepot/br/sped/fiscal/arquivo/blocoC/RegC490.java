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

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C490"),
    @Field(name = "cstIcms"),
    @Field(name = "cfop"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlOpr"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "codObs")
})
public class RegC490 {

    private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;
    private Double vlOpr;
    private Double vlBcIcms;
    private Double vlIcms;
    private String codObs;

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Double getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public Double getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(Double vlOpr) {
        this.vlOpr = vlOpr;
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

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
}

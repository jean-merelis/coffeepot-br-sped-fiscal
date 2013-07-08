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
    @Field(name = "", constantValue = "C130"),
    @Field(name = "vlServNt"),
    @Field(name = "vlBcIssqn"),
    @Field(name = "vlIssqn"),
    @Field(name = "vlBcIrrf"),
    @Field(name = "vlIrrf"),
    @Field(name = "vlBcPrev"),
    @Field(name = "vlPrev")
})
public class RegC130 {

    private Double vlServNt;
    private Double vlBcIssqn;
    private Double vlIssqn;
    private Double vlBcIrrf;
    private Double vlIrrf;
    private Double vlBcPrev;
    private Double vlPrev;

    public Double getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }

    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public Double getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(Double vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public Double getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(Double vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public Double getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(Double vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public Double getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(Double vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public Double getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(Double vlPrev) {
        this.vlPrev = vlPrev;
    }
}

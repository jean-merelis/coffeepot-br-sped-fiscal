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
    @Field(name = "", constantValue = "C178"),
    @Field(name = "clEnq"),
    @Field(name = "vlUnid"),
    @Field(name = "quantPad")
})
public class RegC178 {

    private String clEnq;
    private Double vlUnid;
    private Double quantPad;

    public String getClEnq() {
        return clEnq;
    }

    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }

    public Double getVlUnid() {
        return vlUnid;
    }

    public void setVlUnid(Double vlUnid) {
        this.vlUnid = vlUnid;
    }

    public Double getQuantPad() {
        return quantPad;
    }

    public void setQuantPad(Double quantPad) {
        this.quantPad = quantPad;
    }
}

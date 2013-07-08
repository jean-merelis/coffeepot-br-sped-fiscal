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
    @Field(name = "", constantValue = "C141"),
    @Field(name = "numParc"),
    @Field(name = "dtVcto"),
    @Field(name = "vlParc")
})
public class RegC141 {

    private Integer numParc;
    private Date dtVcto;
    private Double vlParc;

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public Double getVlParc() {
        return vlParc;
    }

    public void setVlParc(Double vlParc) {
        this.vlParc = vlParc;
    }
}

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
    @Field(name = "", constantValue = "C179"),
    @Field(name = "bcStOrigDest"),
    @Field(name = "icmsStRep"),
    @Field(name = "icmsStCompl"),
    @Field(name = "bcRet"),
    @Field(name = "icmsRet")
})
public class RegC179 {

    private Double bcStOrigDest;
    private Double icmsStRep;
    private Double icmsStCompl;
    private Double bcRet;
    private Double icmsRet;

    public Double getBcStOrigDest() {
        return bcStOrigDest;
    }

    public void setBcStOrigDest(Double bcStOrigDest) {
        this.bcStOrigDest = bcStOrigDest;
    }

    public Double getIcmsStRep() {
        return icmsStRep;
    }

    public void setIcmsStRep(Double icmsStRep) {
        this.icmsStRep = icmsStRep;
    }

    public Double getIcmsStCompl() {
        return icmsStCompl;
    }

    public void setIcmsStCompl(Double icmsStCompl) {
        this.icmsStCompl = icmsStCompl;
    }

    public Double getBcRet() {
        return bcRet;
    }

    public void setBcRet(Double bcRet) {
        this.bcRet = bcRet;
    }

    public Double getIcmsRet() {
        return icmsRet;
    }

    public void setIcmsRet(Double icmsRet) {
        this.icmsRet = icmsRet;
    }
}

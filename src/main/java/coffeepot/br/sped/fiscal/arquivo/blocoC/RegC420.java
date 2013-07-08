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
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C420"),
    @Field(name = "codTotPar"),
    @Field(name = "vlrAcumTot"),
    @Field(name = "nrTot"),
    @Field(name = "descrNrTot"),
    //--
    @Field(name = "regC425List")
})
public class RegC420 {

    private String codTotPar;
    private Double vlrAcumTot;
    private Integer nrTot;
    private String descrNrTot;
    //--
    private List<RegC425> regC425List;

    public String getCodTotPar() {
        return codTotPar;
    }

    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }

    public Double getVlrAcumTot() {
        return vlrAcumTot;
    }

    public void setVlrAcumTot(Double vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }

    public Integer getNrTot() {
        return nrTot;
    }

    public void setNrTot(Integer nrTot) {
        this.nrTot = nrTot;
    }

    public String getDescrNrTot() {
        return descrNrTot;
    }

    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
    }

    public List<RegC425> getRegC425List() {
        return regC425List;
    }

    public void setRegC425List(List<RegC425> regC425List) {
        this.regC425List = regC425List;
    }
}

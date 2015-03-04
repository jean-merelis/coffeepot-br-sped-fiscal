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
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C110"),
    @Field(name = "codInf"),
    @Field(name = "txtCompl"),
    @Field(name = "regC111List"),
    @Field(name = "regC112List"),
    @Field(name = "regC113List"),
    @Field(name = "regC114List"),
    @Field(name = "regC115List"),
    @Field(name = "regC116List")
})
public class RegC110 {

    private String codInf;
    private String txtCompl;
    private List<RegC111> regC111List;
    private List<RegC112> regC112List;
    private List<RegC113> regC113List;
    private List<RegC114> regC114List;
    private List<RegC115> regC115List;
    private List<RegC116> regC116List;

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public List<RegC111> getRegC111List() {
        return regC111List;
    }

    public void setRegC111List(List<RegC111> regC111List) {
        this.regC111List = regC111List;
    }

    public List<RegC112> getRegC112List() {
        return regC112List;
    }

    public void setRegC112List(List<RegC112> regC112List) {
        this.regC112List = regC112List;
    }

    public List<RegC113> getRegC113List() {
        return regC113List;
    }

    public void setRegC113List(List<RegC113> regC113List) {
        this.regC113List = regC113List;
    }

    public List<RegC114> getRegC114List() {
        return regC114List;
    }

    public void setRegC114List(List<RegC114> regC114List) {
        this.regC114List = regC114List;
    }

    public List<RegC115> getRegC115List() {
        return regC115List;
    }

    public void setRegC115List(List<RegC115> regC115List) {
        this.regC115List = regC115List;
    }

    public List<RegC116> getRegC116List() {
        return regC116List;
    }

    public void setRegC116List(List<RegC116> regC116List) {
        this.regC116List = regC116List;
    }
}

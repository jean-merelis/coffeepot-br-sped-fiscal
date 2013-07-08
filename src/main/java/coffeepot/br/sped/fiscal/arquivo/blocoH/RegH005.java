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


import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.MotivoInventario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "H005"),
    @Field(name = "dtInv"),
    @Field(name = "vlInv"),
    @Field(name = "motInv"),
    @Field(name = "regH010List")
})
public class RegH005 {

    private Date dtInv;
    private Double vlInv;
    private MotivoInventario motInv;
    private List<RegH010> regH010List;

    public Date getDtInv() {
        return dtInv;
    }

    public void setDtInv(Date dtInv) {
        this.dtInv = dtInv;
    }

    public Double getVlInv() {
        return vlInv;
    }

    public void setVlInv(Double vlInv) {
        this.vlInv = vlInv;
    }

    public MotivoInventario getMotInv() {
        return motInv;
    }

    public void setMotInv(MotivoInventario motInv) {
        this.motInv = motInv;
    }

    public List<RegH010> getRegH010List() {
        return regH010List;
    }

    public void setRegH010List(List<RegH010> regH010List) {
        this.regH010List = regH010List;
    }
}

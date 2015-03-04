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
    @Field(name = "", id=true, constantValue = "C172"),
    @Field(name = "vlBcIssqn"),
    @Field(name = "aliqIssqn"),
    @Field(name = "vlIssqn")
})
public class RegC172 {

    private Double vlBcIssqn;
    private Double aliqIssqn;
    private Double vlIssqn;
    
    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public Double getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(Double aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public Double getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(Double vlIssqn) {
        this.vlIssqn = vlIssqn;
    }
}

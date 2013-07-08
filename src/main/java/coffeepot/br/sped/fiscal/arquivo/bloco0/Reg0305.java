/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
    @Field(name = "reg", constantValue = "0305"),
    @Field(name = "codCcus"),
    @Field(name = "func"),
    @Field(name = "vidaUtil")
})
public class Reg0305 {
    private String codCcus;
    private String func;
    private Integer vidaUtil;

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public Integer getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Integer vidaUtil) {
        this.vidaUtil = vidaUtil;
    }        
}

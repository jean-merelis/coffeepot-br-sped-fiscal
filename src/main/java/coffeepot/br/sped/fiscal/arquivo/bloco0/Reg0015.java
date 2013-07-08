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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0015"),
    @Field(name = "ufSt"),
    @Field(name = "ieSt", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY})
})
public class Reg0015 {

    private String ufSt;
    private String ieSt;

    public String getUfSt() {
        return ufSt;
    }

    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
    }

    public String getIeSt() {
        return ieSt;
    }

    public void setIeSt(String ieSt) {
        this.ieSt = ieSt;
    }
}

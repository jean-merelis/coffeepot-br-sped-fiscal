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
    @Field(name = "", constantValue = "C177"),
    @Field(name = "codSeloIpi"),
    @Field(name = "qtSeloIpi")
})
public class RegC177 {

    private String codSeloIpi;
    private Long qtSeloIpi;

    public String getCodSeloIpi() {
        return codSeloIpi;
    }

    public void setCodSeloIpi(String codSeloIpi) {
        this.codSeloIpi = codSeloIpi;
    }

    public Long getQtSeloIpi() {
        return qtSeloIpi;
    }

    public void setQtSeloIpi(Long qtSeloIpi) {
        this.qtSeloIpi = qtSeloIpi;
    }
}

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.List;

/**
 * Bloco H - Inventário Físico.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regH001"),
    @Field(name = "regH005List"),
    @Field(name = "regH990")
})
public class BlocoH {

    private RegH001 regH001;
    private List<RegH005> regH005List;
    private RegH990 regH990;

    public RegH001 getRegH001() {
        return regH001;
    }

    public void setRegH001(RegH001 regH001) {
        this.regH001 = regH001;
    }

    public List<RegH005> getRegH005List() {
        return regH005List;
    }

    public void setRegH005List(List<RegH005> regH005List) {
        this.regH005List = regH005List;
    }

    public RegH990 getRegH990() {
        return regH990;
    }

    public void setRegH990(RegH990 regH990) {
        this.regH990 = regH990;
    }
}

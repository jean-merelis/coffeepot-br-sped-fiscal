/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import java.util.List;

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
import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class RegC110 {

    private String codInf;
    private String txtCompl;
    private List<RegC111> regC111List;
    private List<RegC112> regC112List;
    private List<RegC113> regC113List;
    private List<RegC114> regC114List;
    private List<RegC115> regC115List;
    private List<RegC116> regC116List;

}

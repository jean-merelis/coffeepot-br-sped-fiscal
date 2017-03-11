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
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C405"),
    @Field(name = "dtDoc"),
    @Field(name = "cro"),
    @Field(name = "crz"),
    @Field(name = "numCooFin"),
    @Field(name = "gtFin"),
    @Field(name = "vlBrt"),
    //--
    @Field(name = "regC410"),
    @Field(name = "regC420List"),
    @Field(name = "regC460List"),
    @Field(name = "regC490List")
})
@Getter
@Setter
public class RegC405 {

    private Date dtDoc;
    private Integer cro;
    private Integer crz;
    private Integer numCooFin;
    private Double gtFin;
    private Double vlBrt;
    //--
    private RegC410 regC410;
    private List<RegC420> regC420List;
    private List<RegC460> regC460List;
    private List<RegC490> regC490List;
    
}

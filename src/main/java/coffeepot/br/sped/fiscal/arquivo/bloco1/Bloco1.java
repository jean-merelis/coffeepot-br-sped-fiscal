/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
 * Bloco 1 - Outras Informações.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg1001"),
    @Field(name = "reg1010"),
    //TODO: Registros Bloco 1 ainda não implementados

    //    @Field(name = "reg1100List"),
    //    @Field(name = "reg1200List"),
    //    @Field(name = "reg1300List"),
    //    @Field(name = "reg1350List"),
    //    @Field(name = "reg1390List"),
    //    @Field(name = "reg1400List"),
    //    @Field(name = "reg1500List"),
    @Field(name = "reg1600List"),
    //    @Field(name = "reg1700List"),
    //    @Field(name = "reg1800"),
    //    @Field(name = "reg1900List"),
    @Field(name = "reg1990")
})
@Getter
@Setter
public class Bloco1 {

    private Reg1001 reg1001;
    private Reg1010 reg1010;
    //TODO: Registros Bloco 1 ainda não implementados
//    private List<Reg1100> reg1100List;
//    private List<Reg1200> reg1200List;
//    private List<Reg1300> reg1300List;
//    private List<Reg1350> reg1350List;
//    private List<Reg1390> reg1390List;
//    private List<Reg1400> reg1400List;
//    private List<Reg1500> reg1500List;
    private List<Reg1600> reg1600List;
//    private List<Reg1700> reg1700List;
//    private Reg1800 reg1800;
//    private List<Reg1900> reg1900List;
    private Reg1990 reg1990;

}

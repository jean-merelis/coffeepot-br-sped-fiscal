/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
 * Bloco 0 - Abertura, Identificação e Referências.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg0000"),
    @Field(name = "reg0001"),
    @Field(name = "reg0005"),
    @Field(name = "reg0015List"),
    @Field(name = "reg0100"),
    @Field(name = "reg0150List"),
    @Field(name = "reg0190List"),
    @Field(name = "reg0200List"),
    @Field(name = "reg0300List"),
    @Field(name = "reg0400List"),
    @Field(name = "reg0450List"),
    @Field(name = "reg0460List"),
    @Field(name = "reg0500List"),
    @Field(name = "reg0600List"),
    @Field(name = "reg0990")
})
@Getter
@Setter
public class Bloco0 {

    private Reg0000 reg0000;
	private Reg0001 reg0001;
    private Reg0005 reg0005;
    private List<Reg0015> reg0015List;
    private Reg0100 reg0100;
    private List<Reg0150> reg0150List;
    private List<Reg0190> reg0190List;
    private List<Reg0200> reg0200List;
    private List<Reg0300> reg0300List;
    private List<Reg0400> reg0400List;
    private List<Reg0450> reg0450List;
    private List<Reg0460> reg0460List;
    private List<Reg0500> reg0500List;
    private List<Reg0600> reg0600List;
    private Reg0990 reg0990;

}

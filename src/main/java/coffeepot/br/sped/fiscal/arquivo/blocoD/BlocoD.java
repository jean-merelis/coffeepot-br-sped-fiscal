/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;

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
 * Bloco D - Documentos Fiscais II - Serviços (ICMS).
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regD001"),
    @Field(name = "regD100List"),
    //TODO: Registros Bloco D ainda não implementados
    //    @Field(name = "regD300List"),
    //    @Field(name = "regD350List"),
    //    @Field(name = "regD400List"),
    //    @Field(name = "regD500List"),
    //    @Field(name = "regD600List"),
    //    @Field(name = "regD695List"),
    @Field(name = "regD990")
})
@Getter
@Setter
public class BlocoD {

    private RegD001 regD001;
    private List<RegD100> regD100List;
    //TODO: Registros Bloco D ainda não implementados
//    private List<RegD300> regD300List;
//    private List<RegD350> regD350List;
//    private List<RegD400> regD400List;
//    private List<RegD500> regD500List;
//    private List<RegD600> regD600List;
//    private List<RegD695> regD695List;
    private RegD990 regD990;

}

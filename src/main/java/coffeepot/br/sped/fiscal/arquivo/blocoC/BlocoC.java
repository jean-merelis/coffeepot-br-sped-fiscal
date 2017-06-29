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
 * Bloco C - Documentos Fiscais I  - Mercadorias (ICMS/IPI).
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regC001"),
    @Field(name = "regC100List"),
    @Field(name = "regC300List"),
    @Field(name = "regC350List"),
    @Field(name = "regC400List"),
    @Field(name = "regC495List"),
    @Field(name = "regC860List"),
    //TODO: Registros Bloco C ainda não implementados
    //    @Field(name = "regC500List"),
    //    @Field(name = "regC600List"),
    //    @Field(name = "regC700List"),
    //    @Field(name = "regC800List"),
    @Field(name = "regC990")
})
@Getter
@Setter
public class BlocoC {

    private RegC001 regC001;
    private List<RegC100> regC100List;
    private List<RegC300> regC300List;
    private List<RegC350> regC350List;
    private List<RegC400> regC400List;
    private List<RegC495> regC495List;
    private List<RegC860> regC860List;
    //TODO: Registros Bloco C ainda não implementados
//    private List<RegC500> regC500List;
//    private List<RegC600> regC600List;
//    private List<RegC700> regC700List;
//    private List<RegC800> regC800List;
    private RegC990 regC990;
    
}

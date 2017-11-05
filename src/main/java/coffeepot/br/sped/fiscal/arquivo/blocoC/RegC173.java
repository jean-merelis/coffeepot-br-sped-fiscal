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
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id = true, constantValue = "C173"),
    @Field(name = "loteMed"),
    @Field(name = "qtdItem"),
    @Field(name = "dtFab"),
    @Field(name = "dtVal"),
    @Field(name = "indMed"),
    @Field(name = "tpProd"),
    @Field(name = "vlTabMax")
})
@Getter
@Setter
public class RegC173 {

    private String loteMed;
    private Double qtdItem;
    private LocalDate dtFab;
    private LocalDate dtVal;
    private String indMed;
    private String tpProd;
    private Double vlTabMax;

}

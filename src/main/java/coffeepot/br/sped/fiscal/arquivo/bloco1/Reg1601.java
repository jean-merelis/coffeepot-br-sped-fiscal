/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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


@Record(fields = {
    @Field(name = "", id=true, constantValue = "1601"),
    @Field(name = "codPartIp", maxLength = 60),
    @Field(name = "codPartIt", maxLength = 60, required = false),
    @Field(name = "totVs"),
    @Field(name = "totIss"),
    @Field(name = "totOutros")
})
@Getter
@Setter
public class Reg1601 {

	private String codPartIp;
	private String codPartIt;
    private Double totVs;
    private Double totIss;
    private Double totOutros;

}

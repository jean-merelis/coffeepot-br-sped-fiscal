package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2017 Jeandeson O. Merelis
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
import coffeepot.bean.wr.types.Align;
import lombok.Getter;
import lombok.Setter;

@Record(fields = {
	    @Field(name = "reg", id=true, constantValue = "C890"),
	    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
	    @Field(name = "cfop"),
	    @Field(name = "aliqIcms"),
	    @Field(name = "vlOpr"),
	    @Field(name = "vlBcIcms"),
	    @Field(name = "vlIcms"),
	    @Field(name = "codObs")
})
@Getter
@Setter
public class RegC890 {
	
	private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;
    private Double vlOpr;
    private Double vlBcIcms;
    private Double vlIcms;
    private String codObs;
    
}

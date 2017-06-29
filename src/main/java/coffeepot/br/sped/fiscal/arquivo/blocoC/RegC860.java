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

import java.util.Date;
import java.util.List;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import lombok.Getter;
import lombok.Setter;

@Record(fields = {
	    @Field(name = "reg", id=true, constantValue = "C860"),
	    @Field(name = "codMod"),
	    @Field(name = "nrSat", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
	    @Field(name = "dtDoc"),
	    @Field(name = "docIni"),
	    @Field(name = "docFim"),
	    //--
	    @Field(name = "regC890List")
})
@Getter
@Setter
public class RegC860 {
	
	private DocumentoFiscal codMod;
	private String nrSat;
	private Date dtDoc;
	private Integer docIni;
    private Integer docFim;
	//--
    private List<RegC890> regC890List;
    
}

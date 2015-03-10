/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

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
import java.util.List;

/**
 * Bloco E - Apuração do ICMS e do IPI.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regE001"),
    @Field(name = "regE100List"),
    //TODO: Registros Bloco E ainda não implementados
    //    @Field(name = "regE200List"),
    //    @Field(name = "regE500List"),
    @Field(name = "regE990")
})
public class BlocoE {

    private RegE001 regE001;
    private List<RegE100> regE100List;
    //TODO: Registros Bloco E ainda não implementados
//    private List<RegE200> regE200List;
//    private List<RegE500> regE500List;
    private RegE990 regE990;

    public RegE001 getRegE001() {
        return regE001;
    }

    public void setRegE001(RegE001 regE001) {
        this.regE001 = regE001;
    }

    public RegE990 getRegE990() {
        return regE990;
    }

    public void setRegE990(RegE990 regE990) {
        this.regE990 = regE990;
    }

	public List<RegE100> getRegE100List() {
		return regE100List;
	}

	public void setRegE100List(List<RegE100> regE100List) {
		this.regE100List = regE100List;
	}
    
}

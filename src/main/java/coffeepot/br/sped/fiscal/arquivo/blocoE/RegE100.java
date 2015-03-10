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


import java.util.Date;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E100"),
    @Field(name = "dtIni"),
    @Field(name = "dtFin"),
    @Field(name = "regE110")
})
public class RegE100{
    private Date dtIni;
    private Date dtFin;
    private RegE110 regE110;
    
    public Date getDtIni(){
    	return dtIni;
    }
    public void setDtIni(Date dtIni){
    	this.dtIni = dtIni;
    }
    public Date getDtFin(){
    	return dtFin;
    }
    public void setDtFin(Date dtFin){
    	this.dtFin = dtFin;
    }
	public RegE110 getRegE110() {
		return regE110;
	}
	public void setRegE110(RegE110 regE110) {
		this.regE110 = regE110;
	}
    
}

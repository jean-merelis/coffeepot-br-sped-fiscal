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


import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.arquivo.RegAberturaBlocoBase;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", classType = String.class),
    @Field(name = "indMov", classType = Enum.class)
})
public class RegE001 extends RegAberturaBlocoBase {

    public RegE001() {
        this.reg = "E001";
    }

    public RegE001(IndicadorMovimento indMov) {
        this.reg = "E001";
        this.indMov = indMov;
    }
}

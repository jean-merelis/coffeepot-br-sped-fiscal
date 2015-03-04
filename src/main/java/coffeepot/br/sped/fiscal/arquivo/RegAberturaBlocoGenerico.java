package coffeepot.br.sped.fiscal.arquivo;

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
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

@Record( accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id=true, classType = String.class),
    @Field(name = "indMov")
})
public class RegAberturaBlocoGenerico extends RegAberturaBlocoBase {

    public RegAberturaBlocoGenerico() {
    }

    public RegAberturaBlocoGenerico(String reg, IndicadorMovimento indMov) {
        this.reg = reg;
        this.indMov = indMov;
    }

    @Override
    public void setReg(String reg) {
        super.setReg(reg);
    }
}

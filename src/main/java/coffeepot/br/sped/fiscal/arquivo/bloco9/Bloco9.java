/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

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
import java.util.List;

/**
 * Bloco 9 - Controle e Encerramento do Arquivo Digital.
 *
 * @author Jeandeson O. Merelis 
 */
@Record(fields = {
    @Field(name = "reg9001"),
    @Field(name = "reg9900List"),
    @Field(name = "reg9990"),
    @Field(name = "reg9999")
})
public class Bloco9 {

    private Reg9001 reg9001;
    private List<Reg9900> reg9900List;
    private Reg9990 reg9990;
    private Reg9999 reg9999;

    public Reg9001 getReg9001() {
        return reg9001;
    }

    public void setReg9001(Reg9001 reg9001) {
        this.reg9001 = reg9001;
    }

    public List<Reg9900> getReg9900List() {
        return reg9900List;
    }

    public void setReg9900List(List<Reg9900> reg9900List) {
        this.reg9900List = reg9900List;
    }

    public Reg9990 getReg9990() {
        return reg9990;
    }

    public void setReg9990(Reg9990 reg9990) {
        this.reg9990 = reg9990;
    }

    public Reg9999 getReg9999() {
        return reg9999;
    }

    public void setReg9999(Reg9999 reg9999) {
        this.reg9999 = reg9999;
    }
}

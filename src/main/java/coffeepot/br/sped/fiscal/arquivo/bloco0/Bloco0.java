/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
 * Bloco 0 - Abertura, Identificação e Referências.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg0000"),
    @Field(name = "reg0001"),
    @Field(name = "reg0005"),
    @Field(name = "reg0015List"),
    @Field(name = "reg0100"),
    @Field(name = "reg0150List"),
    @Field(name = "reg0190List"),
    @Field(name = "reg0200List"),
    @Field(name = "reg0300List"),
    @Field(name = "reg0400List"),
    @Field(name = "reg0450List"),
    @Field(name = "reg0460List"),
    @Field(name = "reg0500List"),
    @Field(name = "reg0600List"),
    @Field(name = "reg0990")
})
public class Bloco0 {

    private Reg0000 reg0000;
    private Reg0001 reg0001;
    private Reg0005 reg0005;
    private List<Reg0015> reg0015List;
    private Reg0100 reg0100;
    private List<Reg0150> reg0150List;
    private List<Reg0190> reg0190List;
    private List<Reg0200> reg0200List;
    private List<Reg0300> reg0300List;
    private List<Reg0400> reg0400List;
    private List<Reg0450> reg0450List;
    private List<Reg0460> reg0460List;
    private List<Reg0500> reg0500List;
    private List<Reg0600> reg0600List;
    private Reg0990 reg0990;

    public Reg0000 getReg0000() {
        return reg0000;
    }

    public void setReg0000(Reg0000 reg0000) {
        this.reg0000 = reg0000;
    }

    public Reg0001 getReg0001() {
        return reg0001;
    }

    public void setReg0001(Reg0001 reg0001) {
        this.reg0001 = reg0001;
    }

    public Reg0005 getReg0005() {
        return reg0005;
    }

    public void setReg0005(Reg0005 reg0005) {
        this.reg0005 = reg0005;
    }

    public List<Reg0015> getReg0015List() {
        return reg0015List;
    }

    public void setReg0015List(List<Reg0015> reg0015List) {
        this.reg0015List = reg0015List;
    }

    public Reg0100 getReg0100() {
        return reg0100;
    }

    public void setReg0100(Reg0100 reg0100) {
        this.reg0100 = reg0100;
    }

    public List<Reg0150> getReg0150List() {
        return reg0150List;
    }

    public void setReg0150List(List<Reg0150> reg0150List) {
        this.reg0150List = reg0150List;
    }

    public List<Reg0190> getReg0190List() {
        return reg0190List;
    }

    public void setReg0190List(List<Reg0190> reg0190List) {
        this.reg0190List = reg0190List;
    }

    public List<Reg0200> getReg0200List() {
        return reg0200List;
    }

    public void setReg0200List(List<Reg0200> reg0200List) {
        this.reg0200List = reg0200List;
    }

    public List<Reg0300> getReg0300List() {
        return reg0300List;
    }

    public void setReg0300List(List<Reg0300> reg0300List) {
        this.reg0300List = reg0300List;
    }

    public List<Reg0400> getReg0400List() {
        return reg0400List;
    }

    public void setReg0400List(List<Reg0400> reg0400List) {
        this.reg0400List = reg0400List;
    }

    public List<Reg0450> getReg0450List() {
        return reg0450List;
    }

    public void setReg0450List(List<Reg0450> reg0450List) {
        this.reg0450List = reg0450List;
    }

    public List<Reg0460> getReg0460List() {
        return reg0460List;
    }

    public void setReg0460List(List<Reg0460> reg0460List) {
        this.reg0460List = reg0460List;
    }

    public List<Reg0500> getReg0500List() {
        return reg0500List;
    }

    public void setReg0500List(List<Reg0500> reg0500List) {
        this.reg0500List = reg0500List;
    }

    public List<Reg0600> getReg0600List() {
        return reg0600List;
    }

    public void setReg0600List(List<Reg0600> reg0600List) {
        this.reg0600List = reg0600List;
    }

    public Reg0990 getReg0990() {
        return reg0990;
    }

    public void setReg0990(Reg0990 reg0990) {
        this.reg0990 = reg0990;
    }
}

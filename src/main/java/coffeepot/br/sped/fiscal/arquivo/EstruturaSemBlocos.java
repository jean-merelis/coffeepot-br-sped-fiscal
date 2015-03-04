/*
 * Copyright 2015 Jeandeson O. Merelis.
 *
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
 */
package coffeepot.br.sped.fiscal.arquivo;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2015 Jeandeson O. Merelis
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
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0000;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0001;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0005;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0015;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0100;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0150;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0190;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0200;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0300;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0400;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0450;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0460;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0500;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0600;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0990;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1010;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9001;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9900;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9999;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC001;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC100;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC300;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC350;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC400;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC495;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC990;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD001;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD990;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE001;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE990;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG001;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG990;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH001;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH005;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH990;
import java.util.List;

/**
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
    @Field(name = "reg0990"),
    //
    //bloco C
    @Field(name = "regC001"),
    @Field(name = "regC100List"),
    @Field(name = "regC300List"),
    @Field(name = "regC350List"),
    @Field(name = "regC400List"),
    @Field(name = "regC495List"),
    //TODO: Registros Bloco C ainda não implementados
    //    @Field(name = "regC500List"),
    //    @Field(name = "regC600List"),
    //    @Field(name = "regC700List"),
    //    @Field(name = "regC800List"),
    //    @Field(name = "regC860List"),              
    @Field(name = "regC990"),
    //
    //bloco D
    @Field(name = "regD001"),
    //TODO: Registros Bloco D ainda não implementados
    //    @Field(name = "regD100List"),
    //    @Field(name = "regD300List"),
    //    @Field(name = "regD350List"),
    //    @Field(name = "regD400List"),
    //    @Field(name = "regD500List"),
    //    @Field(name = "regD600List"),
    //    @Field(name = "regD695List"),
    @Field(name = "regD990"),
    //
    //bloco E
    @Field(name = "regE001"),
    //TODO: Registros Bloco E ainda não implementados
    //    @Field(name = "regE100List"),
    //    @Field(name = "regE200List"),
    //    @Field(name = "regE500List"),
    @Field(name = "regE990"),
    //
    //bloco G
    @Field(name = "regG001"),
    //TODO: Registros Bloco G ainda não implementados
    //    @Field(name = "regG110List"),
    @Field(name = "regG990"),
    //
    //bloco H
    @Field(name = "regH001"),
    @Field(name = "regH005List"),
    @Field(name = "regH990"),
    //
    //bloco 1
    @Field(name = "reg1001"),
    @Field(name = "reg1010"),
    //TODO: Registros Bloco 1 ainda não implementados
    //    @Field(name = "reg1100List"),
    //    @Field(name = "reg1200List"),
    //    @Field(name = "reg1300List"),
    //    @Field(name = "reg1350List"),
    //    @Field(name = "reg1390List"),
    //    @Field(name = "reg1400List"),
    //    @Field(name = "reg1500List"),
    //    @Field(name = "reg1600List"),
    //    @Field(name = "reg1700List"),
    //    @Field(name = "reg1800"),
    //    @Field(name = "reg1900List"),
    @Field(name = "reg1990"),
    //
    //bloco 9
    @Field(name = "reg9001"),
    @Field(name = "reg9900List"),
    @Field(name = "reg9990"),
    @Field(name = "reg9999")
})
public class EstruturaSemBlocos {

    //bloco 0
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

    /// bloco 1
    private Reg1001 reg1001;
    private Reg1010 reg1010;
    //TODO: Registros Bloco 1 ainda não implementados
//    private List<Reg1100> reg1100List;
//    private List<Reg1200> reg1200List;
//    private List<Reg1300> reg1300List;
//    private List<Reg1350> reg1350List;
//    private List<Reg1390> reg1390List;
//    private List<Reg1400> reg1400List;
//    private List<Reg1500> reg1500List;
//    private List<Reg1600> reg1600List;
//    private List<Reg1700> reg1700List;
//    private Reg1800 reg1800;
//    private List<Reg1900> reg1900List;
    private Reg1990 reg1990;

    // bloco 9    
    private Reg9001 reg9001;
    private List<Reg9900> reg9900List;
    private Reg9990 reg9990;
    private Reg9999 reg9999;

    // blocoC
    private RegC001 regC001;
    private List<RegC100> regC100List;
    private List<RegC300> regC300List;
    private List<RegC350> regC350List;
    private List<RegC400> regC400List;
    private List<RegC495> regC495List;
    //TODO: Registros Bloco C ainda não implementados
//    private List<RegC500> regC500List;
//    private List<RegC600> regC600List;
//    private List<RegC700> regC700List;
//    private List<RegC800> regC800List;
//    private List<RegC860> regC860List;              
    private RegC990 regC990;

    //bloco D
    private RegD001 regD001;
    //TODO: Registros Bloco D ainda não implementados
//    private List<RegD100> regD100List;
//    private List<RegD300> regD300List;
//    private List<RegD350> regD350List;
//    private List<RegD400> regD400List;
//    private List<RegD500> regD500List;
//    private List<RegD600> regD600List;
//    private List<RegD695> regD695List;        
    private RegD990 regD990;

    //bloco E
    private RegE001 regE001;
    //TODO: Registros Bloco E ainda não implementados
//    private List<RegE100> regE100List;
//    private List<RegE200> regE200List;
//    private List<RegE500> regE500List;
    private RegE990 regE990;

    //bloco G
    private RegG001 regG001;
    //TODO: Registros Bloco G ainda não implementados
//    private List<RegG110> regG110List;
    private RegG990 regG990;

    //bloco H
    private RegH001 regH001;
    private List<RegH005> regH005List;
    private RegH990 regH990;

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

    public Reg1001 getReg1001() {
        return reg1001;
    }

    public void setReg1001(Reg1001 reg1001) {
        this.reg1001 = reg1001;
    }

    public Reg1010 getReg1010() {
        return reg1010;
    }

    public void setReg1010(Reg1010 reg1010) {
        this.reg1010 = reg1010;
    }

    public Reg1990 getReg1990() {
        return reg1990;
    }

    public void setReg1990(Reg1990 reg1990) {
        this.reg1990 = reg1990;
    }

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

    public RegC001 getRegC001() {
        return regC001;
    }

    public void setRegC001(RegC001 regC001) {
        this.regC001 = regC001;
    }

    public List<RegC100> getRegC100List() {
        return regC100List;
    }

    public void setRegC100List(List<RegC100> regC100List) {
        this.regC100List = regC100List;
    }

    public List<RegC300> getRegC300List() {
        return regC300List;
    }

    public void setRegC300List(List<RegC300> regC300List) {
        this.regC300List = regC300List;
    }

    public List<RegC350> getRegC350List() {
        return regC350List;
    }

    public void setRegC350List(List<RegC350> regC350List) {
        this.regC350List = regC350List;
    }

    public List<RegC400> getRegC400List() {
        return regC400List;
    }

    public void setRegC400List(List<RegC400> regC400List) {
        this.regC400List = regC400List;
    }

    public List<RegC495> getRegC495List() {
        return regC495List;
    }

    public void setRegC495List(List<RegC495> regC495List) {
        this.regC495List = regC495List;
    }

    public RegC990 getRegC990() {
        return regC990;
    }

    public void setRegC990(RegC990 regC990) {
        this.regC990 = regC990;
    }

    public RegD001 getRegD001() {
        return regD001;
    }

    public void setRegD001(RegD001 regD001) {
        this.regD001 = regD001;
    }

    public RegD990 getRegD990() {
        return regD990;
    }

    public void setRegD990(RegD990 regD990) {
        this.regD990 = regD990;
    }

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

    public RegG001 getRegG001() {
        return regG001;
    }

    public void setRegG001(RegG001 regG001) {
        this.regG001 = regG001;
    }

    public RegG990 getRegG990() {
        return regG990;
    }

    public void setRegG990(RegG990 regG990) {
        this.regG990 = regG990;
    }

    public RegH001 getRegH001() {
        return regH001;
    }

    public void setRegH001(RegH001 regH001) {
        this.regH001 = regH001;
    }

    public List<RegH005> getRegH005List() {
        return regH005List;
    }

    public void setRegH005List(List<RegH005> regH005List) {
        this.regH005List = regH005List;
    }

    public RegH990 getRegH990() {
        return regH990;
    }

    public void setRegH990(RegH990 regH990) {
        this.regH990 = regH990;
    }
    
    
    
}

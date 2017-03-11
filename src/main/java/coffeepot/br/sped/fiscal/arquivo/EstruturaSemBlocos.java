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
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE100;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE990;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG001;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG990;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH001;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH005;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH990;
import lombok.Getter;
import lombok.Setter;

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
    @Field(name = "regE100List"),
    //TODO: Registros Bloco E ainda não implementados
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
@Getter
@Setter
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
    private List<RegE100> regE100List;
    //TODO: Registros Bloco E ainda não implementados
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

}

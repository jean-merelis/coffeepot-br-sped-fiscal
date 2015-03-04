/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoG;

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
 * Bloco G - Controle do Crédito de ICMS do Ativo Permanente - CIAP - modelos
 * "C" e "D".
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regG001"),
    //TODO: Registros Bloco G ainda não implementados
    //    @Field(name = "regG110List"),
    @Field(name = "regG990")
})
public class BlocoG {

    private RegG001 regG001;
    //TODO: Registros Bloco G ainda não implementados
//    private List<RegG110> regG110List;
    private RegG990 regG990;

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
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import java.util.List;

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
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.TipoTituloCredito;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C140"),
    @Field(name = "indEmit"),
    @Field(name = "indTit"),
    @Field(name = "descTit"),
    @Field(name = "numTit"),
    @Field(name = "qtdParc"),
    @Field(name = "vlTit"),
    //---
    @Field(name = "regC141List")
})
@Getter
@Setter
public class RegC140 {

    private EmissaoDocumento indEmit;
    private TipoTituloCredito indTit;
    private String descTit;
    private String numTit;
    private Integer qtdParc;
    private Double vlTit;
    //---
    private List<RegC141> regC141List;

}

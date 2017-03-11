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
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "0500"),
    @Field(name = "dtAlt"),
    @Field(name = "codNatCc"),
    @Field(name = "indCta"),
    @Field(name = "nivel"),
    @Field(name = "codCta"),
    @Field(name = "nomeCta")
})
@Getter
@Setter
public class Reg0500 {

    private Date dtAlt;
    private NaturezaContaContabil codNatCc;
    private TipoContaContabil indCta;
    private Integer nivel;
    private String codCta;
    private String nomeCta;

}

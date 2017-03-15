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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "0200"),
    @Field(name = "codItem"),
    @Field(name = "descrItem"),
    @Field(name = "codBarra"),
    @Field(name = "codAntItem"),
    @Field(name = "unidInv"),
    @Field(name = "tipoItem"),
    @Field(name = "codNcm", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "exIpi"),
    @Field(name = "codGen", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codLst"),
    @Field(name = "aliqIcms"),
    @Field(name = "cest"),
    @Field(name = "reg0205List"),
    @Field(name = "reg0206"),
    @Field(name = "reg0220List")
})
@Getter
@Setter
public class Reg0200 {

    private String codItem;
    private String descrItem;
    private String codBarra;
    private String codAntItem;
    private String unidInv;
    private String tipoItem;
    private String codNcm;
    private String exIpi;
    private String codGen;
    private String codLst;
    private Double aliqIcms;
    private String cest;
    private List<Reg0205> reg0205List;
    private Reg0206 reg0206;
    private List<Reg0220> reg0220List;

}

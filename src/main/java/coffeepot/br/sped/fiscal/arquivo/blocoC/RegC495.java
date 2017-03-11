/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C495"),
    @Field(name = "aliqIcms"),
    @Field(name = "codItem"),
    @Field(name = "qtd"),
    @Field(name = "qtdCanc"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "vlCanc"),
    @Field(name = "vlAcmo"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlIsen"),
    @Field(name = "vlNt"),
    @Field(name = "vlIcmsSt")
})
@Getter
@Setter
public class RegC495 {

    private Double aliqIcms;
    private String codItem;
    private Double qtd;
    private Double qtdCanc;
    private String unid;
    private Double vlItem;
    private Double vlDesc;
    private Double vlCanc;
    private Double vlAcmo;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlIsen;
    private Double vlNt;
    private Double vlIcmsSt;

}

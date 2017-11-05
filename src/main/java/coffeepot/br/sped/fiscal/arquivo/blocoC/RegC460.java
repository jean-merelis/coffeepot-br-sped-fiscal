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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C460"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "cpfCnpj"),
    @Field(name = "nomAdq"),
    //--
    @Field(name = "regC465"),
    @Field(name = "regC470List")
})
@Getter
@Setter
public class RegC460 {

    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private Integer numDoc;
    private LocalDate dtDoc;
    private Double vlDoc;
    private Double vlPis;
    private Double vlCofins;
    private String cpfCnpj;
    private String nomAdq;
    //--
    private RegC465 regC465;
    private List<RegC470> regC470List;

}

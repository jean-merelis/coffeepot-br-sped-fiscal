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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C112"),
    @Field(name = "codDa"),
    @Field(name = "uf"),
    @Field(name = "numDa"),
    @Field(name = "codAut"),
    @Field(name = "vlDa"),
    @Field(name = "dtVcto"),
    @Field(name = "dtPgto")
})
@Getter
@Setter
public class RegC112 {

    private DocumentoArrecadacao codDa;
    private String uf;
    private String numDa;
    private String codAut;
    private Double vlDa;
    private LocalDate dtVcto;
    private LocalDate dtPgto;

    public enum DocumentoArrecadacao implements EnumCodificado {

        ESTADUAL("0"),
        GNRE("1");

        private final String codigo;

        private DocumentoArrecadacao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }
}

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
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C120"),
    @Field( name = "codDocImp"),
    @Field( name = "numDocImp"),
    @Field( name = "pisImp"),
    @Field( name = "cofinsImp"),
    @Field( name = "numAcdraw")
})
public class RegC120 {

    private DocumentoImportacao codDocImp;
    private String numDocImp;
    private Double pisImp;
    private Double cofinsImp;
    private String numAcdraw;

    public DocumentoImportacao getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(DocumentoImportacao codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public Double getPisImp() {
        return pisImp;
    }

    public void setPisImp(Double pisImp) {
        this.pisImp = pisImp;
    }

    public Double getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(Double cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }       
}

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
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.TipoTituloCredito;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C140"),
    @Field(name = "indEmit"),
    @Field(name = "indTit"),
    @Field(name = "descTit"),
    @Field(name = "numTit"),
    @Field(name = "qtdParc"),
    @Field(name = "vlTit"),
    //---
    @Field(name = "regC141List")
})
public class RegC140 {

    private EmissaoDocumento indEmit;
    private TipoTituloCredito indTit;
    private String descTit;
    private String numTit;
    private Integer qtdParc;
    private Double vlTit;
    //---
    private List<RegC141> regC141List;

    public EmissaoDocumento getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(EmissaoDocumento indEmit) {
        this.indEmit = indEmit;
    }

    public TipoTituloCredito getIndTit() {
        return indTit;
    }

    public void setIndTit(TipoTituloCredito indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public Integer getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(Integer qtdParc) {
        this.qtdParc = qtdParc;
    }

    public Double getVlTit() {
        return vlTit;
    }

    public void setVlTit(Double vlTit) {
        this.vlTit = vlTit;
    }

    public List<RegC141> getRegC141List() {
        return regC141List;
    }

    public void setRegC141List(List<RegC141> regC141List) {
        this.regC141List = regC141List;
    }
}

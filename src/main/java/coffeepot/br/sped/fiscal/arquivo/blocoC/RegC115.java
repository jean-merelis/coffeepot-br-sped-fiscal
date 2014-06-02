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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.TipoTransporte;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C115"),
    @Field(name = "indCarga"),
    @Field(name = "cnpjCol", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ieCol", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "cpfCol", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codMunCol", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true),
    @Field(name = "cnpjEntg", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ieEntg", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "cpfEntg", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codMunEntg", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true)
})
public class RegC115 {

    private TipoTransporte indCarga;
    private String cnpjCol;
    private String ieCol;
    private String cpfCol;
    private Integer codMunCol;
    private String cnpjEntg;
    private String ieEntg;
    private String cpfEntg;
    private Integer codMunEntg;

    public TipoTransporte getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(TipoTransporte indCarga) {
        this.indCarga = indCarga;
    }

    public String getCnpjCol() {
        return cnpjCol;
    }

    public void setCnpjCol(String cnpjCol) {
        this.cnpjCol = cnpjCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public String getCpfCol() {
        return cpfCol;
    }

    public void setCpfCol(String cpfCol) {
        this.cpfCol = cpfCol;
    }

    public Integer getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(Integer codMunCol) {
        this.codMunCol = codMunCol;
    }

    public String getCnpjEntg() {
        return cnpjEntg;
    }

    public void setCnpjEntg(String cnpjEntg) {
        this.cnpjEntg = cnpjEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public String getCpfEntg() {
        return cpfEntg;
    }

    public void setCpfEntg(String cpfEntg) {
        this.cpfEntg = cpfEntg;
    }

    public Integer getCodMunEntg() {
        return codMunEntg;
    }

    public void setCodMunEntg(Integer codMunEntg) {
        this.codMunEntg = codMunEntg;
    }
}

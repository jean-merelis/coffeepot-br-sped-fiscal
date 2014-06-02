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
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C165"),
    @Field(name = "codPart"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codAut"),
    @Field(name = "nrPasse"),
    @Field(name = "hora", params = {"time"}),
    @Field(name = "temper"),
    @Field(name = "qtdVol"),
    @Field(name = "pesoBrt"),
    @Field(name = "pesoLiq"),
    @Field(name = "nomMot", maxLength = 60),
    @Field(name = "cpf", length = 11, padding = '0', align = Align.RIGHT, paddingIfNullOrEmpty = true, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ufId")
})
public class RegC165 {

    private String codPart;
    private String veicId;
    private String codAut;
    private String nrPasse;
    private Date hora;
    private Double temper;
    private Integer qtdVol;
    private Double pesoBrt;
    private Double pesoLiq;
    private String nomMot;
    private String cpf;
    private String ufId;
    
    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public String getNrPasse() {
        return nrPasse;
    }

    public void setNrPasse(String nrPasse) {
        this.nrPasse = nrPasse;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Double getTemper() {
        return temper;
    }

    public void setTemper(Double temper) {
        this.temper = temper;
    }

    public Integer getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(Integer qtdVol) {
        this.qtdVol = qtdVol;
    }

    public Double getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(Double pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public Double getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(Double pesoLiq) {
        this.pesoLiq = pesoLiq;
    }

    public String getNomMot() {
        return nomMot;
    }

    public void setNomMot(String nomMot) {
        this.nomMot = nomMot;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
}

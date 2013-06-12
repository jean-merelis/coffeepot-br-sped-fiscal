/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C160"),
    @Field(name = "codPart"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "qtdVol"),
    @Field(name = "pesoBrt"),
    @Field(name = "pesoLiq"),
    @Field(name = "ufId")
})
public class RegC160 {

    private String codPart;
    private String veicId;
    private Integer qtdVol;
    private Double pesoBrt;
    private Double pesoLiq;
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

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
}

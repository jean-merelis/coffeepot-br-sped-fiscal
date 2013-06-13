/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoH;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "H020"),
    @Field(name = "cstIcms"),
    @Field(name = "bcIcms"),
    @Field(name = "vlIcms")
})
public class RegH020 {

    private String cstIcms;
    private Double bcIcms;
    private Double vlIcms;

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Double getBcIcms() {
        return bcIcms;
    }

    public void setBcIcms(Double bcIcms) {
        this.bcIcms = bcIcms;
    }

    public Double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
}

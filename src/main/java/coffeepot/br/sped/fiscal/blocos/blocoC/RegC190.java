/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.Align;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C190"),
    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlOpr"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "vlRedBc"),
    @Field(name = "vlIpi"),
    @Field(name = "codObs")
})
public class RegC190 {

    private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;
    private Double vlOpr;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private Double vlRedBc;
    private Double vlIpi;
    private String codObs;

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Double getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public Double getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(Double vlOpr) {
        this.vlOpr = vlOpr;
    }

    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public Double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public Double getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(Double vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public Double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C320"),
    @Field(name = "cstIcms"),
    @Field(name = "cfop"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlOpr"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlRedBc"),
    @Field(name = "codObs"),
    //--
    @Field(name = "regC321List")
})
public class RegC320 {

    private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;
    private Double vlOpr;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlRedBc;
    private String codObs;
    //--
    private List<RegC321> regC321List;

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

    public Double getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(Double vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public List<RegC321> getRegC321List() {
        return regC321List;
    }

    public void setRegC321List(List<RegC321> regC321List) {
        this.regC321List = regC321List;
    }
}

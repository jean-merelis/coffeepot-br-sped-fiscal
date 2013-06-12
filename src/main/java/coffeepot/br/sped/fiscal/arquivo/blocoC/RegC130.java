/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C130"),
    @Field(name = "vlServNt"),
    @Field(name = "vlBcIssqn"),
    @Field(name = "vlIssqn"),
    @Field(name = "vlBcIrrf"),
    @Field(name = "vlIrrf"),
    @Field(name = "vlBcPrev"),
    @Field(name = "vlPrev")
})
public class RegC130 {
    private Double vlServNt;
    private Double vlBcIssqn;
    private Double vlIssqn;
    private Double vlBcIrrf;
    private Double vlIrrf;
    private Double vlBcPrev;
    private Double vlPrev;

    public Double getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }

    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public Double getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(Double vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public Double getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(Double vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public Double getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(Double vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public Double getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(Double vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public Double getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(Double vlPrev) {
        this.vlPrev = vlPrev;
    }       
}

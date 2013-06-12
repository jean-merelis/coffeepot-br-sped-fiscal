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
    @Field(name = "", constantValue = "C172"),
    @Field(name = "vlBcIssqn"),
    @Field(name = "aliqIssqn"),
    @Field(name = "vlIssqn")
})
public class RegC172 {

    private Double vlBcIssqn;
    private Double aliqIssqn;
    private Double vlIssqn;

    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public Double getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(Double aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public Double getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(Double vlIssqn) {
        this.vlIssqn = vlIssqn;
    }
}

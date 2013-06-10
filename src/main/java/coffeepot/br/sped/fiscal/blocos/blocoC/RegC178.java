/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C178"),
    @Field(name = "clEnq"),
    @Field(name = "vlUnid"),
    @Field(name = "quantPad")
})
public class RegC178 {
    private String clEnq;
    private Double vlUnid;
    private Double quantPad;

    public String getClEnq() {
        return clEnq;
    }

    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }

    public Double getVlUnid() {
        return vlUnid;
    }

    public void setVlUnid(Double vlUnid) {
        this.vlUnid = vlUnid;
    }

    public Double getQuantPad() {
        return quantPad;
    }

    public void setQuantPad(Double quantPad) {
        this.quantPad = quantPad;
    }
}

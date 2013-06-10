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
    @Field(name = "", constantValue = "C310"),
    @Field(name = "numDocCanc")
})
public class RegC310 {

    private Integer numDocCanc;

    public Integer getNumDocCanc() {
        return numDocCanc;
    }

    public void setNumDocCanc(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;


/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0220"),
    @Field(name = "unidConv"),
    @Field(name = "fatConv")
})
public class Reg0220 {

    private String unidConv;
    private Double fatConv;

    public String getUnidConv() {
        return unidConv;
    }

    public void setUnidConv(String unidConv) {
        this.unidConv = unidConv;
    }

    public Double getFatConv() {
        return fatConv;
    }

    public void setFatConv(Double fatConv) {
        this.fatConv = fatConv;
    }

}

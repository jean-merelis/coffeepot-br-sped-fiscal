/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C141"),
    @Field(name = "numParc"),
    @Field(name = "dtVcto"),
    @Field(name = "vlParc")
})
public class RegC141 {

    private Integer numParc;
    private Date dtVcto;
    private Double vlParc;

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public Double getVlParc() {
        return vlParc;
    }

    public void setVlParc(Double vlParc) {
        this.vlParc = vlParc;
    }
}

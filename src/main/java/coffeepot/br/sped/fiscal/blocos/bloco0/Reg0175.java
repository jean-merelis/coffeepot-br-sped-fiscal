/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0175"),
    @Field(name = "dtAlt"),
    @Field(name = "nrCamp"),
    @Field(name = "contAnt")
})
public class Reg0175 {
    private Date dtAlt;
    private int nrCamp;
    private String contAnt;

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public int getNrCamp() {
        return nrCamp;
    }

    public void setNrCamp(int nrCamp) {
        this.nrCamp = nrCamp;
    }

    public String getContAnt() {
        return contAnt;
    }

    public void setContAnt(String contAnt) {
        this.contAnt = contAnt;
    }        
}

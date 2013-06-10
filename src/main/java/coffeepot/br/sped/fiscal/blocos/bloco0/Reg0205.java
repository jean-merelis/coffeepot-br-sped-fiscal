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
    @Field(name = "reg", constantValue = "0205"),
    @Field(name = "descrAntItem"),
    @Field(name = "dtIni"),
    @Field(name = "dtFim"),
    @Field(name = "codAntItem")
})
public class Reg0205 {

    private String descrAntItem;
    private Date dtIni;
    private Date dtFim;
    private String codAntItem;

    public String getDescrAntItem() {
        return descrAntItem;
    }

    public void setDescrAntItem(String descrAntItem) {
        this.descrAntItem = descrAntItem;
    }

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
}

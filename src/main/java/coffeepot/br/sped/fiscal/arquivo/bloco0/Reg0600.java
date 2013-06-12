/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0600"),
    @Field(name = "dtAlt"),
    @Field(name = "codCcus"),
    @Field(name = "ccus")
})
public class Reg0600 {
    private Date dtAlt;
    private String codCcus;
    private String ccus;

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
    }       
}

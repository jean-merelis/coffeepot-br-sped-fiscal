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
    @Field(name = "reg", constantValue = "0400"),
    @Field(name = "codNat"),
    @Field(name = "descrNat")
})
public class Reg0400 {
    private String codNat;
    private String descrNat;

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getDescrNat() {
        return descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
    }    
}

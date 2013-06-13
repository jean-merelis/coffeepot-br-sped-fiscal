/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "9900"),
    @Field(name = "regBlc"),
    @Field(name = "qtdRegBlc")
})
public class Reg9900 {

    private String regBlc;
    private Long qtdRegBlc;

    public String getRegBlc() {
        return regBlc;
    }

    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }

    public Long getQtdRegBlc() {
        return qtdRegBlc;
    }

    public void setQtdRegBlc(Long qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "0206"),
    @Field(name = "codComb")
})
public class Reg0206 {

    private String codComb;

    public String getCodComb() {
        return codComb;
    }

    public void setCodComb(String codComb) {
        this.codComb = codComb;
    }
}

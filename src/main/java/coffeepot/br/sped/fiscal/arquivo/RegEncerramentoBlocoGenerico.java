/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.AccessorType;

/**
 * Registro de encerramento de bloco.
 *
 * @author Jeandeson O. Merelis
 */
@Record(accessorType = AccessorType.PROPERTY,
        fields = {
    @Field(name = "reg", classType = String.class),
    @Field(name = "qtdLin", classType = Long.class)
})
public class RegEncerramentoBlocoGenerico extends RegEncerramentoBlocoBase {

    public RegEncerramentoBlocoGenerico() {
    }

    public RegEncerramentoBlocoGenerico(String reg, Long qtdLin) {
        this.reg = reg;
        this.qtdLin = qtdLin;
    }

    @Override
    public void setReg(String reg) {
        super.setReg(reg);
    }
}

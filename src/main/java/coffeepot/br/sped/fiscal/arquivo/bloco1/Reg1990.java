/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.arquivo.RegEncerramentoBlocoBase;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(accessorType = AccessorType.PROPERTY,
        fields = {
    @Field(name = "reg", classType = String.class),
    @Field(name = "qtdLin", classType = Long.class)
})
public class Reg1990 extends RegEncerramentoBlocoBase {

    public Reg1990() {
        this.reg = "1990";
    }

    public Reg1990(Long qtdLin) {
        this.reg = "1990";
        this.qtdLin = qtdLin;
    }
}

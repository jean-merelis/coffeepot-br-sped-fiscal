/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
public class Reg0990 extends RegEncerramentoBlocoBase {

    public Reg0990() {
        this.reg = "0990";
    }

    public Reg0990(Long qtdLin) {
        this.reg = "0990";
        this.qtdLin = qtdLin;
    }
}

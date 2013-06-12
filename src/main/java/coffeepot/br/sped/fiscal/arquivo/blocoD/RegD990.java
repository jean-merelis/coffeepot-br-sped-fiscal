/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;

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
public class RegD990 extends RegEncerramentoBlocoBase {

    public RegD990() {
        this.reg = "D990";
    }

    public RegD990(Long qtdLin) {
        this.reg = "D990";
        this.qtdLin = qtdLin;
    }
}

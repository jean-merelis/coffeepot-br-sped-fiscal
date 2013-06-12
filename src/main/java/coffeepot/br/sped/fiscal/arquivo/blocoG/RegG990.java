/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoG;

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
public class RegG990 extends RegEncerramentoBlocoBase {

    public RegG990() {
        this.reg = "G990";
    }

    public RegG990(Long qtdLin) {
        this.reg = "G990";
        this.qtdLin = qtdLin;
    }
}

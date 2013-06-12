/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.arquivo.RegAberturaBlocoBase;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", classType = String.class),
    @Field(name = "indMov", classType = Enum.class)
})
public class Reg9001 extends RegAberturaBlocoBase {

    public Reg9001() {
        this.reg = "9001";
    }

    public Reg9001(IndicadorMovimento indMov) {
        this.reg = "9001";
        this.indMov = indMov;
    }
}

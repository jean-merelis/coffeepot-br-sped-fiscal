/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoG;

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
public class RegG001 extends RegAberturaBlocoBase {

    public RegG001() {
        this.reg = "G001";
    }

    public RegG001(IndicadorMovimento indMov) {
        this.reg = "G001";
        this.indMov = indMov;
    }
}

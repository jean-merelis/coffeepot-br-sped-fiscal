/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
public class Reg1001 extends RegAberturaBlocoBase {

    public Reg1001() {
        this.reg = "1001";
    }

    public Reg1001(IndicadorMovimento indMov) {
        this.reg = "1001";
        this.indMov = indMov;
    }
}

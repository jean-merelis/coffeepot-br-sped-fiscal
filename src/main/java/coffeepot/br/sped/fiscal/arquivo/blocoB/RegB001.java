package coffeepot.br.sped.fiscal.arquivo.blocoB;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.arquivo.RegAberturaBlocoBase;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

@Record(accessorType = AccessorType.PROPERTY, fields = {
        @Field(name = "reg", id = true, constantValue="B001"),
        @Field(name = "indMov")
})
public class RegB001 extends RegAberturaBlocoBase {

    public RegB001() {
        this.reg = "B001";
    }

    public RegB001(IndicadorMovimento indMov) {
        this.reg = "B001";
        this.indMov = indMov;
    }
}

package coffeepot.br.sped.fiscal.arquivo;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

@Record( accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", classType = String.class),
    @Field(name = "indMov", classType = Enum.class)
})
public class RegAberturaBlocoGenerico extends RegAberturaBlocoBase {

    public RegAberturaBlocoGenerico() {
    }

    public RegAberturaBlocoGenerico(String reg, IndicadorMovimento indMov) {
        this.reg = reg;
        this.indMov = indMov;
    }

    @Override
    public void setReg(String reg) {
        super.setReg(reg);
    }
}

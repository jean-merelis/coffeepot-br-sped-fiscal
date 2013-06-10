package coffeepot.br.sped.fiscal.blocos;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

@Record(fields = {
    @Field(name = "reg"),
    @Field(name = "indMov")
})
public class RegIndicadorMovimento {

    private String reg;
    private IndicadorMovimento indMov;

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public IndicadorMovimento getIndMov() {
        return indMov;
    }

    public void setIndMov(IndicadorMovimento indMov) {
        this.indMov = indMov;
    }    
}

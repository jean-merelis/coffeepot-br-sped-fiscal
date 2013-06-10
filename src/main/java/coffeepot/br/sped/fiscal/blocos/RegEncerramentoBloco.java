package coffeepot.br.sped.fiscal.blocos;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

@Record(fields = {
    @Field(name = "reg"),
    @Field(name = "qtdLin")
})
public class RegEncerramentoBloco {

    private String reg;
    private Long qtdLin;

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public Long getQtdLin() {
        return qtdLin;
    }

    public void setQtdLin(Long qtdLin) {
        this.qtdLin = qtdLin;
    }
 
}

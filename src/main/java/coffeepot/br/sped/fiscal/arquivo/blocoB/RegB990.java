package coffeepot.br.sped.fiscal.arquivo.blocoB;


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.arquivo.RegEncerramentoBlocoBase;

@Record(accessorType = AccessorType.PROPERTY,
        fields = {
                @Field(name = "reg", id = true, constantValue="B990"),
                @Field(name = "qtdLin", classType = Long.class)
        })
public class RegB990 extends RegEncerramentoBlocoBase {

    public RegB990() {
        this.reg = "B990";
    }

    public RegB990(Long qtdLin) {
        this.reg = "B990";
        this.qtdLin = qtdLin;
    }
}

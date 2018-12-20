package coffeepot.br.sped.fiscal.arquivo.blocoB;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record(fields = {
        @Field(name = "regB001"),
        @Field(name = "regB990")
})
@Getter
@Setter
public class BlocoB {

    private RegB001 regB001;
    private RegB990 regB990;
}

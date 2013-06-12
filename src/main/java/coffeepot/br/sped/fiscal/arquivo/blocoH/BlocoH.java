/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoH;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco H - Inventário Físico.
 *
 * @author Jeandeson O. Merelis
 * @deprecated Embora seja possível gravarmos o Bloco inteiro utilizando apenas
 * uma instancia desta classe e a passando para o ObjectWriter escrevê-la, isto
 * não seria recomendado, pois sabemos que o bloco pode ter muitos registros e o
 * uso da memória ficaria prejudicado. A recomendação é gravar os registros sob
 * demanda, e liberando-os em seguida.
 * <p/>
 * Desta forma, a finalidade desta classe é mais para entendermos a estrutura do
 * Bloco.
 */
@Record(fields = {
    @Field(name = "regH001"),
    //TODO: Registros Bloco H ainda não implementados
    //    @Field(name = "regH005List"),
    @Field(name = "regH990")
})
@Deprecated
public class BlocoH {

    private RegH001 regH001;
    //TODO: Registros Bloco H ainda não implementados
//    private List<RegH005> regH005List;
    private RegH990 regH990;

    public RegH001 getRegH001() {
        return regH001;
    }

    public void setRegH001(RegH001 regH001) {
        this.regH001 = regH001;
    }

    public RegH990 getRegH990() {
        return regH990;
    }

    public void setRegH990(RegH990 regH990) {
        this.regH990 = regH990;
    }
}

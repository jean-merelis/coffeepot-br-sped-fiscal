/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco E - Apuração do ICMS e do IPI.
 *
 * @author Jeandeson O. Merelis
 * @deprecated Embora seja possível gravarmos Bloco inteiro utilizando apenas
 * uma instancia desta classe e a passando para o ObjectWriter escrevê-la, isto
 * não seria recomendado, pois sabemos que o bloco pode ter muitos registros e o
 * uso da memória ficaria prejudicado. A recomendação é gravar os registros sob
 * demanda, e liberando-os em seguida.
 * <p/>
 * Desta forma, a finalidade desta classe é mais para entendermos a estrutura do
 * Bloco.
 */
@Record(fields = {
    @Field(name = "regE001"),
    //TODO: Registros Bloco E ainda não implementados
    //    @Field(name = "regE100List"),
    //    @Field(name = "regE200List"),
    //    @Field(name = "regE500List"),
    @Field(name = "regE990")
})
@Deprecated
public class BlocoE {

    private RegE001 regE001;
    //TODO: Registros Bloco E ainda não implementados
//    private List<RegE100> regE100List;
//    private List<RegE200> regE200List;
//    private List<RegE500> regE500List;
    private RegE990 regE990;

    public RegE001 getRegE001() {
        return regE001;
    }

    public void setRegE001(RegE001 regE001) {
        this.regE001 = regE001;
    }

    public RegE990 getRegE990() {
        return regE990;
    }

    public void setRegE990(RegE990 regE990) {
        this.regE990 = regE990;
    }
}

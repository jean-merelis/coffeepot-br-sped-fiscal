/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoG;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco G - Controle do Crédito de ICMS do Ativo Permanente - CIAP - modelos
 * "C" e "D".
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
    @Field(name = "regG001"),
    //TODO: Registros Bloco G ainda não implementados
    //    @Field(name = "regG110List"),
    @Field(name = "regG990")
})
@Deprecated
public class BlocoG {

    private RegG001 regG001;
    //TODO: Registros Bloco G ainda não implementados
//    private List<RegG110> regG110List;
    private RegG990 regG990;

    public RegG001 getRegG001() {
        return regG001;
    }

    public void setRegG001(RegG001 regG001) {
        this.regG001 = regG001;
    }

    public RegG990 getRegG990() {
        return regG990;
    }

    public void setRegG990(RegG990 regG990) {
        this.regG990 = regG990;
    }
}

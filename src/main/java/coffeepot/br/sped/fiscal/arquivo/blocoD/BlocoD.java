/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco D - Documentos Fiscais II - Serviços (ICMS).
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
    @Field(name = "regD001"),
    //TODO: Registros Bloco D ainda não implementados
    //    @Field(name = "regD100List"),
    //    @Field(name = "regD300List"),
    //    @Field(name = "regD350List"),
    //    @Field(name = "regD400List"),
    //    @Field(name = "regD500List"),
    //    @Field(name = "regD600List"),
    //    @Field(name = "regD695List"),
    @Field(name = "regD990")
})
public class BlocoD {

    private RegD001 regD001;
    //TODO: Registros Bloco D ainda não implementados
//    private List<RegD100> regD100List;
//    private List<RegD300> regD300List;
//    private List<RegD350> regD350List;
//    private List<RegD400> regD400List;
//    private List<RegD500> regD500List;
//    private List<RegD600> regD600List;
//    private List<RegD695> regD695List;        
    private RegD990 regD990;

    public RegD001 getRegD001() {
        return regD001;
    }

    public void setRegD001(RegD001 regD001) {
        this.regD001 = regD001;
    }

    public RegD990 getRegD990() {
        return regD990;
    }

    public void setRegD990(RegD990 regD990) {
        this.regD990 = regD990;
    }
}

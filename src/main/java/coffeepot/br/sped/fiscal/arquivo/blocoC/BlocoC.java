/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco C - Documentos Fiscais I  - Mercadorias (ICMS/IPI).
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
    @Field(name = "regC001"),
    @Field(name = "regC100List"),
    @Field(name = "regC300List"),
    @Field(name = "regC350List"),
    @Field(name = "regC400List"),
    @Field(name = "regC495List"),
    //TODO: Registros Bloco C ainda não implementados
    //    @Field(name = "regC500List"),
    //    @Field(name = "regC600List"),
    //    @Field(name = "regC700List"),
    //    @Field(name = "regC800List"),
    //    @Field(name = "regC860List"),              
    @Field(name = "regC990")
})
@Deprecated
public class BlocoC {

    private RegC001 regC001;
    private List<RegC100> regC100List;
    private List<RegC300> regC300List;
    private List<RegC350> regC350List;
    private List<RegC400> regC400List;
    private List<RegC495> regC495List;
    //TODO: Registros Bloco C ainda não implementados
//    private List<RegC500> regC500List;
//    private List<RegC600> regC600List;
//    private List<RegC700> regC700List;
//    private List<RegC800> regC800List;
//    private List<RegC860> regC860List;              
    private RegC990 regC990;

    public RegC001 getRegC001() {
        return regC001;
    }

    public void setRegC001(RegC001 regC001) {
        this.regC001 = regC001;
    }

    public List<RegC100> getRegC100List() {
        return regC100List;
    }

    public void setRegC100List(List<RegC100> regC100List) {
        this.regC100List = regC100List;
    }

    public List<RegC300> getRegC300List() {
        return regC300List;
    }

    public void setRegC300List(List<RegC300> regC300List) {
        this.regC300List = regC300List;
    }

    public List<RegC350> getRegC350List() {
        return regC350List;
    }

    public void setRegC350List(List<RegC350> regC350List) {
        this.regC350List = regC350List;
    }

    public List<RegC400> getRegC400List() {
        return regC400List;
    }

    public void setRegC400List(List<RegC400> regC400List) {
        this.regC400List = regC400List;
    }

    public List<RegC495> getRegC495List() {
        return regC495List;
    }

    public void setRegC495List(List<RegC495> regC495List) {
        this.regC495List = regC495List;
    }

    public RegC990 getRegC990() {
        return regC990;
    }

    public void setRegC990(RegC990 regC990) {
        this.regC990 = regC990;
    }
}

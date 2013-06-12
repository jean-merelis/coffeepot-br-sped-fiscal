/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C400"),
    @Field(name = "codMod"),
    @Field(name = "ecfMod"),
    @Field(name = "ecfFab", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "ecfCx"),
    //--
    @Field(name = "regC405List")
})
public class RegC400 {

    private DocumentoFiscal codMod;
    private String ecfMod;
    private String ecfFab;
    private Integer ecfCx;
    //--
    private List<RegC405> regC405List;

    public DocumentoFiscal getCodMod() {
        return codMod;
    }

    public void setCodMod(DocumentoFiscal codMod) {
        this.codMod = codMod;
    }

    public String getEcfMod() {
        return ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public Integer getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(Integer ecfCx) {
        this.ecfCx = ecfCx;
    }

    public List<RegC405> getRegC405List() {
        return regC405List;
    }

    public void setRegC405List(List<RegC405> regC405List) {
        this.regC405List = regC405List;
    }
}

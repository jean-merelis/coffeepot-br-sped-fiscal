/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C114"),
    @Field( name = "codMod"),
    @Field( name = "ecfFab", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field( name = "ecfCx"),
    @Field( name = "numDoc"),
    @Field( name = "dtDoc")
})
public class RegC114 {
    private DocumentoFiscal codMod;
    private String ecfFab;
    private Integer ecfCx;
    private Long numDoc;
    private Date dtDoc;

    public DocumentoFiscal getCodMod() {
        return codMod;
    }

    public void setCodMod(DocumentoFiscal codMod) {
        this.codMod = codMod;
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

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }        
}

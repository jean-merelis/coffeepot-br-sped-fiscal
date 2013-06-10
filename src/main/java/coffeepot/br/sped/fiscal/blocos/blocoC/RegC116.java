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
    @Field(name = "", constantValue = "C116"),
    @Field(name = "codMod"),
    @Field(name = "nrSat", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "chvCfe", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "numCfe"),
    @Field(name = "dtDoc")
})
public class RegC116 {

    private DocumentoFiscal codMod;
    private String nrSat;
    private String chvCfe;
    private Integer numCfe;
    private Date dtDoc;

    public DocumentoFiscal getCodMod() {
        return codMod;
    }

    public void setCodMod(DocumentoFiscal codMod) {
        this.codMod = codMod;
    }

    public String getNrSat() {
        return nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public Integer getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(Integer numCfe) {
        this.numCfe = numCfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
}

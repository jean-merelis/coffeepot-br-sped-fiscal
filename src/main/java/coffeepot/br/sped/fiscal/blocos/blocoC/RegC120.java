/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C120"),
    @Field( name = "codDocImp"),
    @Field( name = "numDocImp"),
    @Field( name = "pisImp"),
    @Field( name = "cofinsImp"),
    @Field( name = "numAcdraw")
})
public class RegC120 {

    private DocumentoImportacao codDocImp;
    private String numDocImp;
    private Double pisImp;
    private Double cofinsImp;
    private String numAcdraw;

    public DocumentoImportacao getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(DocumentoImportacao codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public Double getPisImp() {
        return pisImp;
    }

    public void setPisImp(Double pisImp) {
        this.pisImp = pisImp;
    }

    public Double getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(Double cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }       
}

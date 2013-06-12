/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C176"),
    @Field(name = "codModUltE"),
    @Field(name = "numDocUltE"),
    @Field(name = "serUltE"),
    @Field(name = "dtUltE"),
    @Field(name = "codPartUltE"),
    @Field(name = "quantUltE"),
    @Field(name = "vlUnitUltE"),
    @Field(name = "vlUnitBcSt")
})
public class RegC176 {

    private String codModUltE;
    private Long numDocUltE;
    private String serUltE;
    private Date dtUltE;
    private String codPartUltE;
    private Double quantUltE;
    private Double vlUnitUltE;
    private Double vlUnitBcSt;

    public String getCodModUltE() {
        return codModUltE;
    }

    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }

    public Long getNumDocUltE() {
        return numDocUltE;
    }

    public void setNumDocUltE(Long numDocUltE) {
        this.numDocUltE = numDocUltE;
    }

    public String getSerUltE() {
        return serUltE;
    }

    public void setSerUltE(String serUltE) {
        this.serUltE = serUltE;
    }

    public Date getDtUltE() {
        return dtUltE;
    }

    public void setDtUltE(Date dtUltE) {
        this.dtUltE = dtUltE;
    }

    public String getCodPartUltE() {
        return codPartUltE;
    }

    public void setCodPartUltE(String codPartUltE) {
        this.codPartUltE = codPartUltE;
    }

    public Double getQuantUltE() {
        return quantUltE;
    }

    public void setQuantUltE(Double quantUltE) {
        this.quantUltE = quantUltE;
    }

    public Double getVlUnitUltE() {
        return vlUnitUltE;
    }

    public void setVlUnitUltE(Double vlUnitUltE) {
        this.vlUnitUltE = vlUnitUltE;
    }

    public Double getVlUnitBcSt() {
        return vlUnitBcSt;
    }

    public void setVlUnitBcSt(Double vlUnitBcSt) {
        this.vlUnitBcSt = vlUnitBcSt;
    }        
}

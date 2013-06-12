/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C179"),
    @Field(name = "bcStOrigDest"),
    @Field(name = "icmsStRep"),
    @Field(name = "icmsStCompl"),
    @Field(name = "bcRet"),
    @Field(name = "icmsRet")
})
public class RegC179 {

    private Double bcStOrigDest;
    private Double icmsStRep;
    private Double icmsStCompl;
    private Double bcRet;
    private Double icmsRet;

    public Double getBcStOrigDest() {
        return bcStOrigDest;
    }

    public void setBcStOrigDest(Double bcStOrigDest) {
        this.bcStOrigDest = bcStOrigDest;
    }

    public Double getIcmsStRep() {
        return icmsStRep;
    }

    public void setIcmsStRep(Double icmsStRep) {
        this.icmsStRep = icmsStRep;
    }

    public Double getIcmsStCompl() {
        return icmsStCompl;
    }

    public void setIcmsStCompl(Double icmsStCompl) {
        this.icmsStCompl = icmsStCompl;
    }

    public Double getBcRet() {
        return bcRet;
    }

    public void setBcRet(Double bcRet) {
        this.bcRet = bcRet;
    }

    public Double getIcmsRet() {
        return icmsRet;
    }

    public void setIcmsRet(Double icmsRet) {
        this.icmsRet = icmsRet;
    }
}

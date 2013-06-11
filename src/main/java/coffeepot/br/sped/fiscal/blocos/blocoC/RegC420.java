/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C420"),
    @Field(name = "codTotPar"),
    @Field(name = "vlrAcumTot"),
    @Field(name = "nrTot"),
    @Field(name = "descrNrTot"),
    //--
    @Field(name = "regC425List")
})
public class RegC420 {

    private String codTotPar;
    private Double vlrAcumTot;
    private Integer nrTot;
    private String descrNrTot;
    //--
    private List<RegC425> regC425List;

    public String getCodTotPar() {
        return codTotPar;
    }

    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }

    public Double getVlrAcumTot() {
        return vlrAcumTot;
    }

    public void setVlrAcumTot(Double vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }

    public Integer getNrTot() {
        return nrTot;
    }

    public void setNrTot(Integer nrTot) {
        this.nrTot = nrTot;
    }

    public String getDescrNrTot() {
        return descrNrTot;
    }

    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
    }

    public List<RegC425> getRegC425List() {
        return regC425List;
    }

    public void setRegC425List(List<RegC425> regC425List) {
        this.regC425List = regC425List;
    }
}

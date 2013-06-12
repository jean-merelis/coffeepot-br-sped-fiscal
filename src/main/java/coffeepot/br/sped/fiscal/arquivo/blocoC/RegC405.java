/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C405"),
    @Field(name = "dtDoc"),
    @Field(name = "cro"),
    @Field(name = "crz"),
    @Field(name = "numCooFin"),
    @Field(name = "gtFin"),
    @Field(name = "vlBrt"),
    //--
    @Field(name = "regC410"),
    @Field(name = "regC420List"),
    @Field(name = "regC460List"),
    @Field(name = "regC490List")
})
public class RegC405 {

    private Date dtDoc;
    private Integer cro;
    private Integer crz;
    private Integer numCooFin;
    private Double gtFin;
    private Double vlBrt;
    //--
    private RegC410 regC410;
    private List<RegC420> regC420List;
    private List<RegC460> regC460List;
    private List<RegC490> regC490List;

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Integer getCro() {
        return cro;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public Integer getCrz() {
        return crz;
    }

    public void setCrz(Integer crz) {
        this.crz = crz;
    }

    public Integer getNumCooFin() {
        return numCooFin;
    }

    public void setNumCooFin(Integer numCooFin) {
        this.numCooFin = numCooFin;
    }

    public Double getGtFin() {
        return gtFin;
    }

    public void setGtFin(Double gtFin) {
        this.gtFin = gtFin;
    }

    public Double getVlBrt() {
        return vlBrt;
    }

    public void setVlBrt(Double vlBrt) {
        this.vlBrt = vlBrt;
    }

    public RegC410 getRegC410() {
        return regC410;
    }

    public void setRegC410(RegC410 regC410) {
        this.regC410 = regC410;
    }

    public List<RegC420> getRegC420List() {
        return regC420List;
    }

    public void setRegC420List(List<RegC420> regC420List) {
        this.regC420List = regC420List;
    }

    public List<RegC460> getRegC460List() {
        return regC460List;
    }

    public void setRegC460List(List<RegC460> regC460List) {
        this.regC460List = regC460List;
    }

    public List<RegC490> getRegC490List() {
        return regC490List;
    }

    public void setRegC490List(List<RegC490> regC490List) {
        this.regC490List = regC490List;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C350"),
    @Field(name = "ser"),
    @Field(name = "subSer"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "cnpjCpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "vlMerc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    //
    @Field(name = "regC370List"),
    @Field(name = "regC390List")
})
public class RegC350 {

    private String ser;
    private String subSer;
    private String numDoc;
    private Date dtDoc;
    private String cnpjCpf;
    private Double vlMerc;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;
    //
    private List<RegC370> regC370List;
    private List<RegC390> regC390List;

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public Double getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }

    public Double getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }

    public Double getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Double getVlPis() {
        return vlPis;
    }

    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }

    public Double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegC370> getRegC370List() {
        return regC370List;
    }

    public void setRegC370List(List<RegC370> regC370List) {
        this.regC370List = regC370List;
    }

    public List<RegC390> getRegC390List() {
        return regC390List;
    }

    public void setRegC390List(List<RegC390> regC390List) {
        this.regC390List = regC390List;
    }
}

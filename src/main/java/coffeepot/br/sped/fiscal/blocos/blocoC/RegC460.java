/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C460"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "cpfCnpj"),
    @Field(name = "nomAdq"),
    //--
    @Field(name = "regC465"),
    @Field(name = "regC470List")
})
public class RegC460 {

    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private Integer numDoc;
    private Date dtDoc;
    private Double vlDoc;
    private Double vlPis;
    private Double vlCofins;
    private String cpfCnpj;
    private String nomAdq;
    //--
    private RegC465 regC465;
    private List<RegC470> regC470List;

    public DocumentoFiscal getCodMod() {
        return codMod;
    }

    public void setCodMod(DocumentoFiscal codMod) {
        this.codMod = codMod;
    }

    public SituacaoDocumento getCodSit() {
        return codSit;
    }

    public void setCodSit(SituacaoDocumento codSit) {
        this.codSit = codSit;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Double getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomAdq() {
        return nomAdq;
    }

    public void setNomAdq(String nomAdq) {
        this.nomAdq = nomAdq;
    }

    public RegC465 getRegC465() {
        return regC465;
    }

    public void setRegC465(RegC465 regC465) {
        this.regC465 = regC465;
    }

    public List<RegC470> getRegC470List() {
        return regC470List;
    }

    public void setRegC470List(List<RegC470> regC470List) {
        this.regC470List = regC470List;
    }
}

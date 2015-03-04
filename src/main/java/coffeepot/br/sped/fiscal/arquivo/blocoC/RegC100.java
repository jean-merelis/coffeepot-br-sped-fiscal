/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "C100"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "numDoc"),
    @Field(name = "chvNfe", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "dtDoc"),
    @Field(name = "dtES"),
    @Field(name = "vlDoc"),
    @Field(name = "indPgto"),
    @Field(name = "vlDesc"),
    @Field(name = "vlAbatNt"),
    @Field(name = "vlMerc"),
    @Field(name = "indFrt"),
    @Field(name = "vlFrt"),
    @Field(name = "vlSeg"),
    @Field(name = "vlOutDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "vlIpi"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "vlPisSt"),
    @Field(name = "vlCofinsSt"),
    //--- detalhes ---
    @Field(name = "regC105"),
    @Field(name = "regC110List"),
    @Field(name = "regC120List"),
    @Field(name = "regC130"),
    @Field(name = "regC140"),
    @Field(name = "regC160"),
    @Field(name = "regC165List"),
    @Field(name = "regC170List"),
    @Field(name = "regC190List"),
    @Field(name = "regC195List"),})
public class RegC100 {

    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private Long numDoc;
    private String chvNfe;
    private Date dtDoc;
    private Date dtES;
    private Double vlDoc;
    private CondicaoPagamento indPgto;
    private Double vlDesc;
    private Double vlAbatNt;
    private Double vlMerc;
    private Frete indFrt;
    private Double vlFrt;
    private Double vlSeg;
    private Double vlOutDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private Double vlIpi;
    private Double vlPis;
    private Double vlCofins;
    private Double vlPisSt;
    private Double vlCofinsSt;
    //--- detalhes ---
    private RegC105 regC105;
    private List<RegC110> regC110List;
    private List<RegC120> regC120List;
    private RegC130 regC130;
    private RegC140 regC140;
    private RegC160 regC160;
    private List<RegC165> regC165List;
    private List<RegC170> regC170List;
    private List<RegC190> regC190List;
    private List<RegC195> regC195List;

    public Operacao getIndOper() {
        return indOper;
    }

    public void setIndOper(Operacao indOper) {
        this.indOper = indOper;
    }

    public EmissaoDocumento getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(EmissaoDocumento indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Date getDtES() {
        return dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }

    public Double getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }

    public CondicaoPagamento getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(CondicaoPagamento indPgto) {
        this.indPgto = indPgto;
    }

    public Double getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Double getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(Double vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public Double getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }

    public Frete getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(Frete indFrt) {
        this.indFrt = indFrt;
    }

    public Double getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(Double vlFrt) {
        this.vlFrt = vlFrt;
    }

    public Double getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(Double vlSeg) {
        this.vlSeg = vlSeg;
    }

    public Double getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(Double vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public Double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public Double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
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

    public Double getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(Double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public Double getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(Double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC105 getRegC105() {
        return regC105;
    }

    public void setRegC105(RegC105 regC105) {
        this.regC105 = regC105;
    }

    public List<RegC110> getRegC110List() {
        return regC110List;
    }

    public void setRegC110List(List<RegC110> regC110List) {
        this.regC110List = regC110List;
    }

    public List<RegC120> getRegC120List() {
        return regC120List;
    }

    public void setRegC120List(List<RegC120> regC120List) {
        this.regC120List = regC120List;
    }

    public RegC130 getRegC130() {
        return regC130;
    }

    public void setRegC130(RegC130 regC130) {
        this.regC130 = regC130;
    }

    public RegC140 getRegC140() {
        return regC140;
    }

    public void setRegC140(RegC140 regC140) {
        this.regC140 = regC140;
    }

    public RegC160 getRegC160() {
        return regC160;
    }

    public void setRegC160(RegC160 regC160) {
        this.regC160 = regC160;
    }

    public List<RegC165> getRegC165List() {
        return regC165List;
    }

    public void setRegC165List(List<RegC165> regC165List) {
        this.regC165List = regC165List;
    }

    public List<RegC170> getRegC170List() {
        return regC170List;
    }

    public void setRegC170List(List<RegC170> regC170List) {
        this.regC170List = regC170List;
    }

    public List<RegC190> getRegC190List() {
        return regC190List;
    }

    public void setRegC190List(List<RegC190> regC190List) {
        this.regC190List = regC190List;
    }

    public List<RegC195> getRegC195List() {
        return regC195List;
    }

    public void setRegC195List(List<RegC195> regC195List) {
        this.regC195List = regC195List;
    }
}

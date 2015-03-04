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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.ApuracaoIpi;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C170"),
    @Field(name = "numItem"),
    @Field(name = "codItem"),
    @Field(name = "descrCompl"),
    @Field(name = "qtd"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "indMov", params = {"true=0;false=1"}),
    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "codNat"),
    @Field(name = "vlBcIcms"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "aliqSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "indApur"),
    @Field(name = "cstIpi", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "codEnq"),
    @Field(name = "vlBcIpi"),
    @Field(name = "aliqIpi"),
    @Field(name = "vlIpi"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPisPerc"),
    @Field(name = "quantBcPis"),
    @Field(name = "aliqPisReal"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofinsPerc"),
    @Field(name = "quantBcCofins"),
    @Field(name = "aliqCofinsReal"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    //---
    @Field(name = "regC171List"),
    @Field(name = "regC172List"),
    @Field(name = "regC173List"),
    @Field(name = "regC174List"),
    @Field(name = "regC175List"),
    @Field(name = "regC176List"),
    @Field(name = "regC177"),
    @Field(name = "regC178"),
    @Field(name = "regC179")
})
public class RegC170 {

    private Integer numItem;
    private String codItem;
    private String descrCompl;
    private Double qtd;
    private String unid;
    private Double vlItem;
    private Double vlDesc;
    private Boolean indMov;
    private String cstIcms;
    private Integer cfop;
    private String codNat;
    private Double vlBcIcms;
    private Double aliqIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double aliqSt;
    private Double vlIcmsSt;
    private ApuracaoIpi indApur;
    private String cstIpi;
    private String codEnq;
    private Double vlBcIpi;
    private Double aliqIpi;
    private Double vlIpi;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPisPerc;
    private Double quantBcPis;
    private Double aliqPisReal;
    private Double vlPis;
    private String cstCofins;
    private Double vlBcCofins;
    private Double aliqCofinsPerc;
    private Double quantBcCofins;
    private Double aliqCofinsReal;
    private Double vlCofins;
    private String codCta;
    //---
    private List<RegC171> regC171List;
    private List<RegC172> regC172List;
    private List<RegC173> regC173List;
    private List<RegC174> regC174List;
    private List<RegC175> regC175List;
    private List<RegC176> regC176List;
    private RegC177 regC177;
    private RegC178 regC178;
    private RegC179 regC179;
    
    public Integer getNumItem() {
        return numItem;
    }

    public void setNumItem(Integer numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Double getVlItem() {
        return vlItem;
    }

    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }

    public Double getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Boolean getIndMov() {
        return indMov;
    }

    public void setIndMov(Boolean indMov) {
        this.indMov = indMov;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public Double getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
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

    public Double getAliqSt() {
        return aliqSt;
    }

    public void setAliqSt(Double aliqSt) {
        this.aliqSt = aliqSt;
    }

    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public ApuracaoIpi getIndApur() {
        return indApur;
    }

    public void setIndApur(ApuracaoIpi indApur) {
        this.indApur = indApur;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public Double getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(Double vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public Double getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(Double aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public Double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public Double getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public Double getAliqPisPerc() {
        return aliqPisPerc;
    }

    public void setAliqPisPerc(Double aliqPisPerc) {
        this.aliqPisPerc = aliqPisPerc;
    }

    public Double getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(Double quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public Double getAliqPisReal() {
        return aliqPisReal;
    }

    public void setAliqPisReal(Double aliqPisReal) {
        this.aliqPisReal = aliqPisReal;
    }

    public Double getVlPis() {
        return vlPis;
    }

    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public Double getAliqCofinsPerc() {
        return aliqCofinsPerc;
    }

    public void setAliqCofinsPerc(Double aliqCofinsPerc) {
        this.aliqCofinsPerc = aliqCofinsPerc;
    }

    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public Double getAliqCofinsReal() {
        return aliqCofinsReal;
    }

    public void setAliqCofinsReal(Double aliqCofinsReal) {
        this.aliqCofinsReal = aliqCofinsReal;
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

    public List<RegC171> getRegC171List() {
        return regC171List;
    }

    public void setRegC171List(List<RegC171> regC171List) {
        this.regC171List = regC171List;
    }

    public List<RegC172> getRegC172List() {
        return regC172List;
    }

    public void setRegC172List(List<RegC172> regC172List) {
        this.regC172List = regC172List;
    }

    public List<RegC173> getRegC173List() {
        return regC173List;
    }

    public void setRegC173List(List<RegC173> regC173List) {
        this.regC173List = regC173List;
    }

    public List<RegC174> getRegC174List() {
        return regC174List;
    }

    public void setRegC174List(List<RegC174> regC174List) {
        this.regC174List = regC174List;
    }

    public List<RegC175> getRegC175List() {
        return regC175List;
    }

    public void setRegC175List(List<RegC175> regC175List) {
        this.regC175List = regC175List;
    }

    public List<RegC176> getRegC176List() {
        return regC176List;
    }

    public void setRegC176List(List<RegC176> regC176List) {
        this.regC176List = regC176List;
    }

    public RegC177 getRegC177() {
        return regC177;
    }

    public void setRegC177(RegC177 regC177) {
        this.regC177 = regC177;
    }

    public RegC178 getRegC178() {
        return regC178;
    }

    public void setRegC178(RegC178 regC178) {
        this.regC178 = regC178;
    }

    public RegC179 getRegC179() {
        return regC179;
    }

    public void setRegC179(RegC179 regC179) {
        this.regC179 = regC179;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.br.sped.fiscal.tipos.TipoItem;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Reg0200 {

    private String codItem;
    private String descrItem;
    private String codBarra;
    private String codAntItem;
    private String unidInv;
    private TipoItem tipoItem;
    private String codNcm;
    private String exIpi;
    private String codGen;
    private Integer codLst;
    private Double aliqIcms;
    private List<Reg0205> reg0205List;
    private Reg0206 reg0206;
    private List<Reg0220> reg0220List;

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getCodGen() {
        return codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    public Integer getCodLst() {
        return codLst;
    }

    public void setCodLst(Integer codLst) {
        this.codLst = codLst;
    }

    public Double getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public List<Reg0205> getReg0205List() {
        return reg0205List;
    }

    public void setReg0205List(List<Reg0205> reg0205List) {
        this.reg0205List = reg0205List;
    }

    public Reg0206 getReg0206() {
        return reg0206;
    }

    public void setReg0206(Reg0206 reg0206) {
        this.reg0206 = reg0206;
    }

    public List<Reg0220> getReg0220List() {
        return reg0220List;
    }

    public void setReg0220List(List<Reg0220> reg0220List) {
        this.reg0220List = reg0220List;
    }

}

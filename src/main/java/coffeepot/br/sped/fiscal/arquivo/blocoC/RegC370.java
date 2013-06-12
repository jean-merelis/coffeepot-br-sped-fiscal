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
    @Field(name = "", constantValue = "C370"),
    @Field(name = "numItem"),
    @Field(name = "codItem"),
    @Field(name = "qtd"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc")
})
public class RegC370 {

    private Integer numItem;
    private String codItem;
    private Double qtd;
    private String unid;
    private Double vlItem;
    private Double vlDesc;

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
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0500"),
    @Field(name = "dtAlt"),
    @Field(name = "codNatCc"),
    @Field(name = "indCta"),
    @Field(name = "nivel"),
    @Field(name = "codCta"),
    @Field(name = "nomeCta")
})
public class Reg0500 {

    private Date dtAlt;
    private NaturezaContaContabil codNatCc;
    private TipoContaContabil indCta;
    private Integer nivel;
    private String codCta;
    private String nomeCta;

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public NaturezaContaContabil getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(NaturezaContaContabil codNatCc) {
        this.codNatCc = codNatCc;
    }

    public TipoContaContabil getIndCta() {
        return indCta;
    }

    public void setIndCta(TipoContaContabil indCta) {
        this.indCta = indCta;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }
}

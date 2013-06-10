/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.IdentificacaoMercadoria;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0300"),
    @Field(name = "codIndBem"),
    @Field(name = "identMerc"),
    @Field(name = "descrItem"),
    @Field(name = "codPrnc"),
    @Field(name = "codCta"),
    @Field(name = "nrParc"),
    @Field(name = "reg0305")
})
public class Reg0300 {

    private String codIndBem;
    private IdentificacaoMercadoria identMerc;
    private String descrItem;
    private String codPrnc;
    private String codCta;
    private Integer nrParc;
    private Reg0305 reg0305;

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public IdentificacaoMercadoria getIdentMerc() {
        return identMerc;
    }

    public void setIdentMerc(IdentificacaoMercadoria identMerc) {
        this.identMerc = identMerc;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodPrnc() {
        return codPrnc;
    }

    public void setCodPrnc(String codPrnc) {
        this.codPrnc = codPrnc;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Integer getNrParc() {
        return nrParc;
    }

    public void setNrParc(Integer nrParc) {
        this.nrParc = nrParc;
    }

    public Reg0305 getReg0305() {
        return reg0305;
    }

    public void setReg0305(Reg0305 reg0305) {
        this.reg0305 = reg0305;
    }
}

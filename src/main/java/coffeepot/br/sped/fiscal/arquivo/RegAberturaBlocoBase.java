/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

/**
 * Registro de abertura de bloco.
 *
 * @author Jeandeson O. Merelis
 */
public class RegAberturaBlocoBase {

    protected String reg;
    protected IndicadorMovimento indMov;

    public String getReg() {
        return reg;
    }

    protected void setReg(String reg) {
        this.reg = reg;
    }

    public IndicadorMovimento getIndMov() {
        return indMov;
    }

    public void setIndMov(IndicadorMovimento indMov) {
        this.indMov = indMov;
    }
}

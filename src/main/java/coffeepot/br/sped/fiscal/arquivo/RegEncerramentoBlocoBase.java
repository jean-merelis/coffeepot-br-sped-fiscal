/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

/**
 * Registro de encerramento de bloco.
 *
 * @author Jeandeson O. Merelis
 */
public class RegEncerramentoBlocoBase {

    protected String reg;
    protected Long qtdLin;

    public String getReg() {
        return reg;
    }

    protected void setReg(String reg) {
        this.reg = reg;
    }

    public Long getQtdLin() {
        return qtdLin;
    }

    public void setQtdLin(Long qtdLin) {
        this.qtdLin = qtdLin;
    }
}

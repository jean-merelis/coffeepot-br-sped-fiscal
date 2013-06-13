/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "1010"),
    @Field(name = "indExp", params = "S;N"),
    @Field(name = "indCcrf", params = "S;N"),
    @Field(name = "indComb", params = "S;N"),
    @Field(name = "indUsina", params = "S;N"),
    @Field(name = "indVa", params = "S;N"),
    @Field(name = "indEe", params = "S;N"),
    @Field(name = "indCart", params = "S;N"),
    @Field(name = "indForm", params = "S;N"),
    @Field(name = "indAer", params = "S;N")
})
public class Reg1010 {

    private Boolean indExp;
    private Boolean indCcrf;
    private Boolean indComb;
    private Boolean indUsina;
    private Boolean indVa;
    private Boolean indEe;
    private Boolean indCart;
    private Boolean indForm;
    private Boolean indAer;

    public Boolean getIndExp() {
        return indExp;
    }

    public void setIndExp(Boolean indExp) {
        this.indExp = indExp;
    }

    public Boolean getIndCcrf() {
        return indCcrf;
    }

    public void setIndCcrf(Boolean indCcrf) {
        this.indCcrf = indCcrf;
    }

    public Boolean getIndComb() {
        return indComb;
    }

    public void setIndComb(Boolean indComb) {
        this.indComb = indComb;
    }

    public Boolean getIndUsina() {
        return indUsina;
    }

    public void setIndUsina(Boolean indUsina) {
        this.indUsina = indUsina;
    }

    public Boolean getIndVa() {
        return indVa;
    }

    public void setIndVa(Boolean indVa) {
        this.indVa = indVa;
    }

    public Boolean getIndEe() {
        return indEe;
    }

    public void setIndEe(Boolean indEe) {
        this.indEe = indEe;
    }

    public Boolean getIndCart() {
        return indCart;
    }

    public void setIndCart(Boolean indCart) {
        this.indCart = indCart;
    }

    public Boolean getIndForm() {
        return indForm;
    }

    public void setIndForm(Boolean indForm) {
        this.indForm = indForm;
    }

    public Boolean getIndAer() {
        return indAer;
    }

    public void setIndAer(Boolean indAer) {
        this.indAer = indAer;
    }    
}

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
    @Field(name = "", constantValue = "C174"),
    @Field(name = "indArm"),
    @Field(name = "numArm"),
    @Field(name = "descrCompl")
})
public class RegC174 {

    private String indArm;
    private String numArm;
    private String descrCompl;

    public String getIndArm() {
        return indArm;
    }

    public void setIndArm(String indArm) {
        this.indArm = indArm;
    }

    public String getNumArm() {
        return numArm;
    }

    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
}

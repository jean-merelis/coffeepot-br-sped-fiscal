/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C195"),
    @Field(name = "codObs"),
    @Field(name = "txtCompl"),
    //---
    @Field(name = "regC197List")
})
public class RegC195 {

    private String codObs;
    private String txtCompl;
    //---
    private List<RegC197> regC197List;

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public List<RegC197> getRegC197List() {
        return regC197List;
    }

    public void setRegC197List(List<RegC197> regC197List) {
        this.regC197List = regC197List;
    }
}

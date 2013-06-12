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
    @Field(name = "", constantValue = "C177"),
    @Field(name = "codSeloIpi"),
    @Field(name = "qtSeloIpi")
})
public class RegC177 {
    private String codSeloIpi;
    private Long qtSeloIpi;

    public String getCodSeloIpi() {
        return codSeloIpi;
    }

    public void setCodSeloIpi(String codSeloIpi) {
        this.codSeloIpi = codSeloIpi;
    }

    public Long getQtSeloIpi() {
        return qtSeloIpi;
    }

    public void setQtSeloIpi(Long qtSeloIpi) {
        this.qtSeloIpi = qtSeloIpi;
    }
}

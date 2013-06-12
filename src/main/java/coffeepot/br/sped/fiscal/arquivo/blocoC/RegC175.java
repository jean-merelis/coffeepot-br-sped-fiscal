/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "C175"),
    @Field(name = "indVeicOper"),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "uf"),
    @Field(name = "chassiVeic")
})
public class RegC175 {

    private String indVeicOper;
    private String cnpj;
    private String uf;
    private String chassiVeic;

    public String getIndVeicOper() {
        return indVeicOper;
    }

    public void setIndVeicOper(String indVeicOper) {
        this.indVeicOper = indVeicOper;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getChassiVeic() {
        return chassiVeic;
    }

    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
    }
}

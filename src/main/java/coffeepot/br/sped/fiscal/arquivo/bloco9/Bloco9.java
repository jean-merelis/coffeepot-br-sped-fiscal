/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco 9 - Controle e Encerramento do Arquivo Digital.
 *
 * @author Jeandeson O. Merelis
 * @deprecated Embora seja possível gravarmos o Bloco inteiro utilizando apenas
 * uma instancia desta classe e a passando para o ObjectWriter escrevê-la, isto
 * não seria recomendado, pois sabemos que o bloco pode ter muitos registros e o
 * uso da memória ficaria prejudicado. A recomendação é gravar os registros sob
 * demanda, e liberando-os em seguida.
 * <p/>
 * Desta forma, a finalidade desta classe é mais para entendermos a estrutura do
 * Bloco.
 */
@Record(fields = {
    @Field(name = "reg9001"),
    @Field(name = "reg9900List"),
    @Field(name = "reg9990"),
    @Field(name = "reg9999")
})
@Deprecated
public class Bloco9 {

    private Reg9001 reg9001;
    private List<Reg9001> reg9900List;
    private Reg9990 reg9990;
    private Reg9999 reg9999;

    public Reg9001 getReg9001() {
        return reg9001;
    }

    public void setReg9001(Reg9001 reg9001) {
        this.reg9001 = reg9001;
    }

    public List<Reg9001> getReg9900List() {
        return reg9900List;
    }

    public void setReg9900List(List<Reg9001> reg9900List) {
        this.reg9900List = reg9900List;
    }

    public Reg9990 getReg9990() {
        return reg9990;
    }

    public void setReg9990(Reg9990 reg9990) {
        this.reg9990 = reg9990;
    }

    public Reg9999 getReg9999() {
        return reg9999;
    }

    public void setReg9999(Reg9999 reg9999) {
        this.reg9999 = reg9999;
    }
}

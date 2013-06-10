/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.ParseException;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "C111"),
    @Field(name = "numProc"),
    @Field(name = "indProc")
})
public class RegC111 {
    private String numProc;
    private OrigemProcesso indProc;

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public OrigemProcesso getIndProc() {
        return indProc;
    }

    public void setIndProc(OrigemProcesso indProc) {
        this.indProc = indProc;
    }
    
    
    public enum OrigemProcesso implements EnumCodificado{

        SEFAZ("0"),
        JUSTICA_FEDERAL("1"),
        JUSTICA_ESTADUAL("2"),
        SECEX_RFB("3"),
        OUTROS("9");
        private String codigo;

        private OrigemProcesso(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        @Override
        public OrigemProcesso parse(String codigo) throws ParseException {
            if ("0".equals(codigo)) {
                return SEFAZ;
            }
            if ("1".equals(codigo)) {
                return JUSTICA_FEDERAL;
            }
            if ("2".equals(codigo)) {
                return JUSTICA_ESTADUAL;
            }
            if ("3".equals(codigo)) {
                return SECEX_RFB;
            }
            if ("9".equals(codigo)) {
                return OUTROS;
            }
            throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo RegC111.OrigemProcesso");
        }
    }

}

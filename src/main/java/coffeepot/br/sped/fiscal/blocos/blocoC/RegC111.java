/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.br.sped.fiscal.tipos.ParseException;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
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
    
    
    public enum OrigemProcesso {

        SEFAZ("0"),
        JUSTICA_FEDERAL("1"),
        JUSTICA_ESTADUAL("2"),
        SECEX_RFB("3"),
        OUTROS("9");
        private String codigo;

        private OrigemProcesso(String codigo) {
            this.codigo = codigo;
        }

        public String getCodigo() {
            return codigo;
        }

        public static OrigemProcesso parse(String codigo) throws ParseException {
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

    public static class OrigemProcessoHandler implements TypeHandler {

        @Override
        public Object parse(String text) throws TypeConversionException {
            try {
                if (text == null || "".equals(text)) {
                    return null;
                }
                return OrigemProcesso.parse(text);
            } catch (ParseException ex) {
                throw new TypeConversionException(ex.getMessage());
            }
        }

        @Override
        public String format(Object value) {
            if (value == null) {
                return null;
            }
            return ((OrigemProcesso) value).getCodigo();
        }

        @Override
        public Class<?> getType() {
            return OrigemProcesso.class;
        }
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.br.sped.fiscal.tipos.ParseException;
import java.util.Date;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class RegC112 {
    private DocumentoArrecadacao codDa;
    private String uf;
    private String numDa;
    private String codAut;
    private Double vlDa;
    private Date dtVcto;
    private Date dtPgto;

    public DocumentoArrecadacao getCodDa() {
        return codDa;
    }

    public void setCodDa(DocumentoArrecadacao codDa) {
        this.codDa = codDa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public Double getVlDa() {
        return vlDa;
    }

    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public Date getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(Date dtPgto) {
        this.dtPgto = dtPgto;
    }
    

    public enum DocumentoArrecadacao {

        ESTADUAL("0"),
        GNRE("1");
        private String codigo;

        private DocumentoArrecadacao(String codigo) {
            this.codigo = codigo;
        }

        public String getCodigo() {
            return codigo;
        }

        public static DocumentoArrecadacao parse(String codigo) throws ParseException {
            if ("0".equals(codigo)) {
                return ESTADUAL;
            }
            if ("1".equals(codigo)) {
                return GNRE;
            }
            throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo RegC112.DocumentoArrecadacao");
        }
    }

    public static class DocumentoArrecadacaoHandler implements TypeHandler {

        @Override
        public Object parse(String text) throws TypeConversionException {
            try {
                if (text == null || "".equals(text)) {
                    return null;
                }
                return DocumentoArrecadacao.parse(text);
            } catch (ParseException ex) {
                throw new TypeConversionException(ex.getMessage());
            }
        }

        @Override
        public String format(Object value) {
            if (value == null) {
                return null;
            }
            return ((DocumentoArrecadacao) value).getCodigo();
        }

        @Override
        public Class<?> getType() {
            return DocumentoArrecadacao.class;
        }
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public enum TipoContaContabil {

    SINTETICA("S"),
    ANALITICA("A");
    private String codigo;

    private TipoContaContabil(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static TipoContaContabil parse(String codigo) throws ParseException {
        if ("S".equals(codigo)) {
            return SINTETICA;
        }
        if ("A".equals(codigo)) {
            return ANALITICA;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para TipoContaContabil");
    }
}

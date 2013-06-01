/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public enum IndicadorMovimento {

    COMDADOS("0"),
    SEMDADOS("1");
    private String codigo;

    private IndicadorMovimento(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static IndicadorMovimento parse(String codigo) {
        if ("0".equals(codigo)) {
            return COMDADOS;
        }
        if ("1".equals(codigo)) {
            return SEMDADOS;
        }
        return null;
    }
}

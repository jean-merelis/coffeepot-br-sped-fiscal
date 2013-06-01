/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do tipo de operação, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum Operacao {

    ENTRADA("0"),
    SAIDA("1");
    private String codigo;

    private Operacao(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static Operacao parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return ENTRADA;
        }
        if ("1".equals(codigo)) {
            return SAIDA;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo Operacao");
    }
}

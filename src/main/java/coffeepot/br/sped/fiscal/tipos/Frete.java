/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do tipo do frete, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum Frete implements EnumCodificado{

    EMITENTE("0"),
    DESTINATARIO_REMETENTE("1"),
    TERCEIROS("2"),
    SEM_FRETE("9");
    private String codigo;

    private Frete(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public Frete parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return EMITENTE;
        }
        if ("1".equals(codigo)) {
            return DESTINATARIO_REMETENTE;
        }
        if ("2".equals(codigo)) {
            return TERCEIROS;
        }
        if ("9".equals(codigo)) {
            return SEM_FRETE;
        }

        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo Frete");
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do emitente do documento fiscal, referenciado no registro C100 e
 * C140.
 *
 * @author Jeandeson O. Merelis
 */
public enum EmissaoDocumento implements EnumCodificado {

    PROPRIA("0"),
    TERCEIROS("1");
    private String codigo;

    private EmissaoDocumento(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public EmissaoDocumento parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return PROPRIA;
        }
        if ("1".equals(codigo)) {
            return TERCEIROS;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo EmissaoDocumento");
    }
}

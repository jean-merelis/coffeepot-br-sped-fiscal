/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do tipo de título de crédito, referenciado no registro C140.
 * @author Jeandeson O. Merelis
 */
public enum TipoTituloCredito implements EnumCodificado{
    DUPLICATA("00"),
    CHEQUE("01"),
    PROMISSORIA("02"),
    RECIBO("03"),
    OUTROS("99");
    private String codigo;

    private TipoTituloCredito(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public TipoTituloCredito parse(String codigo) throws ParseException {
        if ("00".equals(codigo))  return DUPLICATA;
        if ("01".equals(codigo))  return CHEQUE;
        if ("02".equals(codigo))  return PROMISSORIA;
        if ("03".equals(codigo))  return RECIBO;
        if ("99".equals(codigo))  return OUTROS;
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo TipoTituloCredito");
    }
}

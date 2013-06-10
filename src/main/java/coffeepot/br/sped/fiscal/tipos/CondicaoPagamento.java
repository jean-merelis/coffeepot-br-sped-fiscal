/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do tipo de pagamento, referenciado no registro C0100.
 *
 * @author Jeandeson O. Merelis
 */
public enum CondicaoPagamento  implements EnumCodificado{

    A_VISTA("0"),
    A_PRAZO("1"),
    OUTROS("2");
    private String codigo;

    private CondicaoPagamento(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public CondicaoPagamento parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return A_VISTA;
        }
        if ("1".equals(codigo)) {
            return A_PRAZO;
        }
        if ("2".equals(codigo)) {
            return OUTROS;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo CondicaoPagamento");
    }
}

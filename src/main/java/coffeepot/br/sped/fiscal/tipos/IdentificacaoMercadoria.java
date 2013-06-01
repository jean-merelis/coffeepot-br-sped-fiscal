/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Identificação do tipo de mercadoria, referido no registro 0300.
 * @author Jeandeson O. Merelis
 */
public enum IdentificacaoMercadoria {

    BEM("1"),
    COMPONENTE("2");
    private String codigo;

    private IdentificacaoMercadoria(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static IdentificacaoMercadoria parse(String codigo) throws ParseException {
        if ("1".equals(codigo)) {
            return BEM;
        }
        if ("2".equals(codigo)) {
            return COMPONENTE;
        }
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo IdentificacaoMercadoria");
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Documento de importação, referenciado no registro C120.
 *
 * @author Jeandeson O. Merelis
 */
public enum DocumentoImportacao  implements EnumCodificado {

    DECLARACAO_IMPORTACAO('0'),
    DECLARACAO_SIMPLIFICADA_IMPORTACAO('1');
    private char codigo;

    private DocumentoImportacao(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }

    @Override
    public DocumentoImportacao parse(String codigo) throws ParseException {
        if (codigo == null || codigo.length() != 1) {
            throw new ParseException("Não foi possível conveter para o tipo DocumentoImportacao");
        }
        return parse(codigo.charAt(0));
    }

    public static DocumentoImportacao parse(char codigo) throws ParseException {
        switch (codigo) {
            case '0':
                return DECLARACAO_IMPORTACAO;
            case '1':
                return DECLARACAO_SIMPLIFICADA_IMPORTACAO;
            default:
                throw new ParseException("Não foi possível conveter para o tipo DocumentoImportacao");
        }
    }
}
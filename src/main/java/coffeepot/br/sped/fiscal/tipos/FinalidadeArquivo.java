/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Finalidade do arquivo.
 *
 * @author Jeandeson O. Merelis
 */
public enum FinalidadeArquivo implements EnumCodificado {

    ARQUIVO_ORIGINAL("0", "Remessa do arquivo original"),
    ARQUIVO_SUBSTITUTO("1", "Remessa do arquivo substituto");
    private String codigo;
    private String descricao;

    private FinalidadeArquivo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public FinalidadeArquivo parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return ARQUIVO_ORIGINAL;
        }

        if ("1".equals(codigo)) {
            return ARQUIVO_SUBSTITUTO;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo FinalidadeArquivo");
    }
}

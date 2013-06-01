/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Finalidade do arquivo.
 *
 * @author Jeandeson O. Merelis
 */
public enum FinalidadeArquivo {

    ARQUIVOORIGINAL("0", "Remessa do arquivo original"),
    ARQUIVOSUBSTITUTO("1", "Remessa do arquivo substituto");
    private String codigo;
    private String descricao;

    private FinalidadeArquivo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static FinalidadeArquivo parse(String codigo) {
        if ("0".equals(codigo)) {
            return ARQUIVOORIGINAL;
        }

        if ("1".equals(codigo)) {
            return ARQUIVOSUBSTITUTO;
        }
        return null;
    }
}

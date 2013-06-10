/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Tipo do item (PRODUTO E SERVIÇOS) - Atividades Industriais, Comerciais e
 * Serviços.
 *
 * @author Jeandeson O. Merelis
 */
public enum TipoItem  implements EnumCodificado{

    /**
     * 00 - Mercadoria para Revenda.
     */
    MERCADORIA_REVENDA("00", "Mercadoria para Revenda"),
    /**
     * 01 - Matéria-Prima.
     */
    MATERIA_PRIMA("01", "Matéria-Prima"),
    /**
     * 02 - Embalagem.
     */
    EMBALAGEM("02", "Embalagem"),
    /**
     * 03 - Produto em Processo.
     */
    PRODUTO_EM_PROCESSO("03", "Produto em Processo"),
    /**
     * 04 - Produto Acabado.
     */
    PRODUTO_ACABADO("04", "Produto Acabado"),
    /**
     * 05 - Subproduto.
     */
    SUBPRODUTO("05", "Subproduto"),
    /**
     * 06 - Produto Intermediário.
     */
    PRODUTO_INTERMEDIARIO("06", "Produto Intermediário"),
    /**
     * 07 - Material de Uso e Consumo.
     */
    MATERIAL_USO_CONSUMO("07", "Material de Uso e Consumo"),
    /**
     * 08 - Ativo Imobilizado.
     */
    ATIVO_IMOBILIZADO("08", "Ativo Imobilizado"),
    /**
     * 09 - Serviços.
     */
    SERVICO("09", "Serviços"),
    /**
     * 10 - Outros insumos.
     */
    OUTROS_INSUMOS("10", "Outros insumos"),
    /**
     * 99 - Outras.
     */
    OUTRAS("99", "Outras");
    private String codigo;
    private String descricao;

    private TipoItem(String codigo, String descricao) {
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
    public TipoItem parse(String codigo) throws ParseException {
        try {
            int i = Integer.parseInt(codigo);
            return parse(i);
        } catch (ParseException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo TipoItem");
        }
    }

    public static TipoItem parse(int codigo) throws ParseException {
        switch (codigo) {
            case 0:
                return MERCADORIA_REVENDA;
            case 1:
                return MATERIA_PRIMA;
            case 2:
                return EMBALAGEM;
            case 3:
                return PRODUTO_EM_PROCESSO;
            case 4:
                return PRODUTO_ACABADO;
            case 5:
                return SUBPRODUTO;
            case 6:
                return PRODUTO_INTERMEDIARIO;
            case 7:
                return MATERIAL_USO_CONSUMO;
            case 8:
                return ATIVO_IMOBILIZADO;
            case 9:
                return SERVICO;
            case 10:
                return OUTROS_INSUMOS;
            case 99:
                return OUTRAS;
            default:
                throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo TipoItem");
        }
    }
}

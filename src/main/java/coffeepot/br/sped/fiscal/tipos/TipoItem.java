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
public enum TipoItem {

    /**
     * 00 - Mercadoria para Revenda.
     */
    MERCADORIAREVENDA(0, "Mercadoria para Revenda"),
    /**
     * 01 - Matéria-Prima.
     */
    MATERIAPRIMA(1, "Matéria-Prima"),
    /**
     * 02 - Embalagem.
     */
    EMBALAGEM(2, "Embalagem"),
    /**
     * 03 - Produto em Processo.
     */
    PRODUTOEMPROCESSO(3, "Produto em Processo"),
    /**
     * 04 - Produto Acabado.
     */
    PRODUTOACABADO(4, "Produto Acabado"),
    /**
     * 05 - Subproduto.
     */
    SUBPRODUTO(5, "Subproduto"),
    /**
     * 06 - Produto Intermediário.
     */
    PRODUTOINTERMEDIARIO(6, "Produto Intermediário"),
    /**
     * 07 - Material de Uso e Consumo.
     */
    MATERIALUSOCONSUMO(7, "Material de Uso e Consumo"),
    /**
     * 08 - Ativo Imobilizado.
     */
    ATIVOIMOBILIZADO(8, "Ativo Imobilizado"),
    /**
     * 09 - Serviços.
     */
    SERVICO(9, "Serviços"),
    /**
     * 10 - Outros insumos.
     */
    OUTROSINSUMOS(10, "Outros insumos"),
    /**
     * 99 - Outras.
     */
    OUTRAS(99, "Outras");
    private int codigo;
    private String descricao;

    private TipoItem(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCodigoAsString() {
        return String.valueOf(codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoItem parse(String codigo) throws ParseException {
        if (codigo == null || "".equals(codigo)) {
            return null;
        }
        try {
            int i = Integer.parseInt(codigo);
            return parse(i);
        } catch (ParseException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ParseException("Não foi possível converter código em texto para o tipo numérico");
        }
    }

    public static TipoItem parse(int codigo) throws ParseException {
        switch (codigo) {
            case 0:
                return MERCADORIAREVENDA;
            case 1:
                return MATERIAPRIMA;
            case 2:
                return EMBALAGEM;
            case 3:
                return PRODUTOEMPROCESSO;
            case 4:
                return PRODUTOACABADO;
            case 5:
                return SUBPRODUTO;
            case 6:
                return PRODUTOINTERMEDIARIO;
            case 7:
                return MATERIALUSOCONSUMO;
            case 8:
                return ATIVOIMOBILIZADO;
            case 9:
                return SERVICO;
            case 10:
                return OUTROSINSUMOS;
            case 99:
                return OUTRAS;
            default:
                throw new ParseException("Não existe um TipoItem para o código informado");
        }
    }
}

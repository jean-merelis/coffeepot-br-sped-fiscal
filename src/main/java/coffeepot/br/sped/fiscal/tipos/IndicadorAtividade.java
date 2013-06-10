/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador de tipo de atividade.
 *
 * @author Jeandeson O. Merelis
 */
public enum IndicadorAtividade implements EnumCodificado{

    INDUSTRIAL("0", "Industrial ou equiparado a industrial"),
    OUTROS("1", "Outros");
    
    private String codigo;
    private String descricao;

    private IndicadorAtividade(String codigo, String descricao) {
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
    public IndicadorAtividade parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return INDUSTRIAL;
        }
        if ("1".equals(codigo)) {
            return OUTROS;
        }
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo IndicadorAtividade");
    }
}

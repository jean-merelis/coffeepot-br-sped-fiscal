/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public enum IndicadorMovimento implements EnumCodificado{

    COM_DADOS("0"),
    SEM_DADOS("1");
    private String codigo;

    private IndicadorMovimento(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public IndicadorMovimento parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return COM_DADOS;
        }
        if ("1".equals(codigo)) {
            return SEM_DADOS;
        }
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo IndicadorMovimento");
    }
}

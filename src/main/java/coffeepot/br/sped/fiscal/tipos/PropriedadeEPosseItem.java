/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public enum PropriedadeEPosseItem implements EnumCodificado {

    PROP_INFORMANTE_EM_SEU_PODER("0"),
    PROP_INFORMANTE_EM_POSSE_DE_TERCEIROS("1"),
    PROP_TERCEIROS_EM_POSSE_INFORMANTE("2");
    private String codigo;

    private PropriedadeEPosseItem(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public PropriedadeEPosseItem parse(String codigo) throws ParseException {
        switch (codigo) {
            case "0":
                return PROP_INFORMANTE_EM_SEU_PODER;
            case "1":
                return PROP_INFORMANTE_EM_POSSE_DE_TERCEIROS;
            case "2":
                return PROP_TERCEIROS_EM_POSSE_INFORMANTE;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo PropriedadeEPosseItem");
    }
}

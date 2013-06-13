/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public enum MotivoInventario implements EnumCodificado {

    FINAL_PERIODO("01"),
    MUDANCA_TRIBUTACAO("02"),
    BAIXA_CADASTRAL_E_OUTRAS("03"),
    ALTERACAO_REGIME_PAG("04"),
    DETERMINACAO_FISCO("05");
    private String codigo;

    private MotivoInventario(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public MotivoInventario parse(String codigo) throws ParseException {
        switch (codigo) {
            case "01":
                return FINAL_PERIODO;
            case "02":
                return MUDANCA_TRIBUTACAO;
            case "03":
                return BAIXA_CADASTRAL_E_OUTRAS;
            case "04":
                return ALTERACAO_REGIME_PAG;
            case "05":
                return DETERMINACAO_FISCO;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo MotivoInventario");
    }
}

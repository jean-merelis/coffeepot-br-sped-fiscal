/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Situação do Documento, referenciado no registro C100.
 * 
 * @author Jeandeson O. Merelis
 */
public enum SituacaoDocumento {
    REGULAR("00","Documento regular"),
    EXTEMPORANEA_REGULAR("01","Escrituração extemporânea de documento regular"),
    CANCELADO("02","Documento cancelado"),
    EXTEMPORANEA_CANCELADO("03","Escrituração extemporânea de documento cancelado"),
    DENEGADO("04","NF-e, NFC-e ou CT-e denegado"),
    NUM_INUTILIZADO("05","Numeração inutilizada"),
    COMPLEMENTAR("06","Documento Fiscal Complementar"),
    EXTEMPORANEA_COMPLEMENTAR("07","Escrituração extemporânea de documento complementar"),
    ESPECIAL("08","Documento Fiscal emitido com base em Regime Especial ou Norma Específica");

    private String codigo;
    private String descricao;

    private SituacaoDocumento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static SituacaoDocumento parse(String codigo) throws ParseException{
        if ("00".equals(codigo)) return REGULAR;
        if ("01".equals(codigo)) return EXTEMPORANEA_REGULAR;
        if ("02".equals(codigo)) return CANCELADO;
        if ("03".equals(codigo)) return EXTEMPORANEA_CANCELADO;
        if ("04".equals(codigo)) return DENEGADO;
        if ("05".equals(codigo)) return NUM_INUTILIZADO;
        if ("06".equals(codigo)) return COMPLEMENTAR;
        if ("07".equals(codigo)) return EXTEMPORANEA_COMPLEMENTAR;
        if ("08".equals(codigo)) return ESPECIAL;
        
        throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo SituacaoDocumento");
    }
}

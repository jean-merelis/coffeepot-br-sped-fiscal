/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador de período de apuração do IPI, referenciado no registro C170.
 * @author Jeandeson O. Merelis
 */
public enum ApuracaoIpi implements EnumCodificado{
    MENSAL('0'),
    DECENDIAL('1');
    
    private char codigo;

    private ApuracaoIpi(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
    
    @Override
    public ApuracaoIpi parse(String codigo) throws ParseException{
        if (codigo == null || codigo.length() != 1){
            throw new ParseException("Não foi possível conveter para o tipo ApuracaoIpi");
        }
        return parse(codigo.charAt(0));
    }
    
    public static ApuracaoIpi parse(char codigo) throws ParseException{
        switch (codigo){
            case '0': return MENSAL;
            case '1': return DECENDIAL;
            default : throw new ParseException("Não foi possível conveter para o tipo ApuracaoIpi");
        }
    }
}

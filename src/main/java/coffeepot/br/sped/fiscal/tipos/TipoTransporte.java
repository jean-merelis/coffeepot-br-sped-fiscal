/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Indicador do tipo de transporte, referenciado no registro C115.
 * @author Jeandeson O. Merelis
 */
public enum TipoTransporte implements EnumCodificado{
    RODOVIARIO('0'),
    FERROVIARIO('1'),
    RODO_FERRROVIARIO('2'),
    AQUAVIARIO('3'),
    DUTOVIARIO('4'),
    AEREO('5'),
    OUTROS('9');
    
    private char codigo;

    private TipoTransporte(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }

    @Override
    public TipoTransporte parse(String codigo) throws ParseException{
        switch (codigo){
            case "0": return RODOVIARIO;
            case "1": return FERROVIARIO;
            case "2": return RODO_FERRROVIARIO;
            case "3": return AQUAVIARIO;
            case "4": return DUTOVIARIO;
            case "5": return AEREO;
            case "9": return OUTROS;
            default :  throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo TipoTransporte");
        }
    }
}

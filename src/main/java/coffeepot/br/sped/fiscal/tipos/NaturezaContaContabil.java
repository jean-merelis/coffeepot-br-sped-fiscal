/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Natureza da conta/grupo de contas do plano de contas contábil.
 * 
 * @author Jeandeson O. Merelis
 */
public enum NaturezaContaContabil {
    /**
     * Contas de ativo.
     */
    ATIVO("01","Contas de ativo"),
    /**
     * Contas de passivo.
     */
    PASSIVO("02","Contas de passivo"),
    /**
     * Patrimônio líquido.
     */
    PATRIMONIOLIQUIDO("03","Patrimônio líquido"),
    /**
     * Contas de resultado.
     */
    RESULTADO("04","Contas de resultado"),
    /**
     * Contas de compensação.
     */
    COMPENSACAO("05","Contas de compensação"),
    /**
     * Outras.
     */
    OUTRAS("09","Outras");
    
    private String codigo;
    private String descricao;

    private NaturezaContaContabil(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static NaturezaContaContabil parse(String codigo) throws ParseException{        
        switch (codigo){
            case "01": return ATIVO;
            case "02": return PASSIVO;
            case "03": return PATRIMONIOLIQUIDO;
            case "04": return RESULTADO;
            case "05": return COMPENSACAO;
            case "09": return OUTRAS;
            default: throw new ParseException("Não foi possível converter o código \""+codigo+"\" para o tipo NaturezaContaContabil");
        }
    }
}

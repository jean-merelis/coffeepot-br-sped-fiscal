/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Tipo de documento fiscal, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum DocumentoFiscal  implements EnumCodificado{

    NOTA_FISCAL("01", "Nota Fiscal, modelo 1"),
    NOTA_FISCAL_AVULSA("1B", "Nota Fiscal Avulsa"),
    NOTA_FISCAL_VENDA_CONSUMIDOR("02", "Nota Fiscal de Venda a Consumidor, modelo 02"),
    CUPOM_FISCAL("2D", "Cupom Fiscal"),
    CUPOM_FISCAL_BILHETE_PASSAGEM("2E", "Cupom Fiscal Bilhete de Passagem"),
    NOTA_FISCAL_PRODUTOR("04", "Nota Fiscal de Produtor, modelo 4"),
    NOTA_FISCAL_ENERGIA_ELETRICA("06", "Nota Fiscal de Energia Elétrica, modelo 6"),
    NOTA_FISCAL_SERVICO_TRANSPORTE("07", "Nota Fiscal de Serviço de Transporte, modelo 7"),
    CONHEC_TRANSP_RODOVIARIO_CARGAS("08", "Conhecimento de Transporte Rodoviário de Cargas, modelo 8"),
    CONHEC_TRANSP_CARGAS_AVULSO("8B", "Conhecimento de Transporte de Cargas Avulso"),
    CONHEC_TRANSP_AQUAVIARIO_CARGAS("09", "Conhecimento de Transporte Aquaviário de Cargas, modelo 9"),
    CONHEC_TRANSP_AEREO("10", "Conhecimento Aéreo, modelo 10"),
    CONHEC_TRANSP_FERROVIARIO_CARGAS("11", "Conhecimento de Transporte Ferroviário de Cargas, modelo 11"),
    BILHETE_PASSAGEM_RODOVIARIO("13", "Bilhete de Passagem Rodoviário, modelo 13"),
    BILHETE_PASSAGEM_AQUAVIARIO("14", "Bilhete de Passagem Aquaviário, modelo 14"),
    BILHETE_PASSAGEM_NOTA_BAGAGEM("15", "Bilhete de Passagem e Nota de Bagagem, modelo 15"),
    BILHETE_PASSAGEM_FERROVIARIO("16", "Bilhete de Passagem Ferroviário, modelo 16"),
    DESPACHO_TRANSPORTE("17", "Despacho de Transporte, modelo 17"),
    RESUMO_MOVIMENTO_DIARIO("18", "Resumo Movimento Diário, modelo 18"),
    ORDEM_COLETA_CARGA("20", "Ordem de Coleta de Carga, modelo 20"),
    NOTA_FISCAL_SERVICO_COMUNICACAO("21", "Nota Fiscal de Serviço de Comunicação, modelo 21"),
    NOTA_FISCAL_SERVICO_TELECOMUNICACAO("22", "Nota Fiscal de Serviço de Telecomunicações, modelo 22"),
    GNRE("23", "GNRE"),
    AUTORIZACAO_CARREGAMENTO_TRANSPORTE("24", "Autorização de Carregamento e Transporte, modelo 24"),
    MANIFESTO_DE_CARGA("25", "Manifesto de Carga, modelo 25"),
    CONHEC_TRANSP_MULTIMODAL_CARGAS("26", "Conhecimento de Transporte Multimodal de Cargas, modelo 26"),
    NOTA_FISCAL_SERVICO_TRANSP_FERROVIARIO_CARGA("27", "Nota Fiscal de Serviço de Transporte Ferroviário de Cargas"),
    NOTA_FISCAL_FORNECIMENTO_GAS("28", "Nota Fiscal/Conta de Fornecimento de Gás Canalizado"),
    NOTA_FISCAL_FORNECIMENTO_AGUA("29", "Nota Fiscal/Conta De Fornecimento D'água Canalizada"),
    NOTA_FISCAL_ELETRONICA("55", "Nota Fiscal Eletrônica (NF-e), modelo 55"),
    CONHECIMENTO_TRANSPORTE_ELETRONICO("57", "Conhecimento de Transporte Eletrônico (CT-e), modelo 57"),
    CUPOM_FISCAL_ELETRONICO("59", "Cupom Fiscal Eletrônico (CF-e)"),
    CUPOM_FISCAL_ELETRONICO_ECF("60", "Cupom Fiscal Eletrônico (CF-e-ECF)"),
    NOTA_FISCAL_ELETRONICA_CONSUMIDOR("65", "Nota Fiscal  Eletrônica para Consumidor Final");
    private String codigo;
    private String descricao;

    private DocumentoFiscal(String codigo, String descricao) {
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
    public DocumentoFiscal parse(String codigo) throws ParseException {
        if (codigo == null) {
            throw new ParseException();
        }

        switch (codigo) {
            case "01":  return NOTA_FISCAL;
            case "1B":  return NOTA_FISCAL_AVULSA;
            case "02":  return NOTA_FISCAL_VENDA_CONSUMIDOR;
            case "2D":  return CUPOM_FISCAL;
            case "2E":  return CUPOM_FISCAL_BILHETE_PASSAGEM;
            case "04":  return NOTA_FISCAL_PRODUTOR;
            case "06":  return NOTA_FISCAL_ENERGIA_ELETRICA;
            case "07":  return NOTA_FISCAL_SERVICO_TRANSPORTE;
            case "08":  return CONHEC_TRANSP_RODOVIARIO_CARGAS;
            case "8B":  return CONHEC_TRANSP_CARGAS_AVULSO;
            case "09":  return CONHEC_TRANSP_AQUAVIARIO_CARGAS;
            case "10":  return CONHEC_TRANSP_AEREO;
            case "11":  return CONHEC_TRANSP_FERROVIARIO_CARGAS;
            case "13":  return BILHETE_PASSAGEM_RODOVIARIO;
            case "14":  return BILHETE_PASSAGEM_AQUAVIARIO;
            case "15":  return BILHETE_PASSAGEM_NOTA_BAGAGEM;
            case "16":  return BILHETE_PASSAGEM_FERROVIARIO;
            case "17":  return DESPACHO_TRANSPORTE;
            case "18":  return RESUMO_MOVIMENTO_DIARIO;
            case "20":  return ORDEM_COLETA_CARGA;
            case "21":  return NOTA_FISCAL_SERVICO_COMUNICACAO;
            case "22":  return NOTA_FISCAL_SERVICO_TELECOMUNICACAO;
            case "23":  return GNRE;
            case "24":  return AUTORIZACAO_CARREGAMENTO_TRANSPORTE;
            case "25":  return MANIFESTO_DE_CARGA;
            case "26":  return CONHEC_TRANSP_MULTIMODAL_CARGAS;
            case "27":  return NOTA_FISCAL_SERVICO_TRANSP_FERROVIARIO_CARGA;
            case "28":  return NOTA_FISCAL_FORNECIMENTO_GAS;
            case "29":  return NOTA_FISCAL_FORNECIMENTO_AGUA;
            case "55":  return NOTA_FISCAL_ELETRONICA;
            case "57":  return CONHECIMENTO_TRANSPORTE_ELETRONICO;
            case "59":  return CUPOM_FISCAL_ELETRONICO;
            case "60":  return CUPOM_FISCAL_ELETRONICO_ECF;
            case "65":  return NOTA_FISCAL_ELETRONICA_CONSUMIDOR;
                
            default:
                throw new ParseException();
        }
    }
}

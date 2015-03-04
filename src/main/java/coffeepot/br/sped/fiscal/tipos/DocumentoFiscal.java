/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*Tamanho máximo do nome deve ser 50 caracteres tam. campo no BD*/
/**
 * Tipo de documento fiscal, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum DocumentoFiscal implements EnumCodificado {

    /**
     * Nota Fiscal, modelo 1
     */
    NOTA_FISCAL("01"),
    /**
     * Nota Fiscal Avulsa
     */
    NOTA_FISCAL_AVULSA("1B"),
    /**
     * Nota Fiscal de Venda a Consumidor, modelo 02
     */
    NOTA_FISCAL_VENDA_CONSUMIDOR("02"),
    /**
     * Cupom Fiscal
     */
    CUPOM_FISCAL("2D"),
    /**
     * Cupom Fiscal Bilhete de Passagem
     */
    CUPOM_FISCAL_BILHETE_PASSAGEM("2E"),
    /**
     * Nota Fiscal de Produtor, modelo 4
     */
    NOTA_FISCAL_PRODUTOR("04"),
    /**
     * Nota Fiscal de Energia Elétrica, modelo 6
     */
    NOTA_FISCAL_ENERGIA_ELETRICA("06"),
    /**
     * Nota Fiscal de Serviço de Transporte, modelo 7
     */
    NOTA_FISCAL_SERVICO_TRANSPORTE("07"),
    /**
     * Conhecimento de Transporte Rodoviário de Cargas, modelo 8
     */
    CONHEC_TRANSP_RODOVIARIO_CARGAS("08"),
    /**
     * Conhecimento de Transporte de Cargas Avulso
     */
    CONHEC_TRANSP_CARGAS_AVULSO("8B"),
    /**
     * Conhecimento de Transporte Aquaviário de Cargas, modelo 9
     */
    CONHEC_TRANSP_AQUAVIARIO_CARGAS("09"),
    /**
     * Conhecimento Aéreo, modelo 10
     */
    CONHEC_TRANSP_AEREO("10"),
    /**
     * Conhecimento de Transporte Ferroviário de Cargas, modelo 11
     */
    CONHEC_TRANSP_FERROVIARIO_CARGAS("11"),
    /**
     * Bilhete de Passagem Rodoviário, modelo 13
     */
    BILHETE_PASSAGEM_RODOVIARIO("13"),
    /**
     * Bilhete de Passagem Aquaviário, modelo 14
     */
    BILHETE_PASSAGEM_AQUAVIARIO("14"),
    /**
     * Bilhete de Passagem e Nota de Bagagem, modelo 15
     */
    BILHETE_PASSAGEM_NOTA_BAGAGEM("15"),
    /**
     * Bilhete de Passagem Ferroviário, modelo 16
     */
    BILHETE_PASSAGEM_FERROVIARIO("16"),
    /**
     * Despacho de Transporte, modelo 17
     */
    DESPACHO_TRANSPORTE("17"),
    /**
     * Resumo Movimento Diário, modelo 18
     */
    RESUMO_MOVIMENTO_DIARIO("18"),
    /**
     * Ordem de Coleta de Carga, modelo 20
     */
    ORDEM_COLETA_CARGA("20"),
    /**
     * Nota Fiscal de Serviço de Comunicação, modelo 21
     */
    NOTA_FISCAL_SERVICO_COMUNICACAO("21"),
    /**
     * Nota Fiscal de Serviço de Telecomunicações, modelo 22
     */
    NOTA_FISCAL_SERVICO_TELECOMUNICACAO("22"),
    /**
     * GNRE
     */
    GNRE("23"),
    /**
     * Autorização de Carregamento e Transporte, modelo 24
     */
    AUTORIZACAO_CARREGAMENTO_TRANSPORTE("24"),
    /**
     * Manifesto de Carga, modelo 25
     */
    MANIFESTO_DE_CARGA("25"),
    /**
     * Conhecimento de Transporte Multimodal de Cargas, modelo 26
     */
    CONHEC_TRANSP_MULTIMODAL_CARGAS("26"),
    /**
     * Nota Fiscal de Serviço de Transporte Ferroviário de Cargas
     */
    NOTA_FISCAL_SERVICO_TRANSP_FERROVIARIO_CARGA("27"),
    /**
     * Nota Fiscal/Conta de Fornecimento de Gás Canalizado
     */
    NOTA_FISCAL_FORNECIMENTO_GAS("28"),
    /**
     * Nota Fiscal/Conta De Fornecimento D'água Canalizada
     */
    NOTA_FISCAL_FORNECIMENTO_AGUA("29"),
    /**
     * Nota Fiscal Eletrônica (NF-e), modelo 55
     */
    NOTA_FISCAL_ELETRONICA("55"),
    /**
     * Conhecimento de Transporte Eletrônico (CT-e), modelo 57
     */
    CONHECIMENTO_TRANSPORTE_ELETRONICO("57"),
    /**
     * Cupom Fiscal Eletrônico (CF-e)
     */
    CUPOM_FISCAL_ELETRONICO("59"),
    /**
     * Cupom Fiscal Eletrônico (CF-e-ECF)
     */
    CUPOM_FISCAL_ELETRONICO_ECF("60"),
    /**
     * Nota Fiscal Eletrônica para Consumidor Final
     */
    NOTA_FISCAL_ELETRONICA_CONSUMIDOR("65");

    private final String codigo;

    private DocumentoFiscal(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getLabel() {
        return getClass().getName() + "." + name();
    }

    
        
    public static DocumentoFiscal parseDocumentoFiscal(String codigo) throws ParseException {
       return NOTA_FISCAL_ELETRONICA.parse(codigo);
    }
    
    @Override
    public DocumentoFiscal parse(String codigo) throws ParseException {
        if (codigo == null) {
            throw new ParseException();
        }

        switch (codigo) {
            case "01":
                return NOTA_FISCAL;
            case "1B":
                return NOTA_FISCAL_AVULSA;
            case "02":
                return NOTA_FISCAL_VENDA_CONSUMIDOR;
            case "2D":
                return CUPOM_FISCAL;
            case "2E":
                return CUPOM_FISCAL_BILHETE_PASSAGEM;
            case "04":
                return NOTA_FISCAL_PRODUTOR;
            case "06":
                return NOTA_FISCAL_ENERGIA_ELETRICA;
            case "07":
                return NOTA_FISCAL_SERVICO_TRANSPORTE;
            case "08":
                return CONHEC_TRANSP_RODOVIARIO_CARGAS;
            case "8B":
                return CONHEC_TRANSP_CARGAS_AVULSO;
            case "09":
                return CONHEC_TRANSP_AQUAVIARIO_CARGAS;
            case "10":
                return CONHEC_TRANSP_AEREO;
            case "11":
                return CONHEC_TRANSP_FERROVIARIO_CARGAS;
            case "13":
                return BILHETE_PASSAGEM_RODOVIARIO;
            case "14":
                return BILHETE_PASSAGEM_AQUAVIARIO;
            case "15":
                return BILHETE_PASSAGEM_NOTA_BAGAGEM;
            case "16":
                return BILHETE_PASSAGEM_FERROVIARIO;
            case "17":
                return DESPACHO_TRANSPORTE;
            case "18":
                return RESUMO_MOVIMENTO_DIARIO;
            case "20":
                return ORDEM_COLETA_CARGA;
            case "21":
                return NOTA_FISCAL_SERVICO_COMUNICACAO;
            case "22":
                return NOTA_FISCAL_SERVICO_TELECOMUNICACAO;
            case "23":
                return GNRE;
            case "24":
                return AUTORIZACAO_CARREGAMENTO_TRANSPORTE;
            case "25":
                return MANIFESTO_DE_CARGA;
            case "26":
                return CONHEC_TRANSP_MULTIMODAL_CARGAS;
            case "27":
                return NOTA_FISCAL_SERVICO_TRANSP_FERROVIARIO_CARGA;
            case "28":
                return NOTA_FISCAL_FORNECIMENTO_GAS;
            case "29":
                return NOTA_FISCAL_FORNECIMENTO_AGUA;
            case "55":
                return NOTA_FISCAL_ELETRONICA;
            case "57":
                return CONHECIMENTO_TRANSPORTE_ELETRONICO;
            case "59":
                return CUPOM_FISCAL_ELETRONICO;
            case "60":
                return CUPOM_FISCAL_ELETRONICO_ECF;
            case "65":
                return NOTA_FISCAL_ELETRONICA_CONSUMIDOR;

            default:
                throw new ParseException();
        }
    }
}

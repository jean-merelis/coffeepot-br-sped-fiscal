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

/**
 * Tipo de documento fiscal, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum DocumentoFiscal implements EnumCodificado {

    /**
     * Nota Fiscal, modelo 1
     */
    M01("01"),
    /**
     * Nota Fiscal Avulsa
     */
    M1B("1B"),
    /**
     * Nota Fiscal de Venda a Consumidor, modelo 02
     */
    M02("02"),
    /**
     * Cupom Fiscal
     */
    M2D("2D"),
    /**
     * Cupom Fiscal Bilhete de Passagem
     */
    M2E("2E"),
    /**
     * Nota Fiscal de Produtor, modelo 4
     */
    M04("04"),
    /**
     * Nota Fiscal de Energia Elétrica, modelo 6
     */
    M06("06"),
    /**
     * Nota Fiscal de Serviço de Transporte, modelo 7
     */
    M07("07"),
    /**
     * Conhecimento de Transporte Rodoviário de Cargas, modelo 8
     */
    M08("08"),
    /**
     * Conhecimento de Transporte de Cargas Avulso
     */
    M8B("8B"),
    /**
     * Conhecimento de Transporte Aquaviário de Cargas, modelo 9
     */
    M09("09"),
    /**
     * Conhecimento Aéreo, modelo 10
     */
    M10("10"),
    /**
     * Conhecimento de Transporte Ferroviário de Cargas, modelo 11
     */
    M11("11"),
    /**
     * Bilhete de Passagem Rodoviário, modelo 13
     */
    M13("13"),
    /**
     * Bilhete de Passagem Aquaviário, modelo 14
     */
    M14("14"),
    /**
     * Bilhete de Passagem e Nota de Bagagem, modelo 15
     */
    M15("15"),
    /**
     * Bilhete de Passagem Ferroviário, modelo 16
     */
    M16("16"),
    /**
     * Despacho de Transporte, modelo 17
     */
    M17("17"),
    /**
     * Resumo Movimento Diário, modelo 18
     */
    M18("18"),
    /**
     * Ordem de Coleta de Carga, modelo 20
     */
    M20("20"),
    /**
     * Nota Fiscal de Serviço de Comunicação, modelo 21
     */
    M21("21"),
    /**
     * Nota Fiscal de Serviço de Telecomunicações, modelo 22
     */
    M22("22"),
    /**
     * GNRE
     */
    M23("23"),
    /**
     * Autorização de Carregamento e Transporte, modelo 24
     */
    M24("24"),
    /**
     * Manifesto de Carga, modelo 25
     */
    M25("25"),
    /**
     * Conhecimento de Transporte Multimodal de Cargas, modelo 26
     */
    M26("26"),
    /**
     * Nota Fiscal de Serviço de Transporte Ferroviário de Cargas
     */
    M27("27"),
    /**
     * Nota Fiscal/Conta de Fornecimento de Gás Canalizado
     */
    M28("28"),
    /**
     * Nota Fiscal/Conta De Fornecimento D'água Canalizada
     */
    M29("29"),
    /**
     * Nota Fiscal Eletrônica (NF-e), modelo 55
     */
    M55("55"),
    /**
     * Conhecimento de Transporte Eletrônico (CT-e), modelo 57
     */
    M57("57"),
    /**
     * Cupom Fiscal Eletrônico (CF-e)
     */
    M59("59"),
    /**
     * Cupom Fiscal Eletrônico (CF-e-ECF)
     */
    M60("60"),
    /**
     * Nota Fiscal Eletrônica para Consumidor Final
     */
    M65("65");

    private final String codigo;

    private DocumentoFiscal(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static DocumentoFiscal parseDocumentoFiscal( String codigo ) throws ParseException {
        if (codigo == null) {
            return null;
        }

        try {
            return DocumentoFiscal.valueOf( "M" + codigo );
        } catch (Exception ex) {
            throw new ParseException();
        }
    }

    @Override
    public DocumentoFiscal parse(String codigo) throws ParseException {
        return parseDocumentoFiscal( codigo );
    }
}

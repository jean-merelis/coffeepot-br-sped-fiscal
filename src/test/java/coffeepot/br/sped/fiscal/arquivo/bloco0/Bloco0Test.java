/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import coffeepot.bean.wr.reader.UnknownRecordException;
import coffeepot.bean.wr.typeHandler.HandlerParseException;

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


import coffeepot.br.sped.fiscal.arquivo.EstruturaTest;
import coffeepot.br.sped.fiscal.reader.SpedFiscalReader;
import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IdentificacaoMercadoria;
import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.Perfil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Bloco0Test {
    /* alguns registros só podem conter uma ocorrência no arquivo ou no bloco...
     verifique a documentação do Sped Fiscal para maiores detalhes,
     * você também pode conferir a classe do bloco que também tem o mapeamento e as cardinalidades.
     */

    @Test
    public void testBloco0() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO 0 inteiro ***");
    	Bloco0 bloco0 = createBloco0();

        try {
            String file = EstruturaTest.TEST_BLOCO_OUT_DIR + "Bloco0Test.tmp";
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco0);
            spedFiscalWriter.flush();

            // escreve registro 0990
            long countRecords = Util.countRecords(file, 0);
            Reg0990 reg0990 = new Reg0990(countRecords+1);
            spedFiscalWriter.write(reg0990);


            spedFiscalWriter.flush();
            spedFiscalWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void Bloco0Version10Test() throws UnknownRecordException, HandlerParseException, Exception {
    	try {
            StringWriter sw = new StringWriter();
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(sw, VersaoLayout.VERSAO_010);


            Reg0001 registroAbertura = new Reg0001(IndicadorMovimento.COM_DADOS);
            Reg0200 registro = new Reg0200();
            registro.setCest("123124");
            Reg0990 registroFechamento = new Reg0990(3L);

            spedFiscalWriter.write(registroAbertura);
            spedFiscalWriter.write(registro);
            spedFiscalWriter.write(registroFechamento);
            spedFiscalWriter.flush();
            spedFiscalWriter.close();

            try (StringReader sr = new StringReader(sw.toString())) {
            	SpedFiscalReader reader = new SpedFiscalReader(sr, VersaoLayout.VERSAO_010);
            	Bloco0 bloco0 = reader.parseToBloco0();
            	assertNull( bloco0.getReg0200List().get(0).getCest());
            }

        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void Bloco0Version11Test() throws UnknownRecordException, HandlerParseException, Exception {
    	try {
            StringWriter sw = new StringWriter();
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(sw, VersaoLayout.VERSAO_011);


            Reg0001 registroAbertura = new Reg0001(IndicadorMovimento.COM_DADOS);
            Reg0200 registro = new Reg0200();
            registro.setCest("123124");
            Reg0990 registroFechamento = new Reg0990(3L);

            spedFiscalWriter.write(registroAbertura);
            spedFiscalWriter.write(registro);
            spedFiscalWriter.write(registroFechamento);
            spedFiscalWriter.flush();
            spedFiscalWriter.close();

            try (StringReader sr = new StringReader(sw.toString())) {
            	SpedFiscalReader reader = new SpedFiscalReader(sr, VersaoLayout.VERSAO_011);
            	Bloco0 bloco0 = reader.parseToBloco0();
            	assertEquals("123124", bloco0.getReg0200List().get(0).getCest());
            }

        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Bloco0 createBloco0() {
        Bloco0 bloco0 = new Bloco0();
        bloco0.setReg0000(createReg0000());
        bloco0.setReg0001(createReg0001());
        bloco0.setReg0005(createReg0005());
        bloco0.setReg0015List(createReg0015List());
        bloco0.setReg0100(createReg0100());
        bloco0.setReg0150List(createReg0150List());
        bloco0.setReg0190List(createReg0190List());
        bloco0.setReg0200List(createReg0200List());
        bloco0.setReg0300List(createReg0300List());
        bloco0.setReg0400List(createReg0400List());
        bloco0.setReg0450List(createReg0450List());
        bloco0.setReg0460List(createReg0460List());
        bloco0.setReg0500List(createReg0500List());
        bloco0.setReg0600List(createReg0600List());
        return bloco0;
    }

    @Test
    public void testReg0000() throws Exception {
        System.out.println("testReg0000");
        Reg0000 reg = createReg0000();

        try {
            String file = EstruturaTest.TEST_REG_OUT_DIR + "Reg0000Test.txt";
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(reg);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();
            assertTrue(true);
        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Reg0000 createReg0000() {
        Reg0000 reg = new Reg0000();
        reg.setCnpj("12.123.123/0001-99");
        reg.setCodFin(FinalidadeArquivo.ARQUIVO_ORIGINAL);
        reg.setCodMun(555);
        reg.setCodVer(VersaoLayout.getLastVersionImpl());
        reg.setDtFin(new Date());
        reg.setDtIni(new Date());
        reg.setIe("AA-1516BBB-16.5");
        reg.setIm("adfdfa1111");
        reg.setIndAtiv(IndicadorAtividade.INDUSTRIAL);
        reg.setIndPerfil(Perfil.A);
        reg.setNome("EMPRESA FATURA PRA CARAMBA");
        reg.setUf("ES");

        return reg;
    }

    public static Reg0001 createReg0001() {
        Reg0001 reg = new Reg0001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

    public static Reg0005 createReg0005() {
        Reg0005 reg = new Reg0005();
        reg.setBairro("Bairro");
        reg.setCep("29.700-000");
        reg.setCompl("Complemento");
        reg.setEmail("email@email.com");
        reg.setEnd("Rua Sem Nome");
        reg.setFantasia("Nome fantasia");
        reg.setFax("(27)7777-5555");
        reg.setFone("(27)7777-5555");
        reg.setNum("s/n");
        return reg;
    }

    public static List<Reg0015> createReg0015List() {
        List<Reg0015> list = new LinkedList<>();

        Reg0015 reg = new Reg0015();
        reg.setUfSt("RJ");
        reg.setIeSt("IE SUBSTITUTO RJ");
        list.add(reg);

        reg = new Reg0015();
        reg.setUfSt("MG");
        reg.setIeSt("IE SUBSTITUTO MG");
        list.add(reg);

        reg = new Reg0015();
        reg.setUfSt("SP");
        reg.setIeSt("IE SUBSTITUTO SP");
        list.add(reg);

        return list;
    }

    public static Reg0100 createReg0100() {
        Reg0100 reg = new Reg0100();
        reg.setBairro("Bairro");
        reg.setCep("29.700-000");
        reg.setCompl("Complemento");
        reg.setEmail("email@email.com");
        reg.setEnd("Rua Sem Nome");
        reg.setFax("(27)7777-5555");
        reg.setFone("(27)7777-5555");
        reg.setNum("s/n");
        reg.setCnpj("12.123.123/0123-99");
        reg.setCrc("CRC 1516165161");
        reg.setCpf("123.123.123-99");
        reg.setNome("Contador João");
        return reg;
    }

    public static List<Reg0150> createReg0150List() {
        List<Reg0150> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(createReg0150());
        }
        return list;
    }

    public static Reg0150 createReg0150() {
        Reg0150 reg = new Reg0150();
        reg.setBairro("Bairro");
        reg.setCnpj("123.123.123/0001-99");
        reg.setCodMun(55);
        reg.setCodPais(1);
        reg.setCodPart(UUID.randomUUID().toString());
        reg.setCompl("Complemento");
        reg.setCpf("12345678901--11");
        reg.setEnd("Rua Qualquer");
        reg.setIe("0IE 0001234567A");
        reg.setNome("João da Silva");
        reg.setNum("S/N");

        List<Reg0175> list = new ArrayList<>();

        Reg0175 r0175 = new Reg0175();
        r0175.setDtAlt(new Date());
        r0175.setNrCamp(3);
        r0175.setContAnt("Joana da silva");

        list.add(r0175);

        r0175 = new Reg0175();
        r0175.setDtAlt(new Date());
        r0175.setNrCamp(10);
        r0175.setContAnt("Rua Sem Nome");
        list.add(r0175);

        reg.setReg0175List(list);

        return reg;
    }

    public static List<Reg0190> createReg0190List() {
        List<Reg0190> list = new LinkedList<>();

        Reg0190 reg = new Reg0190();
        reg.setUnid("un");
        reg.setDescr("Unidade");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("kg");
        reg.setDescr("Kilograma");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("m");
        reg.setDescr("Metro");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("cx");
        reg.setDescr("Caixa");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("kwh");
        reg.setDescr("Kilowatts/hora");
        list.add(reg);

        return list;
    }

    public static List<Reg0200> createReg0200List() {
        List<Reg0200> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(createReg0200());
        }
        return list;
    }

    public static Reg0200 createReg0200() {
        Reg0200 reg;
        Reg0205 reg0205;
        Reg0206 reg0206;
        Reg0220 reg0220;
        List<Reg0205> reg0205List;
        List<Reg0220> reg0220List;

        reg = new Reg0200();
        reg.setAliqIcms(17d);
        reg.setCodAntItem("CODIGO ANTERIOR");
        reg.setCodBarra("CODIGO DE BARRAS");
        reg.setCodGen("80");
        reg.setCodItem("CODIGO ITEM");
        reg.setCodNcm("NCM888888888");
        reg.setDescrItem("Descrição do item");
        reg.setExIpi("001");
        reg.setTipoItem("00");
        reg.setUnidInv("un");

        reg0205List = new ArrayList<>();
        reg0220List = new ArrayList<>();

        reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR");
        reg0205.setDescrAntItem("Descricao anterior");
        reg0205.setDtIni(new Date());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);
        reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR 2");
        reg0205.setDescrAntItem("Descricao anterior 2");
        reg0205.setDtIni(new Date());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);
        reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR 3");
        reg0205.setDescrAntItem("Descricao anterior 3");
        reg0205.setDtIni(new Date());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);

        reg0206 = new Reg0206();
        reg0206.setCodComb("CodigoComb");

        reg0220 = new Reg0220();
        reg0220.setUnidConv("cx");
        reg0220.setFatConv(12d);
        reg0220List.add(reg0220);
        reg0220 = new Reg0220();
        reg0220.setUnidConv("kg");
        reg0220.setFatConv(1000d);
        reg0220List.add(reg0220);

        reg.setReg0205List(reg0205List);
        reg.setReg0206(reg0206);
        reg.setReg0220List(reg0220List);

        return reg;

    }

    public static List<Reg0300> createReg0300List() {
        List<Reg0300> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(createReg0300());
        }
        return list;
    }

    public static Reg0300 createReg0300() {

        Reg0300 reg = new Reg0300();
        reg.setCodCta("COD CONTA CONTABIL");
        reg.setCodIndBem("Cod ind bem");
        reg.setCodPrnc("Cod prnc");
        reg.setDescrItem("Descr item");
        reg.setIdentMerc(IdentificacaoMercadoria.BEM);
        reg.setNrParc(3);

        Reg0305 reg0305 = new Reg0305();
        reg0305.setCodCcus("Cod ccus");
        reg0305.setFunc("Func");
        reg0305.setVidaUtil(12);

        reg.setReg0305(reg0305);

        return reg;
    }

    public static List<Reg0400> createReg0400List(){
        List<Reg0400> list = new LinkedList<>();

        Reg0400 reg = new Reg0400();
        reg.setCodNat("1");
        reg.setDescrNat("Vendas");
        list.add(reg);

        reg = new Reg0400();
        reg.setCodNat("2");
        reg.setDescrNat("Industrialização");
        list.add(reg);

        reg = new Reg0400();
        reg.setCodNat("3");
        reg.setDescrNat("Devolução");
        list.add(reg);

        return list;
    }

    public static List<Reg0450> createReg0450List()  {
        List<Reg0450> list = new LinkedList<>();

        Reg0450 reg = new Reg0450();
        reg.setCodInf("COD1");
        reg.setTxt("Texto da informação complementar  ");
        list.add(reg);

        reg = new Reg0450();
        reg.setCodInf("COD2");
        reg.setTxt("Texto da informação complementar 2");
        list.add(reg);

        return list;
    }

    public static List<Reg0460> createReg0460List(){
        List<Reg0460> list = new LinkedList<>();

        Reg0460 reg = new Reg0460();
        reg.setCodObs("COD1");
        reg.setTxt("Texto da observação");
        list.add(reg);

        reg = new Reg0460();
        reg.setCodObs("COD2");
        reg.setTxt("Texto da observação 2");
        list.add(reg);

        return list;
    }

    public static List<Reg0500>  createReg0500List(){
        List<Reg0500> list = new LinkedList<>();
        Reg0500 reg;

        reg = new Reg0500();
        reg.setCodCta("cod conta");
        reg.setCodNatCc(NaturezaContaContabil.ATIVO);
        reg.setDtAlt(new Date());
        reg.setIndCta(TipoContaContabil.SINTETICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta");
        list.add(reg);

        reg = new Reg0500();
        reg.setCodCta("cod conta 2");
        reg.setCodNatCc(NaturezaContaContabil.PASSIVO);
        reg.setDtAlt(new Date());
        reg.setIndCta(TipoContaContabil.ANALITICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta 2");
        list.add(reg);

        return list;

    }

    public static List<Reg0600> createReg0600List(){
        List<Reg0600> list = new LinkedList<>();
        Reg0600 reg;

        reg = new Reg0600();
        reg.setCodCcus("codigo centro custo");
        reg.setCcus("nome centro custo");
        reg.setDtAlt(new Date());
        list.add(reg);

        reg = new Reg0600();
        reg.setCodCcus("codigo centro custo 2");
        reg.setCcus("nome centro custo 2");
        reg.setDtAlt(new Date());
        list.add(reg);
        return list;
    }

//    private static Reg0990 createReg0990() {
//        return new Reg0990(60L);
//    }
}

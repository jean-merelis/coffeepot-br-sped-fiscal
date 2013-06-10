/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IdentificacaoMercadoria;
import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.Perfil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import coffeepot.br.sped.fiscal.tipos.TipoItem;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Bloco0Test {

    static Bloco0 instance;

    @BeforeClass
    public static void setUpClass() {

        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Bloco0Test.txt"), "ISO-8859-1"));
            instance = new Bloco0(fw);
        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @AfterClass
    public static void tearDownClass() {
        try {
            instance.getWriter().flush();
            instance.getWriter().close();
        } catch (IOException ex) {
            Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // @Test
    public void testPerformance() throws Exception {
        Writer oldWriter = instance.getWriter();
        try {
            try {
                Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PerformanceTest.txt"), "ISO-8859-1"));
                instance.setWriter(fw);
            } catch (IOException ex) {
                Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
            }

            Reg0000 reg = new Reg0000();
            reg.setCnpj("12.123.123/0001-99");
            reg.setCodFin(FinalidadeArquivo.ARQUIVO_ORIGINAL);
            reg.setCodMun(555);
            reg.setCodVer(6);
            reg.setDtFin(new Date());
            reg.setDtIni(new Date());
            reg.setIe("AA-1516BBB-16.5");
            reg.setIm("adfdfa1111");
            reg.setIndAtiv(IndicadorAtividade.INDUSTRIAL);
            reg.setIndPerfil(Perfil.A);
            reg.setNome("EMPRESA FATURA PRA CARAMBA");
            reg.setUf("ES");

            System.out.println("======== start at: " + new Date());
            for (int i = 0; i < 100000; i++) {
                instance.write(reg, 0);
            }
            System.out.println("======== finished at: " + new Date());




        } finally {
            instance.getWriter().flush();
            instance.getWriter().close();
            instance.setWriter(oldWriter);
        }
    }

    @Test
    public void testBloco0() throws Exception {
        Writer oldWriter = instance.getWriter();
        try {
            try {
                Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Bloco0.txt"), "ISO-8859-1"));
                instance.setWriter(fw);
            } catch (IOException ex) {
                Logger.getLogger(Bloco0Test.class.getName()).log(Level.SEVERE, null, ex);
            }

            testWriteFileWriterReg0000();
            testWriteIndicadorMovimento();

            testWriteFileWriterReg0005();
            testWriteFileWriterReg0015();
            testWriteFileWriterReg0015();
            testWriteFileWriterReg0100();
            testWriteFileWriterReg0150();
            testWriteFileWriterReg0190();
            testWriteFileWriterReg0200();
            testWriteFileWriterReg0200();
            testWriteFileWriterReg0200();
            testWriteFileWriterReg0300();
            testWriteFileWriterReg0300();
            testWriteFileWriterReg0300();
            testWriteFileWriterReg0400();
            testWriteFileWriterReg0450();
            testWriteFileWriterReg0460();
            testWriteFileWriterReg0500();
            testWriteFileWriterReg0600();


            instance.writeEncerramentoBloco();

        } finally {
            instance.getWriter().flush();
            instance.getWriter().close();
            instance.setWriter(oldWriter);
        }
    }

    public void testWriteFileWriterReg0000() throws Exception {
        System.out.println("testWriteFileWriterReg0000");

        Reg0000 reg = new Reg0000();
        reg.setCnpj("12.123.123/0001-99");
        reg.setCodFin(FinalidadeArquivo.ARQUIVO_ORIGINAL);
        reg.setCodMun(555);
        reg.setCodVer(6);
        reg.setDtFin(new Date());
        reg.setDtIni(new Date());
        reg.setIe("AA-1516BBB-16.5");
        reg.setIm("adfdfa1111");
        reg.setIndAtiv(IndicadorAtividade.INDUSTRIAL);
        reg.setIndPerfil(Perfil.A);
        reg.setNome("EMPRESA FATURA PRA CARAMBA");
        reg.setUf("ES");

        instance.write(reg, 1);
    }

    public void testWriteIndicadorMovimento() throws Exception {
        System.out.println("testWriteIndicadorMovimento");

        IndicadorMovimento indMov = IndicadorMovimento.COM_DADOS;

        instance.writeIndicadorMovimento(indMov);
    }

    public void testWriteFileWriterReg0005() throws Exception {
        System.out.println("testWriteFileWriterReg0005");
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


        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0015() throws Exception {
        System.out.println("testWriteFileWriterReg0015");
        Reg0015 reg = new Reg0015();
        reg.setUfSt("RJ");
        reg.setIeSt("IE SUBSTITUTO RJ");
        instance.write(reg, 1);

        reg = new Reg0015();
        reg.setUfSt("MG");
        reg.setIeSt("IE SUBSTITUTO MG");
        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0100() throws Exception {
        System.out.println("testWriteFileWriterReg0100");

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

        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0150() throws Exception {
        System.out.println("testWriteFileWriterReg0150");
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

        List<Reg0175> reg0175List = new ArrayList<>();

        Reg0175 r0175 = new Reg0175();
        r0175.setDtAlt(new Date());
        r0175.setNrCamp(3);
        r0175.setContAnt("Joana da silva");

        reg0175List.add(r0175);

        r0175 = new Reg0175();
        r0175.setDtAlt(new Date());
        r0175.setNrCamp(10);
        r0175.setContAnt("Rua Sem Nome");
        reg0175List.add(r0175);

        reg.setReg0175List(reg0175List);

        int i = 1;
        i += reg.getReg0175List().size();

        instance.write(reg, i);
    }

    public void testWriteFileWriterReg0190() throws Exception {
        System.out.println("testWriteFileWriterReg0190");



        Reg0190 reg = new Reg0190();
        reg.setUnid("un");
        reg.setDescr("Unidade");
        instance.write(reg, 1);

        reg = new Reg0190();
        reg.setUnid("kg");
        reg.setDescr("Kilograma");
        instance.write(reg, 1);
        reg = new Reg0190();
        reg.setUnid("m");
        reg.setDescr("Metro");
        instance.write(reg, 1);
        reg = new Reg0190();
        reg.setUnid("cx");
        reg.setDescr("Caixa");
        instance.write(reg, 1);
        reg = new Reg0190();
        reg.setUnid("kwh");
        reg.setDescr("Kilowatts/hora");
        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0200() throws Exception {
        System.out.println("testWriteFileWriterReg0200");


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
        reg.setTipoItem(TipoItem.MERCADORIA_REVENDA);
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

        int i = 2;
        i+= reg.getReg0205List().size();
        i+= reg.getReg0220List().size();

        instance.write(reg, i);

    }

    public void testWriteFileWriterReg0300() throws Exception {
        System.out.println("testWriteFileWriterReg0300");
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

        instance.write(reg, 2);
    }

    public void testWriteFileWriterReg0400() throws Exception {
        System.out.println("testWriteFileWriterReg0400");



        Reg0400 reg = new Reg0400();
        reg.setCodNat("1");
        reg.setDescrNat("Vendas");
        instance.write(reg, 1);

        reg = new Reg0400();
        reg.setCodNat("2");
        reg.setDescrNat("Industrialização");
        instance.write(reg, 1);
        reg = new Reg0400();
        reg.setCodNat("3");
        reg.setDescrNat("Devolução");
        instance.write(reg, 1);

    }

    public void testWriteFileWriterReg0450() throws Exception {
        System.out.println("testWriteFileWriterReg0450");



        Reg0450 reg = new Reg0450();
        reg.setCodInf("COD1");
        reg.setTxt("Texto da informação complementar  ");
        instance.write(reg, 1);

        reg = new Reg0450();
        reg.setCodInf("COD2");
        reg.setTxt("Texto da informação complementar 2");
        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0460() throws Exception {
        System.out.println("testWriteFileWriterReg0460");



        Reg0460 reg = new Reg0460();
        reg.setCodObs("COD1");
        reg.setTxt("Texto da observação");
        instance.write(reg, 1);

        reg = new Reg0460();
        reg.setCodObs("COD2");
        reg.setTxt("Texto da observação 2");
        instance.write(reg, 1);
    }

    public void testWriteFileWriterReg0500() throws Exception {
        System.out.println("testWriteFileWriterReg0500");

        Reg0500 reg;

        reg = new Reg0500();
        reg.setCodCta("cod conta");
        reg.setCodNatCc(NaturezaContaContabil.ATIVO);
        reg.setDtAlt(new Date());
        reg.setIndCta(TipoContaContabil.SINTETICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta");
        instance.write(reg, 1);

        reg = new Reg0500();
        reg.setCodCta("cod conta 2");
        reg.setCodNatCc(NaturezaContaContabil.PASSIVO);
        reg.setDtAlt(new Date());
        reg.setIndCta(TipoContaContabil.ANALITICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta 2");
        instance.write(reg, 1);

    }

    public void testWriteFileWriterReg0600() throws Exception {
        System.out.println("testWriteFileWriterReg0600");



        Reg0600 reg;

        reg = new Reg0600();
        reg.setCodCcus("codigo centro custo");
        reg.setCcus("nome centro custo");
        reg.setDtAlt(new Date());
        instance.write(reg, 1);

        reg = new Reg0600();
        reg.setCodCcus("codigo centro custo 2");
        reg.setCcus("nome centro custo 2");
        reg.setDtAlt(new Date());
        instance.write(reg, 1);
    }
}
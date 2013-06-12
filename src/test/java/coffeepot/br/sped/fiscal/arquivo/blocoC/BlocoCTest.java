/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

import coffeepot.br.sped.fiscal.arquivo.EstruturaTest;
import coffeepot.br.sped.fiscal.tipos.ApuracaoIpi;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import coffeepot.br.sped.fiscal.tipos.TipoTituloCredito;
import coffeepot.br.sped.fiscal.tipos.TipoTransporte;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class BlocoCTest {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO C inteiro ***");

        BlocoC bloco = createBlocoC();

        try {
            String file = EstruturaTest.TEST_BLOCO_OUT_DIR + "BlocoCTest.txt";
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.writerFlush();
            spedFiscalWriter.writerClose();
        } catch (IOException ex) {
            Logger.getLogger(BlocoCTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static BlocoC createBlocoC() {
        BlocoC bloco = new BlocoC();
        bloco.setRegC001(createReg0001());
        bloco.setRegC100List(createRegC100List());
        //TODO: completar testes bloco C
        //bloco.setRegC300List(createRegC300List());

        bloco.setRegC990(createRegC990());
        return bloco;
    }

    public static RegC001 createReg0001() {
        RegC001 reg = new RegC001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

    public static List<RegC100> createRegC100List() {
        List<RegC100> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(createRegC100());
        }
        return list;
    }

    public static RegC100 createRegC100() {

        RegC100 reg = new RegC100();
        reg.setChvNfe("1234567890 1234567890 1234567890 1234567890 1234");
        reg.setCodMod(DocumentoFiscal.NOTA_FISCAL_ELETRONICA);
        reg.setCodPart("0001");
        reg.setCodSit(SituacaoDocumento.REGULAR);
        reg.setDtDoc(new Date());
        reg.setIndEmit(EmissaoDocumento.PROPRIA);
        reg.setIndFrt(Frete.EMITENTE);
        reg.setIndOper(Operacao.SAIDA);
        reg.setIndPgto(CondicaoPagamento.A_VISTA);
        reg.setNumDoc(1L);
        reg.setSer("1");
        reg.setVlAbatNt(10d);
        reg.setVlBcIcms(100.0);
        reg.setVlBcIcmsSt(55.0);
        reg.setVlCofins(100.0);
        reg.setVlSeg(50.0);
        reg.setVlPisSt(50.0);
        reg.setVlPis(50.0);
        reg.setVlOutDa(30.0);
        reg.setVlMerc(100.0);
        reg.setVlIpi(20.0);
        reg.setVlSeg(99.0);
        reg.setVlCofinsSt(123.99);

        RegC105 rc105 = new RegC105();
        rc105.setOper(0);
        rc105.setUf("SP");


        reg.setRegC105(rc105);
        reg.setRegC110List(createRegC110List());
        reg.setRegC120List(createRegC120List());
        reg.setRegC130(createRegC130());
        reg.setRegC140(createRegC140());
        reg.setRegC160(createRegC160());
        reg.setRegC165List(createRegC165List());
        reg.setRegC170List(createRegC170List());
        reg.setRegC190List(createRegC190List());
        reg.setRegC195List(createRegC195List());

        int i = 1; //c100
        i++;  // reg 105
        i += reg.getRegC110List().size();
        for (RegC110 r : reg.getRegC110List()) {
            i += r.getRegC111List().size();
            i += r.getRegC112List().size();
            i += r.getRegC113List().size();
            i += r.getRegC114List().size();
            i += r.getRegC115List().size();
            i += r.getRegC116List().size();
        }

        i += reg.getRegC120List().size();
        i++;// reg 130
        i++;// reg 140
        //141
        i += reg.getRegC140().getRegC141List().size();
        i++;// reg 160
        i += reg.getRegC165List().size();
        // total de registro 170...
        i += reg.getRegC170List().size();
        for (RegC170 r : reg.getRegC170List()) {
            i += r.getRegC171List().size();
            i += r.getRegC172List().size();
            i += r.getRegC173List().size();
            i += r.getRegC174List().size();
            i += r.getRegC175List().size();
            i += r.getRegC176List().size();
            i++; //RegC177
            i++; //RegC178
            i++; //RegC179            
        }

        i += reg.getRegC190List().size();
        i += reg.getRegC195List().size();
        for (RegC195 r : reg.getRegC195List()) {
            i += r.getRegC197List().size();
        }

        return reg;
    }

    //<editor-fold defaultstate="collapsed" desc="createRegC1..">
    //<editor-fold defaultstate="collapsed" desc="createRegC110List">
    public static List<RegC110> createRegC110List() {
        List<RegC110> list = new LinkedList<>();
        list.add(createRegC110());
        list.add(createRegC110());
        list.add(createRegC110());
        return list;
    }

    public static RegC110 createRegC110() {
        RegC110 reg = new RegC110();
        reg.setCodInf("123");
        reg.setTxtCompl("Texto complementar");
        //--
        reg.setRegC111List(createRegC111List());
        reg.setRegC112List(createRegC112List());
        reg.setRegC113List(createRegC113List());
        reg.setRegC114List(createRegC114List());
        reg.setRegC115List(createRegC115List());
        reg.setRegC116List(createRegC116List());
        //--
        return reg;
    }

    public static List<RegC111> createRegC111List() {
        List<RegC111> list = new LinkedList<>();
        list.add(createRegC111());
        list.add(createRegC111());
        list.add(createRegC111());
        return list;
    }

    public static RegC111 createRegC111() {
        RegC111 reg = new RegC111();
        reg.setIndProc(RegC111.OrigemProcesso.SEFAZ);
        reg.setNumProc("Numero processo 1321654");
        return reg;
    }

    public static List<RegC112> createRegC112List() {
        List<RegC112> list = new LinkedList<>();
        list.add(createRegC112());
        list.add(createRegC112());
        list.add(createRegC112());
        return list;
    }

    public static RegC112 createRegC112() {
        RegC112 reg = new RegC112();
        reg.setCodAut("Cod aut");
        reg.setCodDa(RegC112.DocumentoArrecadacao.GNRE);
        reg.setDtPgto(new Date());
        reg.setDtVcto(new Date());
        reg.setNumDa("num DA");
        reg.setUf("ES");
        reg.setVlDa(88.0);
        return reg;
    }

    public static List<RegC113> createRegC113List() {
        List<RegC113> list = new LinkedList<>();
        list.add(createRegC113());
        list.add(createRegC113());
        list.add(createRegC113());
        return list;
    }

    public static RegC113 createRegC113() {
        RegC113 reg = new RegC113();
        reg.setCodMod(DocumentoFiscal.BILHETE_PASSAGEM_FERROVIARIO);
        reg.setCodPart("0001");
        reg.setDtDoc(new Date());
        reg.setIndEmit(EmissaoDocumento.TERCEIROS);
        reg.setIndOper(Operacao.ENTRADA);
        reg.setNumDoc(123L);
        reg.setSer("1");
        reg.setSub(1);
        return reg;
    }

    public static List<RegC114> createRegC114List() {
        List<RegC114> list = new LinkedList<>();
        list.add(createRegC114());
        list.add(createRegC114());
        list.add(createRegC114());
        return list;
    }

    public static RegC114 createRegC114() {
        RegC114 reg = new RegC114();
        reg.setCodMod(DocumentoFiscal.BILHETE_PASSAGEM_FERROVIARIO);
        reg.setDtDoc(new Date());
        reg.setEcfCx(1);
        reg.setEcfFab("FAB000000000000000000001");
        reg.setNumDoc(123L);
        return reg;
    }

    public static List<RegC115> createRegC115List() {
        List<RegC115> list = new LinkedList<>();
        list.add(createRegC115());
        list.add(createRegC115());
        list.add(createRegC115());
        return list;
    }

    public static RegC115 createRegC115() {
        RegC115 reg = new RegC115();
        reg.setCnpjCol("1231.12131-12adf");
        reg.setCnpjEntg("12.123.123/0000-00");
        reg.setCodMunCol(1);
        reg.setCodMunEntg(2);
        reg.setIeCol("IE COLETA");
        reg.setIeEntg("Ie Entrega");
        reg.setIndCarga(TipoTransporte.RODOVIARIO);
        return reg;
    }

    public static List<RegC116> createRegC116List() {
        List<RegC116> list = new LinkedList<>();
        list.add(createRegC116());
        list.add(createRegC116());
        list.add(createRegC116());
        return list;
    }

    public static RegC116 createRegC116() {
        RegC116 reg = new RegC116();
        reg.setChvCfe("1234567890 1234567890 1234564567890 1234567890 1234");
        reg.setCodMod(DocumentoFiscal.NOTA_FISCAL_ELETRONICA_CONSUMIDOR);
        reg.setDtDoc(new Date());
        reg.setNrSat("000000001");
        reg.setNumCfe(123);
        return reg;
    }
    //</editor-fold>

    public static List<RegC120> createRegC120List() {
        List<RegC120> list = new LinkedList<>();
        list.add(createRegC120());
        list.add(createRegC120());
        list.add(createRegC120());
        return list;
    }

    public static RegC120 createRegC120() {
        RegC120 reg = new RegC120();
        reg.setCodDocImp(DocumentoImportacao.DECLARACAO_IMPORTACAO);
        reg.setCofinsImp(123.99);
        reg.setNumAcdraw("num acdraw");
        reg.setNumDocImp("123456");
        reg.setPisImp(321.99);
        return reg;
    }

    public static RegC130 createRegC130() {
        RegC130 reg = new RegC130();
        reg.setVlBcIrrf(1.99);
        reg.setVlBcIssqn(1.99);
        reg.setVlBcPrev(1.99);
        reg.setVlIrrf(1.99);
        reg.setVlIssqn(1.99);
        reg.setVlPrev(1.99);
        reg.setVlServNt(1.99);
        return reg;
    }

    public static RegC140 createRegC140() {
        RegC140 reg = new RegC140();
        reg.setDescTit("descr tit");
        reg.setIndEmit(EmissaoDocumento.PROPRIA);
        reg.setIndTit(TipoTituloCredito.DUPLICATA);
        reg.setNumTit("23");
        reg.setQtdParc(3);
        reg.setVlTit(99.99);
        //--
        reg.setRegC141List(createRegC141List());
        return reg;
    }

    public static List<RegC141> createRegC141List() {
        List<RegC141> list = new LinkedList<>();
        list.add(createRegC141());
        list.add(createRegC141());
        list.add(createRegC141());
        return list;
    }

    public static RegC141 createRegC141() {
        RegC141 reg = new RegC141();
        reg.setDtVcto(new Date());
        reg.setNumParc(1);
        reg.setVlParc(33.33);
        return reg;
    }

    public static RegC160 createRegC160() {
        RegC160 reg = new RegC160();
        reg.setCodPart("0001");
        reg.setPesoBrt(222.222);
        reg.setPesoLiq(200.333);
        reg.setQtdVol(15);
        reg.setUfId("ES");
        reg.setVeicId("MPA-1000");
        return reg;
    }

    public static List<RegC165> createRegC165List() {
        List<RegC165> list = new LinkedList<>();
        list.add(createRegC165());
        list.add(createRegC165());
        list.add(createRegC165());
        return list;
    }

    public static RegC165 createRegC165() {
        RegC165 reg = new RegC165();
        reg.setCodAut("lakdfjalk");
        reg.setCodPart("0001");
        reg.setCpf("123 123 123 11");
        reg.setHora(new Date());
        reg.setNomMot("Fulano de Tal");
        reg.setNrPasse("213156465");
        reg.setPesoBrt(1500.5);
        reg.setPesoLiq(1400.0);
        reg.setQtdVol(1);
        reg.setTemper(12.0);
        reg.setUfId("RJ");
        reg.setVeicId("AAA-1234");
        return reg;
    }

    public static List<RegC170> createRegC170List() {
        List<RegC170> list = new LinkedList<>();
        list.add(createRegC170());
        list.add(createRegC170());
        list.add(createRegC170());
        return list;
    }

    public static RegC170 createRegC170() {
        RegC170 reg = new RegC170();
        reg.setAliqCofinsPerc(5.5);
        reg.setAliqCofinsReal(10.1);
        reg.setAliqIcms(18.0);
        reg.setAliqIpi(9.9);
        reg.setAliqPisPerc(15.0);
        reg.setAliqPisReal(1.0);
        reg.setAliqSt(1.09);
        reg.setCfop(6101);
        reg.setCodCta("0001");
        reg.setCodEnq("1313");
        reg.setCodItem("123");
        reg.setCodNat("123");
        reg.setCstCofins("000");
        reg.setCstIcms("000");
        reg.setCstIpi("00");
        reg.setCstPis("00");
        reg.setDescrCompl("descr compl");
        reg.setIndApur(ApuracaoIpi.MENSAL);
        reg.setIndMov(Boolean.TRUE);
        reg.setNumItem(123);
        reg.setQtd(123.123);
        reg.setQuantBcCofins(123.1);
        reg.setQuantBcPis(123.1);
        reg.setUnid("un");
        reg.setVlBcCofins(123.12);
        reg.setVlBcIcms(123.12);
        reg.setVlBcIcmsSt(123.12);
        reg.setVlBcIpi(123.12);
        reg.setVlBcPis(123.12);
        reg.setVlCofins(123.12);
        reg.setVlDesc(12.12);
        reg.setVlIcms(12.12);
        reg.setVlIcmsSt(12.12);
        reg.setVlIpi(12.12);
        reg.setVlItem(123.12);
        reg.setVlPis(12.12);

        reg.setRegC171List(createRegC171List());
        reg.setRegC172List(createRegC172List());
        reg.setRegC173List(createRegC173List());
        reg.setRegC174List(createRegC174List());
        reg.setRegC175List(createRegC175List());
        reg.setRegC176List(createRegC176List());
        reg.setRegC177(createRegC177());
        reg.setRegC178(createRegC178());
        reg.setRegC179(createRegC179());

        return reg;
    }

    public static List<RegC171> createRegC171List() {
        List<RegC171> list = new LinkedList<>();
        list.add(createRegC171());
        list.add(createRegC171());
        list.add(createRegC171());
        return list;
    }

    public static RegC171 createRegC171() {
        RegC171 reg = new RegC171();
        reg.setNumTanque("123");
        reg.setQtde(333.33);
        return reg;
    }

    public static List<RegC172> createRegC172List() {
        List<RegC172> list = new LinkedList<>();
        list.add(createRegC172());
        list.add(createRegC172());
        list.add(createRegC172());
        return list;
    }

    public static RegC172 createRegC172() {
        RegC172 reg = new RegC172();
        reg.setAliqIssqn(7.5);
        reg.setVlBcIssqn(123.12);
        reg.setVlIssqn(12.12);
        return reg;
    }

    public static List<RegC173> createRegC173List() {
        List<RegC173> list = new LinkedList<>();
        list.add(createRegC173());
        list.add(createRegC173());
        list.add(createRegC173());
        return list;
    }

    public static RegC173 createRegC173() {
        RegC173 reg = new RegC173();
        reg.setDtFab(new Date());
        reg.setDtVal(new Date());
        reg.setIndMed("1");
        reg.setLoteMed("123");
        reg.setQtdItem(12.12);
        reg.setTpProd("0");
        reg.setVlTabMax(12.12);
        return reg;
    }

    public static List<RegC174> createRegC174List() {
        List<RegC174> list = new LinkedList<>();
        list.add(createRegC174());
        list.add(createRegC174());
        list.add(createRegC174());
        return list;
    }

    public static RegC174 createRegC174() {
        RegC174 reg = new RegC174();
        reg.setDescrCompl("descr compl");
        reg.setIndArm("0");
        reg.setNumArm("123");
        return reg;
    }

    public static List<RegC175> createRegC175List() {
        List<RegC175> list = new LinkedList<>();
        list.add(createRegC175());
        list.add(createRegC175());
        list.add(createRegC175());
        return list;
    }

    public static RegC175 createRegC175() {
        RegC175 reg = new RegC175();
        reg.setChassiVeic("123456464984ddf");
        reg.setCnpj("1234567890123");
        reg.setIndVeicOper("0");
        reg.setUf("SP");
        return reg;
    }

    public static List<RegC176> createRegC176List() {
        List<RegC176> list = new LinkedList<>();
        list.add(createRegC176());
        list.add(createRegC176());
        list.add(createRegC176());
        return list;
    }

    public static RegC176 createRegC176() {
        RegC176 reg = new RegC176();
        reg.setCodModUltE("00");
        reg.setCodPartUltE("0001");
        reg.setDtUltE(new Date());
        reg.setNumDocUltE(123L);
        reg.setQuantUltE(12.12);
        reg.setSerUltE("1");
        reg.setVlUnitBcSt(12.12);
        reg.setVlUnitUltE(12.12);
        return reg;
    }

    public static RegC177 createRegC177() {
        RegC177 reg = new RegC177();
        reg.setCodSeloIpi("165165ads");
        reg.setQtSeloIpi(123L);
        return reg;
    }

    public static RegC178 createRegC178() {
        RegC178 reg = new RegC178();
        reg.setClEnq("enq");
        reg.setQuantPad(12.12);
        reg.setVlUnid(12.99);
        return reg;
    }

    public static RegC179 createRegC179() {
        RegC179 reg = new RegC179();
        reg.setBcRet(12.12);
        reg.setBcStOrigDest(12.12);
        reg.setIcmsRet(12.12);
        reg.setIcmsStCompl(12.12);
        reg.setIcmsStRep(12.12);
        return reg;
    }

    public static List<RegC190> createRegC190List() {
        List<RegC190> list = new LinkedList<>();
        list.add(createRegC190());
        list.add(createRegC190());
        list.add(createRegC190());
        return list;
    }

    public static RegC190 createRegC190() {
        RegC190 reg = new RegC190();
        reg.setAliqIcms(3.3);
        reg.setCfop(1101);
        reg.setCodObs("123");
        reg.setCstIcms("000");
        reg.setVlBcIcms(123.12);
        reg.setVlBcIcmsSt(123.12);
        reg.setVlIpi(123.12);
        reg.setVlOpr(123.12);
        reg.setVlRedBc(123.12);
        return reg;
    }

    public static List<RegC195> createRegC195List() {
        List<RegC195> list = new LinkedList<>();
        list.add(createRegC195());
        list.add(createRegC195());
        list.add(createRegC195());
        return list;
    }

    public static RegC195 createRegC195() {
        RegC195 reg = new RegC195();
        reg.setCodObs("123");
        reg.setTxtCompl("texto compl");
        reg.setRegC197List(createRegC197List());
        return reg;
    }

    public static List<RegC197> createRegC197List() {
        List<RegC197> list = new LinkedList<>();
        list.add(createRegC197());
        list.add(createRegC197());
        list.add(createRegC197());
        return list;
    }

    public static RegC197 createRegC197() {
        RegC197 reg = new RegC197();
        reg.setAliqIcms(17.0);
        reg.setCodAj("adfad");
        reg.setCodItem("123");
        reg.setDescrComplAj("descre lajl jadl");
        reg.setVlBcIcms(123.12);
        reg.setVlIcms(123.12);
        reg.setVlOutros(12.12);
        return reg;
    }
    //</editor-fold>

    public static RegC990 createRegC990(){
        return new RegC990(762L);
    }
}

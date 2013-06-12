/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0Test;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9001;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9999;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoCTest;
import static coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoCTest.createBlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD001;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD990;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE001;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE990;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG001;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG990;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH001;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH990;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class EstruturaTest {

    public static final String TEST_BLOCO_OUT_DIR = "";
    public static final String TEST_REG_OUT_DIR = "";

    @Test
    public void testEstrutura() {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");

        Estrutura estrutura = new Estrutura();
        estrutura.setBloco0(createBloco0());
        estrutura.setBlocoC(createBlocoC());
        estrutura.setBlocoD(createBlocoD());
        estrutura.setBlocoE(createBlocoE());
        estrutura.setBlocoG(createBlocoG());
        estrutura.setBlocoH(createBlocoH());
        estrutura.setBloco1(createBloco1());
        estrutura.setBloco9(createBloco9());

        try {
            String file = EstruturaTest.TEST_BLOCO_OUT_DIR + "SpedFiscalTest.txt";
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(estrutura);

            spedFiscalWriter.writerFlush();
            spedFiscalWriter.writerClose();
        } catch (IOException ex) {
            Logger.getLogger(BlocoCTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Bloco0 createBloco0() {
        return Bloco0Test.createBloco0();
    }

    private BlocoC createBlocoC() {
        return BlocoCTest.createBlocoC();
    }

    private BlocoD createBlocoD() {
        RegD001 r1 = new RegD001(IndicadorMovimento.SEM_DADOS);
        RegD990 r9 = new RegD990(2L);
        BlocoD bloco = new BlocoD();
        bloco.setRegD001(r1);
        bloco.setRegD990(r9);
        return bloco;
    }
    private BlocoE createBlocoE() {
        RegE001 r1 = new RegE001(IndicadorMovimento.SEM_DADOS);
        RegE990 r9 = new RegE990(2L);
        BlocoE bloco = new BlocoE();
        bloco.setRegE001(r1);
        bloco.setRegE990(r9);
        return bloco;
    }
    private BlocoG createBlocoG() {
        RegG001 r1 = new RegG001(IndicadorMovimento.SEM_DADOS);
        RegG990 r9 = new RegG990(2L);
        BlocoG bloco = new BlocoG();
        bloco.setRegG001(r1);
        bloco.setRegG990(r9);
        return bloco;
    }
    private BlocoH createBlocoH() {
        RegH001 r1 = new RegH001(IndicadorMovimento.SEM_DADOS);
        RegH990 r9 = new RegH990(2L);
        BlocoH bloco = new BlocoH();
        bloco.setRegH001(r1);
        bloco.setRegH990(r9);
        return bloco;
    }
    private Bloco1 createBloco1(){
        Reg1001 r1 = new Reg1001(IndicadorMovimento.SEM_DADOS);
        Reg1990 r9 = new Reg1990(2L);
        Bloco1 bloco = new Bloco1();
        bloco.setReg1001(r1);
        bloco.setReg1990(r9);
        return bloco;
    }
    private Bloco9 createBloco9() {
        Reg9001 r1 = new Reg9001(IndicadorMovimento.SEM_DADOS);
        Reg9990 r9 = new Reg9990(2L);
        Bloco9 bloco = new Bloco9();
        bloco.setReg9001(r1);
        bloco.setReg9990(r9);
        bloco.setReg9999(new Reg9999(5000L));
        return bloco;
    }
}

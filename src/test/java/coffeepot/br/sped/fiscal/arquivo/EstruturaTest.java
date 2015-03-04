/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

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


import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0Test;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoCTest;
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
import coffeepot.br.sped.fiscal.reader.SpedFiscalReader;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

//private [^+ ]+ regex util.

/**
 *
 * @author Jeandeson O. Merelis
 */
public class EstruturaTest {

    public static final String TEST_BLOCO_OUT_DIR = "";
    public static final String TEST_REG_OUT_DIR = "";

    @Test
    public void testEstrutura() throws Exception {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");
        File file = new File(EstruturaTest.TEST_BLOCO_OUT_DIR + "SpedFiscalTest.txt");

        Estrutura estrutura = new Estrutura();
        estrutura.setBloco0(createBloco0());
        estrutura.setBlocoC(createBlocoC());
        estrutura.setBlocoD(createBlocoD());
        estrutura.setBlocoE(createBlocoE());
        estrutura.setBlocoG(createBlocoG());
        estrutura.setBlocoH(createBlocoH());
        estrutura.setBloco1(createBloco1());

        try {

            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            //Grava todos blocos, exceto o Bloco9
            spedFiscalWriter.write(estrutura);
            spedFiscalWriter.writerFlush();

            //Gera o bloco9 apartir do arquivo, e o grava no arquivo.
            Bloco9 bloco9 = Util.createBloco9(file);
            //estrutura.setBloco9(bloco9);
            spedFiscalWriter.write(bloco9);
            spedFiscalWriter.writerFlush();

            spedFiscalWriter.writerClose();
        } catch (IOException ex) {
            Logger.getLogger(BlocoCTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SpedFiscalReader reader = new SpedFiscalReader();
        EstruturaSemBlocos sped = reader.read(new FileInputStream(file));
        Assert.assertNotNull(sped);
        
        
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

    private Bloco1 createBloco1() {
        Reg1001 r1 = new Reg1001(IndicadorMovimento.SEM_DADOS);
        Reg1990 r9 = new Reg1990(2L);
        Bloco1 bloco = new Bloco1();
        bloco.setReg1001(r1);
        bloco.setReg1990(r9);
        return bloco;
    }
}

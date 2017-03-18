/*
 * Copyright 2015 Jeandeson O. Merelis.
 *
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
 */
package coffeepot.br.sped.fiscal.reader;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2015 Jeandeson O. Merelis
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
import coffeepot.br.sped.fiscal.arquivo.EstruturaSemBlocos;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0Test;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0200;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SpedFiscalReaderTest {

    //TODO: Fazer validação dos dados lidos, campo a campo.
    public SpedFiscalReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }



    @Test
    public void read_semInformarVersao_temQueAutodetectarVersaoComoVersao002() throws Exception {
        Bloco0 b = Bloco0Test.createBloco0();
        b.getReg0000().setCodVer( VersaoLayout.VERSAO_002 );


        Reg0200 reg = new Reg0200();
        reg.setAliqIcms( 17d );
        reg.setCodAntItem( "CODIGO ANTERIOR" );
        reg.setCodBarra( "CODIGO DE BARRAS" );
        reg.setCodGen( "80" );
        reg.setCodItem( "CODIGO ITEM" );
        reg.setCodNcm( "12345678" );
        reg.setDescrItem( "Descrição do item" );
        reg.setExIpi( "001" );
        reg.setTipoItem( "00" );
        reg.setUnidInv( "un" );
        reg.setCest( "123456" );

        b.getReg0200List().add( 0, reg );

        StringWriter sw = new StringWriter();
        SpedFiscalWriter w = new SpedFiscalWriter( sw, VersaoLayout.VERSAO_002 );

        w.write( b );
        w.flush();
        w.close();

        StringReader sr = new StringReader( sw.toString() );

        SpedFiscalReader r = new SpedFiscalReader( sr );
        Bloco0 b0 = r.parseToBloco0();

        assertEquals( 2 , r.getVersion());
        assertEquals( VersaoLayout.VERSAO_002, b0.getReg0000().getCodVer() );
        assertNull( b0.getReg0200List().get( 0 ).getCest() );
    }

    @Test
    public void read_semInformarVersao_temQueAutodetectarVersaoComoVersao010() throws Exception {
        Bloco0 b = Bloco0Test.createBloco0();
        b.getReg0000().setCodVer( VersaoLayout.VERSAO_010 );

        Reg0200 reg = new Reg0200();
        reg.setAliqIcms( 17d );
        reg.setCodAntItem( "CODIGO ANTERIOR" );
        reg.setCodBarra( "CODIGO DE BARRAS" );
        reg.setCodGen( "80" );
        reg.setCodItem( "CODIGO ITEM" );
        reg.setCodNcm( "12345678" );
        reg.setDescrItem( "Descrição do item" );
        reg.setExIpi( "001" );
        reg.setTipoItem( "00" );
        reg.setUnidInv( "un" );
        reg.setCest( "123456" );

        b.getReg0200List().add( 0, reg );

        StringWriter sw = new StringWriter();
        SpedFiscalWriter w = new SpedFiscalWriter( sw, VersaoLayout.VERSAO_010 );

        w.write( b );
        w.flush();
        w.close();

        StringReader sr = new StringReader( sw.toString() );

        SpedFiscalReader r = new SpedFiscalReader( sr );
        Bloco0 b0 = r.parseToBloco0();

        assertEquals( 10 , r.getVersion());
        assertEquals( VersaoLayout.VERSAO_010, b0.getReg0000().getCodVer() );
        assertNull( b0.getReg0200List().get( 0 ).getCest() );
    }

    @Test
    public void read_semInformarVersao_temQueAutodetectarVersaoComoVersao011() throws Exception {
        Bloco0 b = Bloco0Test.createBloco0();
        b.getReg0000().setCodVer( VersaoLayout.VERSAO_011 );

        Reg0200 reg = new Reg0200();
        reg.setAliqIcms( 17d );
        reg.setCodAntItem( "CODIGO ANTERIOR" );
        reg.setCodBarra( "CODIGO DE BARRAS" );
        reg.setCodGen( "80" );
        reg.setCodItem( "CODIGO ITEM" );
        reg.setCodNcm( "12345678" );
        reg.setDescrItem( "Descrição do item" );
        reg.setExIpi( "001" );
        reg.setTipoItem( "00" );
        reg.setUnidInv( "un" );
        reg.setCest( "123456" );

        b.getReg0200List().add( 0, reg );

        StringWriter sw = new StringWriter();
        SpedFiscalWriter w = new SpedFiscalWriter( sw, VersaoLayout.VERSAO_011 );

        w.write( b );
        w.flush();
        w.close();

        StringReader sr = new StringReader( sw.toString() );

        SpedFiscalReader r = new SpedFiscalReader( sr );
        Bloco0 b0 = r.parseToBloco0();

        assertEquals( 11 , r.getVersion());
        assertEquals( VersaoLayout.VERSAO_011, b0.getReg0000().getCodVer() );
        assertEquals( "123456", b0.getReg0200List().get( 0 ).getCest() );
    }


    @Test
    public void temQueLerSomenteOBlocoC() throws Exception {
        File file = new File("SpedFiscalTest.tmp");

//        try (BufferedReader br = new BufferedReader(new FileReader(file))){
        try (FileReader fr = new FileReader(file)) {
            SpedFiscalReader reader = new SpedFiscalReader(fr);
            BlocoC bc = reader.parseToBlocoC();
            assertNotNull(bc);
        }

    }

    @Test
    public void temQueLerBlocoCeDSeparadamente() throws Exception {
        File file = new File("SpedFiscalTest.tmp");

//        try (BufferedReader br = new BufferedReader(new FileReader(file))){
        try (FileReader fr = new FileReader(file)) {
            SpedFiscalReader reader = new SpedFiscalReader(fr);
            BlocoC bc = reader.parseToBlocoC();
            assertNotNull(bc);
            BlocoD bd = reader.parseToBlocoD();
            assertNotNull(bd);
        }

    }

    @Test
    public void temQueLerTodoArquivo() throws Exception {

        File file = new File("SpedFiscalTest.tmp");
        try (FileReader fr = new FileReader(file)) {
            SpedFiscalReader reader = new SpedFiscalReader(fr);
            EstruturaSemBlocos sped = reader.parseToEstruturaSemBlocos();
            Assert.assertNotNull(sped);
        }
    }

}

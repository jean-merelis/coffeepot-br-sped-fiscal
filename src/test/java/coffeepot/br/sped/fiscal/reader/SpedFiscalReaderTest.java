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
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import java.io.File;
import java.io.FileReader;
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

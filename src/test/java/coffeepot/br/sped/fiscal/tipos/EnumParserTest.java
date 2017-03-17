/*
 * Copyright 2017 Jeandeson O. Merelis.
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
package coffeepot.br.sped.fiscal.tipos;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2017 Jeandeson O. Merelis
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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jean
 */
public class EnumParserTest {

    public EnumParserTest() {
    }

    @Test
    public void parseEnumCodificado() {


        VersaoLayout e = EnumParser.parseEnumCodificado( VersaoLayout.class, "002");

        assertEquals( VersaoLayout.VERSAO_002, e);

        e = EnumParser.parseEnumCodificado( VersaoLayout.class, "003");
        assertEquals( VersaoLayout.VERSAO_003, e);

        e = EnumParser.parseEnumCodificado( VersaoLayout.class, "004");
        assertEquals( VersaoLayout.VERSAO_004, e);

        e = EnumParser.parseEnumCodificado( VersaoLayout.class, "011");
        assertEquals( VersaoLayout.VERSAO_011, e);

    }

    @Test
    public void parseEnumCodificado_deUmEnumNaoCodificao_deveGerarUmaExcecao() {
        try{
            EnumParser.parseEnumCodificado( EnumTest.class, "xx");
        }catch(IllegalArgumentException ex){
            return;
        }
        assertTrue("deveria ter gerado uma excecao",false);
    }


    public enum EnumTest{
        TEST
    }

}

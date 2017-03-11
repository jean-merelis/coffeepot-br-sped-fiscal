/*
 * Copyright 2017 - Djeison A. Selzlein
 */
package coffeepot.br.sped.fiscal.tipos;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2017 Djeison A. Selzlein
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * 
 * @author Djeison A. Selzlein
 *
 */
public class VersaoLayoutTest {

	@Test
	public void parseByDescriptionTest() {
		assertEquals(VersaoLayout.VERSAO_002, VersaoLayout.parseByDescription("Versão 1.01 Ato COTEPE 01/01/2009"));
		assertEquals(VersaoLayout.VERSAO_006, VersaoLayout.parseByDescription("Versão 1.05 Ato COTEPE 01/07/2012"));
		assertNotEquals(VersaoLayout.VERSAO_011, VersaoLayout.parseByDescription("Versão 1.09 Ato COTEPE 01/01/2016"));
		assertNull(VersaoLayout.parseByDescription("Valor invalido"));
	}

}

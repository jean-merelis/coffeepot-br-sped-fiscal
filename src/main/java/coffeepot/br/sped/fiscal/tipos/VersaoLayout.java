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
 *
 * @author Jeandeson O. Merelis
 */
public enum VersaoLayout implements EnumCodificado {

	/**
	 * Versão 1.00 Ato COTEPE 01/01/2008.
	 */
	VERSAO_001("001"),
	/**
	 * Versão 1.01 Ato COTEPE 01/01/2009.
	 */
	VERSAO_002("002"),
	/**
	 * Versão 1.02 Ato COTEPE 01/01/2010.
	 */
	VERSAO_003("003"),
	/**
	 * Versão 1.03 Ato COTEPE 01/01/2011.
	 */
	VERSAO_004("004"),
	/**
	 * Versão 1.04 Ato COTEPE 01/01/2012.
	 */
	VERSAO_005("005"),
	/**
	 * Versão 1.05 Ato COTEPE 01/07/2012.
	 */
	VERSAO_006("006"),
	/**
	 * Versão 1.06 Ato COTEPE 01/01/2013.
	 */
	VERSAO_007("007"),
	/**
	 * Versão 1.07 Ato COTEPE 01/01/2014.
	 */
	VERSAO_008("008"),
	/**
	 * Versão 1.08 Ato COTEPE 01/01/2015.
	 */
	VERSAO_009("009"),
	/**
	 * Versão 1.09 Ato COTEPE 01/01/2016.
	 */
	VERSAO_010("010"),
	/**
	 * Versão 1.10 Ato COTEPE 01/01/2017.
	 */
	VERSAO_011("011"),
	/**
	 * Versão 1.12 Ato COTEPE 01/01/2018.
	 */
	VERSAO_012("012"),
	/**
	 * Versão 1.13 Ato COTEPE 01/01/2019.
	 */
	VERSAO_013("013"),
	/**
	 * Versão 1.14 Ato COTEPE 01/01/2020.
	 */
	VERSAO_014("014"),
	/**
	 * Versão 1.15 Ato COTEPE 01/01/2021.
	 */
	VERSAO_015("015"),
	/**
	 * Versão 1.16 Ato COTEPE 01/01/2022.
	 */
	VERSAO_016("016");

	private final String codigo;

	private VersaoLayout(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Obtém a última versão do layout que este projeto implementa.
	 *
	 * @return última versão implementada.
	 */
	public static VersaoLayout getLastVersionImpl() {
		return VersaoLayout.values()[VersaoLayout.values().length - 1];
	}
}

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
 * Situação do Documento, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum SituacaoDocumento implements EnumCodificado {
	/**
	 * Documento regular.
	 */
	REGULAR("00"),
	/**
	 * Escrituração extemporânea de documento regular.
	 */
	EXTEMPORANEA_REGULAR("01"),
	/**
	 * Documento cancelado.
	 */
	CANCELADO("02"),
	/**
	 * Escrituração extemporânea de documento cancelado.
	 */
	EXTEMPORANEA_CANCELADO("03"),
	/**
	 * NF-e, NFC-e ou CT-e denegado.
	 */
	DENEGADO("04"),
	/**
	 * Numeração inutilizada.
	 */
	NUM_INUTILIZADO("05"),
	/**
	 * Documento Fiscal Complementar.
	 */
	COMPLEMENTAR("06"),
	/**
	 * Escrituração extemporânea de documento complementar.
	 */
	EXTEMPORANEA_COMPLEMENTAR("07"),
	/**
	 * Documento Fiscal emitido com base em Regime Especial ou Norma Específica.
	 */
	ESPECIAL("08");

	private final String codigo;

	private SituacaoDocumento(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	public static SituacaoDocumento getByCodigo(String codigo) {
		for (SituacaoDocumento situacao : SituacaoDocumento.values()) {
			if (situacao.getCodigo().equals(codigo)) {
				return situacao;
			}
		}
		return null;
	}
}

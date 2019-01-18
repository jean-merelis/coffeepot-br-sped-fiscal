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
 * Indicador do tipo do frete, referenciado no registro C100.
 *
 * @author Jeandeson O. Merelis
 */
public enum Frete implements EnumCodificado {

	// 0 - Contratação do Frete por conta do Remetente (CIF);
	EMITENTE(0),

	// 1 - Contratação do Frete por conta do Destinatário (FOB);
	DESTINATARIO_REMETENTE(1),

	// 2 - Contratação do Frete por conta de Terceiros;
	TERCEIROS(2),
	
	// 3 - Transporte Próprio por conta do Remetente;
	PROPRIO_REMETENTE(3),

	// 4 - Transporte Próprio por conta do Destinatário;
	PROPRIO_DESTINATARIO(4),

	// 9 - Sem Ocorrência de Transporte
	SEM_FRETE(9);

	private final int codigo;

	private Frete(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String getCodigo() {
		return String.valueOf(codigo);
	}

	public int getCodigoAsInt() {
		return codigo;
	}
}

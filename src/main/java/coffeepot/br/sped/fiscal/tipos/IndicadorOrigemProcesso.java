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
 * Codigo do Ajuste de apuração do ICMS, referenciado no registro E111.
 * @author Mauricio R. Morais
 */
public enum IndicadorOrigemProcesso implements EnumCodificado{
    SEFAZ("0"),
    JUSTICA_FEDERAL("1"),
    JUSTICA_ESTADUAL("2"),
    OUTROS("9");

    private final String codigo;

    private IndicadorOrigemProcesso(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public IndicadorOrigemProcesso parse(String codigo) throws ParseException{
    	IndicadorOrigemProcesso returnValue = null;
        if (codigo == null){
            throw new ParseException("Nao foi possivel conveter para o tipo IndicadorOrigemProcesso");
        }
        for (IndicadorOrigemProcesso enumValue : IndicadorOrigemProcesso.values()) {
			if(codigo.equals(enumValue.getCodigo())){
				returnValue = enumValue;
				break;
			}
		}
        if(returnValue == null){
        	throw new ParseException("Nao foi possivel conveter para o tipo IndicadorOrigemProcesso");
        }
        return returnValue;
    }
 }

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
 * Indicador do tipo de título de crédito, referenciado no registro C140.
 * @author Jeandeson O. Merelis
 */
public enum TipoTituloCredito implements EnumCodificado{
    DUPLICATA("00"),
    CHEQUE("01"),
    PROMISSORIA("02"),
    RECIBO("03"),
    OUTROS("99");
    private String codigo;

    private TipoTituloCredito(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public TipoTituloCredito parse(String codigo) throws ParseException {
        if ("00".equals(codigo))  return DUPLICATA;
        if ("01".equals(codigo))  return CHEQUE;
        if ("02".equals(codigo))  return PROMISSORIA;
        if ("03".equals(codigo))  return RECIBO;
        if ("99".equals(codigo))  return OUTROS;
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo TipoTituloCredito");
    }
}

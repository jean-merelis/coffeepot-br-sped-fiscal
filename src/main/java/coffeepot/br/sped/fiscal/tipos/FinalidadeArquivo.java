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
 * Finalidade do arquivo.
 *
 * @author Jeandeson O. Merelis
 */
public enum FinalidadeArquivo implements EnumCodificado {

    ARQUIVO_ORIGINAL("0", "Remessa do arquivo original"),
    ARQUIVO_SUBSTITUTO("1", "Remessa do arquivo substituto");
    private String codigo;
    private String descricao;

    private FinalidadeArquivo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public FinalidadeArquivo parse(String codigo) throws ParseException {
        if ("0".equals(codigo)) {
            return ARQUIVO_ORIGINAL;
        }

        if ("1".equals(codigo)) {
            return ARQUIVO_SUBSTITUTO;
        }
        throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo FinalidadeArquivo");
    }

    public static FinalidadeArquivo parseByDescription(String descricao) {
        if (ARQUIVO_ORIGINAL.getDescricao().equals(descricao)) {
            return ARQUIVO_ORIGINAL;
        }
        if (ARQUIVO_SUBSTITUTO.getDescricao().equals(descricao)) {
            return ARQUIVO_SUBSTITUTO;
        }
        return null;
    }
}

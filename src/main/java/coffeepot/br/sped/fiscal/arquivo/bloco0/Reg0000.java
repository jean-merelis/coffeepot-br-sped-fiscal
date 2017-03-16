/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import coffeepot.br.sped.fiscal.tipos.Perfil;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "0000"),
    @Field(name = "codVer", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "codFin"),
    @Field(name = "dtIni"),
    @Field(name = "dtFin"),
    @Field(name = "nome", maxLength = 100),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "cpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "uf"),
    @Field(name = "ie", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codMun", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true),
    @Field(name = "im", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "suframa", length = 9, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "indPerfil"),
    @Field(name = "indAtiv")
})
@Getter
@Setter
public class Reg0000 {

    private VersaoLayout codVer;
    private FinalidadeArquivo codFin;
    private Date dtIni;
    private Date dtFin;
    private String nome;
    private String cnpj;
    private String cpf;
    private String uf;
    private String ie;
    private Integer codMun;
    private String im;
    private String suframa;
    private Perfil indPerfil;
    private IndicadorAtividade indAtiv;

}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

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
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;

/**
 * Estrutura do Sped Fiscal.
 * <br>
 * Tabela de blocos: <br>
 * <ul>
 * <li> 0 - Abertura, Identificação e Referências</li>
 * <li> C - Documentos Fiscais I  - Mercadorias (ICMS/IPI)</li>
 * <li> D - Documentos Fiscais II - Serviços (ICMS)</li>
 * <li> E - Apuração do ICMS e do IPI</li>
 * <li> G - Controle do Crédito de ICMS do Ativo Permanente - CIAP - modelos "C"
 * e "D"</li>
 * <li> H - Inventário Físico</li>
 * <li> 1 - Outras Informações</li>
 * <li> 9 - Controle e Encerramento do Arquivo Digital</li>
 * </ul>
 *
 * @author Jeandeson O. Merelis
 * @deprecated Embora seja possível gravarmos SPED FISCAL inteiro
 * utilizando apenas uma instancia desta classe e a passando para o ObjectWriter
 * escrevê-la, isto não seria recomendado, pois o
 * arquivo pode ser enorme e o uso da memória
 * ficaria comprometido. A recomendação é gravar os registros sob demanda, e
 * liberando os recursos em seguida.
 * <br>
 * <strong>
 * Desta forma, a finalidade desta classe é mais para entendermos a estrutura do
 * Arquivo SPED FISCAL.</strong>
 */
@Record(fields = {
    @Field(name = "bloco0"),
    @Field(name = "blocoC"),
    @Field(name = "blocoD"),
    @Field(name = "blocoE"),
    @Field(name = "blocoG"),
    @Field(name = "blocoH"),
    @Field(name = "bloco1"),
    @Field(name = "bloco9")
})
@Deprecated
public class Estrutura {

    private Bloco0 bloco0;
    private BlocoC blocoC;
    private BlocoD blocoD;
    private BlocoE blocoE;
    private BlocoG blocoG;
    private BlocoH blocoH;
    private Bloco1 bloco1;
    private Bloco9 bloco9;

    public Bloco0 getBloco0() {
        return bloco0;
    }

    public void setBloco0(Bloco0 bloco0) {
        this.bloco0 = bloco0;
    }

    public BlocoC getBlocoC() {
        return blocoC;
    }

    public void setBlocoC(BlocoC blocoC) {
        this.blocoC = blocoC;
    }

    public BlocoD getBlocoD() {
        return blocoD;
    }

    public void setBlocoD(BlocoD blocoD) {
        this.blocoD = blocoD;
    }

    public BlocoE getBlocoE() {
        return blocoE;
    }

    public void setBlocoE(BlocoE blocoE) {
        this.blocoE = blocoE;
    }

    public BlocoG getBlocoG() {
        return blocoG;
    }

    public void setBlocoG(BlocoG blocoG) {
        this.blocoG = blocoG;
    }

    public BlocoH getBlocoH() {
        return blocoH;
    }

    public void setBlocoH(BlocoH blocoH) {
        this.blocoH = blocoH;
    }

    public Bloco1 getBloco1() {
        return bloco1;
    }

    public void setBloco1(Bloco1 bloco1) {
        this.bloco1 = bloco1;
    }

    public Bloco9 getBloco9() {
        return bloco9;
    }

    public void setBloco9(Bloco9 bloco9) {
        this.bloco9 = bloco9;
    }
}

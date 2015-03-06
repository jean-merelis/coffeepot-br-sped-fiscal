/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.reader;

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
import coffeepot.bean.wr.reader.ObjectReader;
import coffeepot.br.sped.fiscal.arquivo.EstruturaSemBlocos;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;
import java.io.InputStream;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SpedFiscalReader {

    private ObjectReader reader;

    public SpedFiscalReader() {
        this.reader = ReaderFactory.createReader();
    }

    public EstruturaSemBlocos read(InputStream src) {
        return reader.read(src, EstruturaSemBlocos.class);
    }

    public Bloco0 readBloco0(InputStream src) {
        return reader.read(src, Bloco0.class);
    }

    public Bloco1 readBloco1(InputStream src) {
        return reader.read(src, Bloco1.class);
    }

    public Bloco9 readBloco9(InputStream src) {
        return reader.read(src, Bloco9.class);
    }

    public BlocoC readBlocoC(InputStream src) {
        return reader.read(src, BlocoC.class);
    }

    public BlocoD readBlocoD(InputStream src) {
        return reader.read(src, BlocoD.class);
    }

    public BlocoE readBlocoE(InputStream src) {
        return reader.read(src, BlocoE.class);
    }

    public BlocoG readBlocoG(InputStream src) {
        return reader.read(src, BlocoG.class);
    }

    public BlocoH readBlocoH(InputStream src) {
        return reader.read(src, BlocoH.class);
    }
}

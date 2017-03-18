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
import coffeepot.bean.wr.reader.UnknownRecordException;
import coffeepot.bean.wr.typeHandler.HandlerParseException;
import coffeepot.br.sped.fiscal.arquivo.EstruturaSemBlocos;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SpedFiscalReader {

    private final ObjectReader reader;

    public SpedFiscalReader(Reader r) {
        this.reader = ReaderFactory.createReader(r);
    }

    public SpedFiscalReader(Reader r, VersaoLayout versaoLayout) {
        this.reader = ReaderFactory.createReader(r, versaoLayout);
    }

    public int getVersion(){
        return reader.getVersion();
    }

    public EstruturaSemBlocos parseToEstruturaSemBlocos() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith(null);
        return reader.parse(EstruturaSemBlocos.class);
    }

    public Bloco0 parseToBloco0() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.processUpToTheLineStartsWith("|0990|");
        return reader.parse(Bloco0.class);
    }

    public Bloco1 parseToBloco1() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|1001|");
        reader.processUpToTheLineStartsWith("|1990|");
        return reader.parse(Bloco1.class);
    }

    public Bloco9 parseToBloco9() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|9001|");
        reader.processUpToTheLineStartsWith("|9990|");
        return reader.parse(Bloco9.class);
    }

    public BlocoC parseToBlocoC() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|C001|");
        reader.processUpToTheLineStartsWith("|C990|");
        return reader.parse(BlocoC.class);
    }

    public BlocoD parseToBlocoD() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|D001|");
        reader.processUpToTheLineStartsWith("|D990|");
        return reader.parse(BlocoD.class);
    }

    public BlocoE parseToBlocoE() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|E001|");
        reader.processUpToTheLineStartsWith("|E990|");
        return reader.parse(BlocoE.class);
    }

    public BlocoG parseToBlocoG() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|G001|");
        reader.processUpToTheLineStartsWith("|G990|");
        return reader.parse(BlocoG.class);
    }

    public BlocoH parseToBlocoH() throws UnknownRecordException, HandlerParseException, IOException, Exception {
        reader.findLineStartsWith("|H001|");
        reader.processUpToTheLineStartsWith("|H990|");
        return reader.parse(BlocoH.class);
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.writer;

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


import coffeepot.bean.wr.writer.ObjectWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SpedFiscalWriter {

    private final ObjectWriter beanWriter;

    /**
     * Este construtor utiliza o objeto Writer que você fornece.
     *
     * @param w
     */
    public SpedFiscalWriter(Writer w) {
        this.beanWriter = WriterFactory.createObjectWriter(w);
    }

    /**
     * Este construtor cria um objeto BufferedWriter com charSet ISO-8859-1,
     * onde o local de saída é o arquivo que você fornece como parâmetro.
     *
     * @param file
     * @throws IOException
     */
    public SpedFiscalWriter(File file) throws IOException {
        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
        this.beanWriter = WriterFactory.createObjectWriter(fw);
    }

    public Writer getWriter() {
        return beanWriter.getWriter();
    }

    public void setWriter(Writer w) {
        beanWriter.setWriter(w);
    }

    /**
     * Escreve o objeto no arquivo, obedecendo a formatação que foi mapeada na
     * classe.
     *
     * @param obj Objeto a ser analizado e escrito no arquivo. Este objeto deve
     * ser mapeado com as anotações {@link coffeepot.bean.wr.annotation.Record} e
     * {@link coffeepot.bean.wr.annotation.Field}
     * @throws IOException
     */
    public void write(Object obj) throws IOException {
        beanWriter.write(obj);
    }

    /**
     * Escreve os registros que estão em buffer para o destino.
     *
     * @throws IOException
     */
    public void flush() throws IOException {
        beanWriter.flush();
    }

    /**
     * Fecha o escritor.
     *
     * @throws IOException
     */
    public void close() throws IOException {
        beanWriter.getWriter().close();
    }

    /**
     * Libera os parsers (analisadores) do mapa.
     * <br>
     * Todo objeto que é escrito precisa de um parser, para analisar suas
     * informações e formatar seu conteúdo. Estes parsers são construídos usando
     * as anotações que foram feitas nas classes dos objetos. Desta forma, se
     * tem um parser para cada classe que o ObjectWrite escreve e este parser
     * fica disponível em um mapa para ser usado pelo ObjectWriter.
     * <br>
     * No caso do Sped, existem muitas classes que mapeiam seus registros, desta
     * forma é interessante liberar os recursos dos parsers que não serão mais
     * utilizados.
     */
    public void cleanParsers() {
        beanWriter.getObjectMapperFactory().getMappers().clear();
    }
}

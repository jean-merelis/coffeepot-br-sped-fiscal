/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.writer;

import coffeepot.bean.wr.writer.ObjectWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SpedFiscalWriter {

    private ObjectWriter beanWriter;

    public SpedFiscalWriter(Writer w) {
        this.beanWriter = WriterFactory.createObjectWriter(w);
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
     * ser mapeado com as anotações {@link coffeepot.bean.wr.anotation.Record} e
     * {@link coffeepot.bean.wr.anotation.Field}
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
    public void writerFlush() throws IOException {
        beanWriter.flush();
    }
    
    /**
     * Fecha o escritor.
     * @throws IOException 
     */
    public void writerClose() throws IOException{
        beanWriter.getWriter().close();
    }
}

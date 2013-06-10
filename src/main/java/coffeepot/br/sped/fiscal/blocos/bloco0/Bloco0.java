/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.bean.wr.writer.ObjectWriter;
import coffeepot.br.sped.fiscal.blocos.RegEncerramentoBloco;
import coffeepot.br.sped.fiscal.blocos.RegIndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.WriterFactory;
import java.io.Writer;
import java.io.IOException;

/**
 * Fachada do Bloco 0.
 *
 * @author Jeandeson O. Merelis
 */
public class Bloco0 {

    private ObjectWriter beanWriter;
    private long count = 0;

    public Bloco0(Writer w) {
        this.beanWriter = WriterFactory.createObjectWriter(w);
    }

    public long getCount() {
        return count;
    }

    public Writer getWriter() {
        return beanWriter.getWriter();
    }

    public void setWriter(Writer w) {
        beanWriter.setWriter(w);
    }

    /**
     * Escreve o registro no arquivo.
     *
     * @param reg Objeto a ser analizado e escrito no arquivo. Este objeto deve
     * ser mapeado com as anotações {@link coffeepot.bean.wr.anotation.Record} e
     * {@link coffeepot.bean.wr.anotation.Field}
     * @param recordsCount Quantidade de registros que serão gravadas no
     * arquivo. Esta quantidade será usada para totalizar a quantidade de
     * registros do bloco.
     * @throws IOException
     */
    public void write(Object reg, int recordsCount) throws IOException {
        beanWriter.write(reg);
        count += recordsCount;
    }

    /**
     * Escreve o registro de abertura do bloco, indicando se há movimento ou
     * não.
     *
     * @param indMov
     * @throws IOException
     */
    public void writeIndicadorMovimento(IndicadorMovimento indMov) throws IOException {
        RegIndicadorMovimento reg = new RegIndicadorMovimento();
        reg.setReg("0001");
        reg.setIndMov(indMov);
        beanWriter.write(reg);
        count++;
    }

    /**
     * Escreve o registro de encerramento de bloco com o total de linhas
     * calculado pela instância desta classe.
     *
     * @throws IOException
     */
    public void writeEncerramentoBloco() throws IOException {
        //inclui o registro de encerramento no total de linhas do bloco.
        count++;
        writeEncerramentoBloco(count);
    }

    /**
     * Escreve o registro de encerramento de bloco.
     *
     * @param totalLinhas
     * @throws IOException
     */
    public void writeEncerramentoBloco(long totalLinhas) throws IOException {
        RegEncerramentoBloco reg = new RegEncerramentoBloco();
        reg.setReg("0990");
        reg.setQtdLin(totalLinhas);
        beanWriter.write(reg);
    }
}

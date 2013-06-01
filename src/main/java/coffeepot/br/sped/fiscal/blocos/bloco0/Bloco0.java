/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.br.sped.fiscal.blocos.RegEncerramentoBloco;
import coffeepot.br.sped.fiscal.blocos.RegIndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import java.io.Writer;
import java.io.IOException;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

/**
 * Fachada do Bloco 0.
 *
 * @author Jeandeson O. Merelis
 */
public class Bloco0 {

    private BeanWriter beanWriter;
    private Class regClass;
    private long count = 0;

    public long getCount() {
        return count;
    }

    private void setBeanWriter(Writer fw, Class c) throws IOException {
        if (c.equals(regClass)) {
            return;
        }
        if (RegIndicadorMovimento.class.equals(c)) {
            StreamFactory factory = StreamFactory.newInstance();
            factory.load(Bloco0.class.getClass().getResourceAsStream("/coffeepot/br/sped/fiscal/beanio/RegIndicadorMov.xml"));
            beanWriter = factory.createWriter("sped", fw);
        } else if (RegEncerramentoBloco.class.equals(c)) {
            StreamFactory factory = StreamFactory.newInstance();
            factory.load(Bloco0.class.getClass().getResourceAsStream("/coffeepot/br/sped/fiscal/beanio/RegEncerramentoBloco.xml"));
            beanWriter = factory.createWriter("sped", fw);
        } else {
            String path = "/coffeepot/br/sped/fiscal/beanio/bloco0/" + c.getSimpleName() + ".xml";
            StreamFactory factory = StreamFactory.newInstance();
            factory.load(Bloco0.class.getClass().getResourceAsStream(path));
            beanWriter = factory.createWriter("sped", fw);
        }
        regClass = c;
    }

    public void write(Writer fw, Reg0000 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void writeIndicadorMovimento(Writer fw, IndicadorMovimento indMov) throws IOException {
        RegIndicadorMovimento reg = new RegIndicadorMovimento();
        reg.setReg("0001");
        reg.setIndMov(indMov);

        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0005 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0015 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0100 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0150 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
        if (reg.getReg0175List() != null) {
            count += reg.getReg0175List().size();
        }
    }

    public void write(Writer fw, Reg0190 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0200 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;

        if (reg.getReg0205List() != null) {
            count += reg.getReg0205List().size();
        }
        if (reg.getReg0206() != null) {
            count++;
        }
        if (reg.getReg0220List() != null) {
            count += reg.getReg0220List().size();
        }
    }

    public void write(Writer fw, Reg0300 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
        if (reg.getReg0305() != null) {
            count++;
        }
    }

    public void write(Writer fw, Reg0400 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0450 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0460 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0500 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    public void write(Writer fw, Reg0600 reg) throws IOException {
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }

    /**
     * Escreve o registro de encerramento de bloco com o total de linhas
     * calculado pela instância desta classe.
     *
     * @param fw
     * @throws IOException
     */
    public void writeEncerramentoBloco(Writer fw) throws IOException {
        //inclui o registro de encerramento no total de linhas do bloco.
        count++;
        writeEncerramentoBloco(fw, count);
    }

    /**
     * Escreve o registro de encerramento de bloco.
     *
     * @param fw
     * @param totalLinhas
     * @throws IOException
     */
    public void writeEncerramentoBloco(Writer fw, long totalLinhas) throws IOException {
        RegEncerramentoBloco reg = new RegEncerramentoBloco();
        reg.setReg("0990");
        reg.setQtdLin(totalLinhas);

        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
    }
}

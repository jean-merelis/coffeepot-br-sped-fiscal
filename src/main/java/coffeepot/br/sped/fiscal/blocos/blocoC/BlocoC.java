/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.br.sped.fiscal.blocos.RegEncerramentoBloco;
import coffeepot.br.sped.fiscal.blocos.RegIndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import java.io.IOException;
import java.io.Writer;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

/**
 * Fachada do bloco C.
 *
 * @author Jeandeson O. Merelis
 */
public class BlocoC {

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
            factory.load(BlocoC.class.getClass().getResourceAsStream("/coffeepot/br/sped/fiscal/beanio/RegIndicadorMov.xml"));
            beanWriter = factory.createWriter("sped", fw);
        } else if (RegEncerramentoBloco.class.equals(c)) {
            StreamFactory factory = StreamFactory.newInstance();
            factory.load(BlocoC.class.getClass().getResourceAsStream("/coffeepot/br/sped/fiscal/beanio/RegEncerramentoBloco.xml"));
            beanWriter = factory.createWriter("sped", fw);
        } else {
            String path = "/coffeepot/br/sped/fiscal/beanio/blocoC/" + c.getSimpleName() + ".xml";
            StreamFactory factory = StreamFactory.newInstance();
            factory.load(BlocoC.class.getClass().getResourceAsStream(path));
            beanWriter = factory.createWriter("sped", fw);
        }
        regClass = c;
    }

    public void writeIndicadorMovimento(Writer fw, IndicadorMovimento indMov) throws IOException {
        RegIndicadorMovimento reg = new RegIndicadorMovimento();
        reg.setReg("C001");
        reg.setIndMov(indMov);
        
        setBeanWriter(fw, reg.getClass());
        beanWriter.write(reg);
        beanWriter.flush();
        count++;
    }
}

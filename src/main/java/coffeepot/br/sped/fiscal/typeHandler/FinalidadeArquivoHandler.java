/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class FinalidadeArquivoHandler implements TypeHandler {

    @Override
    public Object parse(String string) throws TypeConversionException {
        return FinalidadeArquivo.parse(string);
    }

    @Override
    public String format(Object o) {
        if (o == null) {
            return "";
        }
        return ((FinalidadeArquivo) o).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return FinalidadeArquivo.class;
    }
}

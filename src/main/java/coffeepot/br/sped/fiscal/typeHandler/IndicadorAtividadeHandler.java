/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class IndicadorAtividadeHandler implements TypeHandler{

    @Override
    public Object parse(String string) throws TypeConversionException {
        return IndicadorAtividade.parse(string);
    }

    @Override
    public String format(Object o) {
        if (o == null) {
            return "";
        }
        return ((IndicadorAtividade) o).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return IndicadorAtividade.class;
    }
    
}

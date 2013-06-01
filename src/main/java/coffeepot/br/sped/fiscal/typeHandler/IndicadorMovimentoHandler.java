/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class IndicadorMovimentoHandler implements TypeHandler{

    @Override
    public Object parse(String text) throws TypeConversionException {
        return IndicadorMovimento.parse(text);
    }

    @Override
    public String format(Object value) {
        if (value == null)
            return "";
        
        return ((IndicadorMovimento) value).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return IndicadorMovimento.class;
    }
    
}

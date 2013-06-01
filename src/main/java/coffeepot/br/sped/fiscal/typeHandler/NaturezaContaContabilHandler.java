/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.ParseException;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class NaturezaContaContabilHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        try {
            return NaturezaContaContabil.parse(text);
        } catch (ParseException ex) {
            throw new TypeConversionException(ex.getMessage());
        }
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return "";
        }
        return ((NaturezaContaContabil) value).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return NaturezaContaContabil.class;
    }
}

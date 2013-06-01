/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import coffeepot.br.sped.fiscal.tipos.ParseException;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class TipoContaContabilHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        try {
            return TipoContaContabil.parse(text);
        } catch (ParseException ex) {
            throw new TypeConversionException(ex.getMessage());
        }
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return "";
        }
        return ((TipoContaContabil) value).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return TipoContaContabil.class;
    }
}
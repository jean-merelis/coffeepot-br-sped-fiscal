/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.ParseException;
import coffeepot.br.sped.fiscal.tipos.TipoItem;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class TipoItemHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        try {
            return TipoItem.parse(text);
        } catch (ParseException ex) {
            throw new TypeConversionException(ex.getMessage());
        }
    }

    @Override
    public String format(Object value) {
        if (value == null){
            return "";
        }
        return ((TipoItem) value).getCodigoAsString();
    }

    @Override
    public Class<?> getType() {
        return TipoItem.class;
    }
}

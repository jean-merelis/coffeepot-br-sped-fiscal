/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import coffeepot.br.sped.fiscal.tipos.ParseException;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class SituacaoDocumentoHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        try {
            if (text == null || "".equals(text)) {
                return null;
            }
            return SituacaoDocumento.parse(text);
        } catch (ParseException ex) {
            throw new TypeConversionException(ex.getMessage());
        }
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return null;
        }
        return ((SituacaoDocumento) value).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return SituacaoDocumento.class;
    }
    
}

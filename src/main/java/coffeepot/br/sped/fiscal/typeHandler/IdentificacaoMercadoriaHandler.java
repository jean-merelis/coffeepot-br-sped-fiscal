/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.IdentificacaoMercadoria;
import coffeepot.br.sped.fiscal.tipos.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class IdentificacaoMercadoriaHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        try {
            if (text == null || "".equals(text)) {
                return null;
            }
            return IdentificacaoMercadoria.parse(text);
        } catch (ParseException ex) {
            throw new TypeConversionException(ex.getMessage());
        }
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return null;
        }
        return ((IdentificacaoMercadoria) value).getCodigo();
    }

    @Override
    public Class<?> getType() {
        return IdentificacaoMercadoria.class;
    }
}

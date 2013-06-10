/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.bean.wr.typeHandler.DefaultEnumHandler;
import coffeepot.bean.wr.typeHandler.HandlerParseException;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.ParseException;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class CustomEnumHandler extends DefaultEnumHandler {

    @Override
    public Enum parse(String text) throws HandlerParseException {
        if (text == null || "".equals(text)) {
            return null;
        }

        if (EnumCodificado.class.isAssignableFrom(type)) {
            Enum[] enumConstants = type.getEnumConstants();
            try {
                return ((EnumCodificado) enumConstants[0]).parse(text);
            } catch (ParseException ex) {
                throw new HandlerParseException(ex.getMessage());
            }
        }

        return super.parse(text);
    }

    @Override
    public String toString(Enum obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof EnumCodificado) {
            return ((EnumCodificado) obj).getCodigo();
        }

        return super.toString(obj);
    }
}

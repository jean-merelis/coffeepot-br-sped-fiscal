/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.br.sped.fiscal.tipos.Perfil;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class PerfilHandler implements TypeHandler{

    @Override
    public Object parse(String string) throws TypeConversionException {
        return Perfil.parse(string);
    }

    @Override
    public String format(Object o) {
        if (o == null) {
            return "";
        }
        return ((Perfil) o).getCodigo();        
    }

    @Override
    public Class<?> getType() {
        return Perfil.class;
    }
    
}

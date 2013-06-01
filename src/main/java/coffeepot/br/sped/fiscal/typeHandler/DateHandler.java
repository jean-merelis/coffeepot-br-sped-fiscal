/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class DateHandler implements TypeHandler {

    static SimpleDateFormat DATEFORMAT = new SimpleDateFormat("ddMMyyyy");

    @Override
    public Object parse(String string) throws TypeConversionException {
        if (string == null || "".equals(string) || "00000000".equals(string)) {
            return null;
        }

        Date d;
        try {
            d = DATEFORMAT.parse(string);
        } catch (Exception ex) {
            throw new TypeConversionException(string);
        }
        return d;
    }

    @Override
    public String format(Object o) {
        if (o == null) {
            return "";
        }
        return DATEFORMAT.format((Date) o);
    }

    @Override
    public Class<?> getType() {
        return Date.class;
    }
}

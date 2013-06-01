/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import java.text.DecimalFormat;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class FloatHandler implements TypeHandler {

    static final DecimalFormat DECIMALFORMAT;

    static {
        DECIMALFORMAT = new DecimalFormat("#0.########");
        DECIMALFORMAT.getDecimalFormatSymbols().setDecimalSeparator(',');
        DECIMALFORMAT.getDecimalFormatSymbols().setGroupingSeparator('.');
    }
    
    @Override
    public Object parse(String string) throws TypeConversionException {
        if (string == null) {
            return null;
        }
        //String s = string.replace(',', '.');
        Double d;
        try {
            d = (Double) DECIMALFORMAT.parse(string);//Double.parseDouble(s);
        } catch (Exception ex) {
            throw new TypeConversionException("Não foi possível converter o texto \"" + string + "\" para o tipo Double.");
        }
        return d;
    }

    @Override
    public String format(Object o) {
        if (o == null) {
            return "";
        }
        double d = (Double) o;
        return DECIMALFORMAT.format(d);
    }

    @Override
    public Class<?> getType() {
        return Double.class;
    }
}

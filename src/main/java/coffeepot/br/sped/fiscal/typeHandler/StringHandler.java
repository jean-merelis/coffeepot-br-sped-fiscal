/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import java.util.Properties;
import org.beanio.types.ConfigurableTypeHandler;
import static org.beanio.types.ConfigurableTypeHandler.FORMAT_SETTING;
import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class StringHandler implements ConfigurableTypeHandler {

    private Integer maxLength;
    private Integer minLength;
    private char padding;
    private boolean justifyLeft;
    private boolean numbersOnly;
    private boolean numbersLettersOnly;
    private boolean trim;
    private boolean upper;
    private String pattern;

    private void setDefaultValues() {
        maxLength = null;
        minLength = null;
        padding = ' ';
        justifyLeft = true;
        numbersOnly = false;
        numbersLettersOnly = false;
        trim = true;
        upper = false;
        pattern = null;
    }

    public StringHandler() {
        setDefaultValues();
    }

    @Override
    public TypeHandler newInstance(Properties properties) throws IllegalArgumentException {
        String pattern = properties.getProperty(FORMAT_SETTING);
        if (pattern == null || "".equals(pattern)) {
            setDefaultValues();
            return this;
        }
        if (!pattern.equals(this.pattern)) {
            setPattern(pattern);
        }

        return this;
        //TODO: verificar se é necessário criar realmente uma nova instancia, ou se apenas ajustar os paramentos é mais eficiente.
    }

    @Override
    public Object parse(String text) throws TypeConversionException {
        return text;
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return null;
        }

        // aqui pode se aplicar algumas regras, como remover acentuação, deixar tudo em caixa alta, etc.        

        String s = (String) value;

        if (trim) {
            s = s.trim();
        }

        if (numbersOnly) {
            s = s.replaceAll("\\D", "");
        } else if (numbersLettersOnly) {
            s = s.replaceAll("[^0-9\\p{L}]", "");
        }

        if (maxLength != null) {
            s = s.length() <= maxLength ? s : s.substring(0, maxLength);
        }

        if (minLength != null) {
            if (s.length() < minLength) {
                StringBuilder sb = new StringBuilder();
                int i = minLength - s.length();
                if (justifyLeft) {
                    sb.append(s);
                }
                for (int j = 0; j < i; j++) {
                    sb.append(padding);
                }
                if (!justifyLeft) {
                    sb.append(s);
                }
                s = sb.toString();
            }
        }

        if (upper) {
            s = s.toUpperCase();
        }

        return s;
    }

    @Override
    public Class<?> getType() {
        return String.class;
    }

    private void setPattern(String pattern) {
        setDefaultValues();
        this.pattern = pattern;        
        if (pattern != null && !pattern.isEmpty()) {
            String[] props = pattern.split(";");
            for (String prop : props) {
                String[] keyValue = prop.split("=");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    switch (key) {
                        case "max":
                            maxLength = Integer.parseInt(value);
                            break;
                        case "maxLength":
                            maxLength = Integer.parseInt(value);
                            break;
                        case "min":
                            minLength = Integer.parseInt(value);
                            break;
                        case "minLength":
                            minLength = Integer.parseInt(value);
                            break;
                        case "numbersOnly":
                            numbersOnly = "true".equals(value);
                            break;
                        case "numbersLettersOnly":
                            numbersLettersOnly = "true".equals(value);
                            break;
                        case "trim":
                            trim = "true".equals(value);
                            break;
                        case "upper":
                            upper = "true".equals(value);
                            break;
                        case "padding":
                            if ("".equals(value)) {
                                padding = ' ';
                            } else {
                                padding = value.charAt(0);
                            }
                            break;
                        case "justify":
                            justifyLeft = !"right".equals(value);
                            break;
                        default:
                            throw new IllegalArgumentException("A propriedade de configuração \""+key+"\" não é reconhecida pelo StringHandler");
                    }
                }
            }
        }
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class FloatHandlerTest {

    @Test
    public void testParse() throws Exception {
        System.out.println("parse");
        String string = "1,99";
        FloatHandler instance = new FloatHandler();
        Double expResult = 1.99;        
        Double result = (Double) instance.parse(string);        
        assertEquals(expResult, result);
    }

    @Test
    public void testFormat() {
        System.out.println("format");
        Double o = 12345.123456;
        FloatHandler instance = new FloatHandler();
        String expResult = "12345,123456";
        String result = instance.format(o);
        assertEquals(expResult, result);
    }

    @Test
    public void testFormat2() {
        System.out.println("format2");
        Double o = 5d;
        FloatHandler instance = new FloatHandler();
        String expResult = "5";
        String result = instance.format(o);
        assertEquals(expResult, result);
    }

}
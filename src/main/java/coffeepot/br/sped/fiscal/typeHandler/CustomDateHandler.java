/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.typeHandler;

import coffeepot.bean.wr.typeHandler.DefaultDateHandler;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class CustomDateHandler extends DefaultDateHandler{

    public CustomDateHandler() {
        patternForDate = "ddMMyyyy";
        patternForTime = "HHmmss";
        dateFormat = new SimpleDateFormat(patternForDate);        
    }

    @Override
    protected void setDefaultValues() {
        dateFormat = new SimpleDateFormat(patternForDate);  
    }
    
    
    
}

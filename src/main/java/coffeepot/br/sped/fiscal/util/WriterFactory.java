/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.util;

import coffeepot.bean.wr.typeHandler.DefaultDateHandler;
import coffeepot.bean.wr.typeHandler.DefaultDoubleHandler;
import coffeepot.bean.wr.typeHandler.TypeHandler;
import coffeepot.bean.wr.writer.DelimitedWriter;
import coffeepot.bean.wr.writer.ObjectWriter;
import coffeepot.br.sped.fiscal.typeHandler.CustomDateHandler;
import coffeepot.br.sped.fiscal.typeHandler.CustomEnumHandler;
import java.io.Writer;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class WriterFactory {

    public static ObjectWriter createObjectWriter(Writer w) {
        ObjectWriter beanWriter = DelimitedWriter.create(w)
                .withDelimiter('|')
                .withRecordInitializator("|")
                .withRecordTerminator("|\r\n");
        
        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerClassFor(Date.class, CustomDateHandler.class);
        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerClassFor(Enum.class, CustomEnumHandler.class);

        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerInstanceAsDefaultFor(Double.class, WriterFactory.createDefaultDoubleHandler());

        return beanWriter;
    }

    private static TypeHandler createDefaultDoubleHandler() {
        DefaultDoubleHandler handler = new DefaultDoubleHandler();
        String[] params = new String[]{"pattern=#0.##########", "decimalSeparator=,", "groupingSeparator=."};
        handler.setConfig(params);
        return handler;
    }

}

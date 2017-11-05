/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.reader;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import coffeepot.bean.wr.mapper.Callback;
import coffeepot.bean.wr.reader.DelimitedReader;
import coffeepot.bean.wr.reader.ObjectReader;
import coffeepot.bean.wr.typeHandler.DefaultDateHandler;
import coffeepot.bean.wr.typeHandler.DefaultDoubleHandler;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import coffeepot.br.sped.fiscal.typeHandler.CustomEnumHandler;
import coffeepot.br.sped.fiscal.typeHandler.LocalDateHandler;
import coffeepot.br.sped.fiscal.typeHandler.LocalDateTimeHandler;
import coffeepot.br.sped.fiscal.typeHandler.LocalTimeHandler;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class ReaderFactory {

    public static ObjectReader createReader( Reader w ) {
        return createReader( w, (Integer) null );
    }

    public static ObjectReader createReader( Reader w, VersaoLayout versaoLayout ) {
        return createReader( w, Integer.valueOf( versaoLayout.getCodigo() ) );
    }

    public static ObjectReader createReader( Reader r, Integer version ) {
        DelimitedReader reader = new DelimitedReader( r );
        reader.setDelimiter( '|' );
        reader.setRecordInitializator( "|" );
        reader.setRemoveRecordInitializator( true );
        reader.setIgnoreUnknownRecords( false );

        // auto-detect version
        if (version == null){
            reader.setIdResolver(new CallbackImpl(reader));
        } else {
            reader.setVersion( version );
        }


        reader.getObjectMapperFactory().getHandlerFactory().registerTypeHandlerClassFor( Enum.class, CustomEnumHandler.class );
        reader.getObjectMapperFactory().getHandlerFactory().registerTypeHandlerClassFor(LocalDate.class, LocalDateHandler.class);
        reader.getObjectMapperFactory().getHandlerFactory().registerTypeHandlerClassFor(LocalDateTime.class, LocalDateTimeHandler.class);
        reader.getObjectMapperFactory().getHandlerFactory().registerTypeHandlerClassFor(LocalTime.class, LocalTimeHandler.class);

        DefaultDoubleHandler.setPatternDefault( "#0.##########" );
        DefaultDoubleHandler.setDecimalSeparatorDefault( ',' );
        DefaultDoubleHandler.setGroupingSeparatorDefault( '.' );


        return reader;
    }

    private static class CallbackImpl implements Callback<String, String> {

        private final DelimitedReader reader;

        public CallbackImpl( DelimitedReader reader ) {
            this.reader = reader;
        }

        @Override
        public String call( String line ) {
            String[] fields = line.split( "\\|");
            reader.setVersion( Integer.parseInt(fields[1]) );
            reader.setIdResolver( null );
            return fields[0];
        }
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 *
 * @author Jeandeson O. Merelis
 */
public interface EnumCodificado {
    String getCodigo();
    Enum parse(String codigo) throws ParseException;
}

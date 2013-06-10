/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/**
 * Perfil de apresentação do arquivo fiscal.
 *
 * @author Jeandeson O. Merelis
 */
public enum Perfil  implements EnumCodificado{

    A("A"),
    B("B"),
    C("C");
    
    private String codigo;

    private Perfil(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public Perfil parse(String codigo) {
        if ("A".equals(codigo)) {
            return A;
        }
        if ("B".equals(codigo)) {
            return B;
        }
        if ("C".equals(codigo)) {
            return C;
        }
        return null;
    }
}

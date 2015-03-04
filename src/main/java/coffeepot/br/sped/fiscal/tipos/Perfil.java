/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

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
    
    public static Perfil parseEnum(String codigo){
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

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

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
 * Registro de encerramento de bloco.
 *
 * @author Jeandeson O. Merelis
 */
public class RegEncerramentoBlocoBase {

    protected String reg;
    protected Long qtdLin;

    public String getReg() {
        return reg;
    }

    protected void setReg(String reg) {
        this.reg = reg;
    }

    public Long getQtdLin() {
        return qtdLin;
    }

    public void setQtdLin(Long qtdLin) {
        this.qtdLin = qtdLin;
    }
}

/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.util;

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


import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9001;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9900;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9999;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Util {

    /**
     * Conta a quantidade de registros no arquivo. Considerando que um registro
     * é o mesmo que uma linha terminada com LF.
     *
     * <p/>
     *
     * Este recurso é util para se obter a quantidade de registros que foram
     * escritos no ultimo bloco como o exemplo a seguir:
     *
     * <pre>
     * {@code
     *
     *   long totalRegistrosBloco = 0L;
     *   long ultimaLinha = 0L;
     *
     *   //Escreve os registros do Bloco0, exceto o registro 0990.
     *   spedFiscalWriter.write(reg0000);
     *   spedFiscalWriter.write(reg0001);
     *   ...
     *
     *   //obtém o total de registros escritos até agora, apartir da primeira linha.
     *   totalRegistrosBloco = Util.countRecords("SpedFiscal.txt",0);
     *
     *   //cria o registro 0990 com o total de registros obtidos,
     *   //adicionando mais 1 que é o próprio 0990
     *   totalRegistrosBloco += 1;
     *   Reg0990 reg0990 = new Reg0990(totalRegistrosBloco);
     *
     *   //escreve o registro criado
     *   spedFiscalWriter.write(reg0990);
     *
     *   //guarda o indice para a próxima leitura
     *   ultimaLinha += totalRegistrosBloco;
     *
     *   //Escreve os registros do BlocoC, exceto o registro C990.
     *   spedFiscalWriter.write(regC001);
     *   spedFiscalWriter.write(regC005);
     *   ...
     *   //obtém o total de registros do BlocoC escritos até agora, apartir da ultima linha do Bloco0.
     *   totalRegistrosBloco = Util.countRecords("SpedFiscal.txt", ultimaLinha);
     *
     *   //cria o registro C990 com o total de registros obtidos,
     *   //adicionando mais 1 que é o próprio C990
     *   totalRegistrosBloco += 1;
     *   RegC990 regC990 = new Reg0990(totalRegistrosBloco);
     *
     *   //escreve o registro criado
     *   spedFiscalWriter.write(regC990);
     *
     *   //guarda o indice para a próxima leitura
     *   ultimaLinha += totalRegistrosBloco;
     *
     *   ... e assim por diante ...
     *}
     * </pre>
     *
     * @param file Arquivo a ser analizado.
     * @param beginIndex Indice de onde se deve começar a contagem, baseado em
     * zero.
     * @return
     */
    public static long countRecords(String file, long beginIndex) throws FileNotFoundException, IOException {
        return countRecords(new File(file), beginIndex);
    }

    /**
     * Conta a quantidade de registros no arquivo. Considerando que um registro
     * é o mesmo que uma linha terminada com LF.
     *
     * <p/>
     *
     * Este recurso é util para se obter a quantidade de registros que foram
     * escritos no ultimo bloco como o exemplo a seguir:
     *
     * <pre>
     * {@code
     *
     *   long totalRegistrosBloco = 0L;
     *   long ultimaLinha = 0L;
     *
     *   //Escreve os registros do Bloco0, exceto o registro 0990.
     *   spedFiscalWriter.write(reg0000);
     *   spedFiscalWriter.write(reg0001);
     *   ...
     *
     *   //obtém o total de registros escritos até agora, apartir da primeira linha.
     *   totalRegistrosBloco = Util.countRecords("SpedFiscal.txt",0);
     *
     *   //cria o registro 0990 com o total de registros obtidos,
     *   //adicionando mais 1 que é o próprio 0990
     *   totalRegistrosBloco += 1;
     *   Reg0990 reg0990 = new Reg0990(totalRegistrosBloco);
     *
     *   //escreve o registro criado
     *   spedFiscalWriter.write(reg0990);
     *
     *   //guarda o indice para a próxima leitura
     *   ultimaLinha += totalRegistrosBloco;
     *
     *   //Escreve os registros do BlocoC, exceto o registro C990.
     *   spedFiscalWriter.write(regC001);
     *   spedFiscalWriter.write(regC005);
     *   ...
     *   //obtém o total de registros do BlocoC escritos até agora, apartir da ultima linha do Bloco0.
     *   totalRegistrosBloco = Util.countRecords("SpedFiscal.txt", ultimaLinha);
     *
     *   //cria o registro C990 com o total de registros obtidos,
     *   //adicionando mais 1 que é o próprio C990
     *   totalRegistrosBloco += 1;
     *   RegC990 regC990 = new Reg0990(totalRegistrosBloco);
     *
     *   //escreve o registro criado
     *   spedFiscalWriter.write(regC990);
     *
     *   //guarda o indice para a próxima leitura
     *   ultimaLinha += totalRegistrosBloco;
     *
     *   ... e assim por diante ...
     *}
     * </pre>
     *
     * @param file Arquivo a ser analizado.
     * @param beginIndex Indice de onde se deve começar a contagem, baseado em
     * zero.
     * @return
     */
    public static long countRecords(File file, long beginIndex) throws FileNotFoundException, IOException {
        long totalLines = 0l;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {       
            while (reader.readLine() != null) {
                if (beginIndex > 0) {
                    beginIndex--;
                    continue;
                }
                totalLines++;
            }
        }
        return totalLines;
    }

    /**
     * Cria o Bloco9 apartir do arquivo.
     *
     * @param file Arquivo do SPED Fiscal.
     * @return
     */
    public static Bloco9 createBloco9(String file) throws FileNotFoundException, IOException {
        return createBloco9(new File(file));
    }

    /**
     * Cria o Bloco9 apartir do arquivo.
     *
     * @param file Arquivo do SPED Fiscal.
     * @return
     */
    public static Bloco9 createBloco9(File file) throws FileNotFoundException, IOException {
        Bloco9 bloco = new Bloco9();

        long totalLines = 0l;


        bloco.setReg9001(new Reg9001(IndicadorMovimento.COM_DADOS));

        Map<String, Long> totalizers = new LinkedHashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line, key;
            while ((line = reader.readLine()) != null) {
                key = line.substring(1, 5);
                Long amount = totalizers.get(key);
                amount = amount == null ? 1 : amount + 1;
                totalizers.put(key, amount);
                totalLines++;
            }
        }
        totalizers.put("9001", 1l);
        totalizers.put("9900", totalizers.size() + 4l); //+4 é referente aos registros do bloco9
        totalizers.put("9990", 1l);
        totalizers.put("9999", 1l);

        long bloco9TotalLines = totalizers.size() + 3; //total de todos totalizadores + 3 registros ref. 9001, 9990 e 9999
        totalLines += bloco9TotalLines;


        List<Reg9900> reg9900List = new LinkedList<>();
        Set<Map.Entry<String, Long>> entrySet = totalizers.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            Reg9900 reg9900 = new Reg9900();
            reg9900.setRegBlc(entry.getKey());
            reg9900.setQtdRegBlc(entry.getValue());
            reg9900List.add(reg9900);
        }

        bloco.setReg9900List(reg9900List);
        bloco.setReg9990(new Reg9990(bloco9TotalLines));

        bloco.setReg9999(new Reg9999(totalLines));
        return bloco;
    }
}

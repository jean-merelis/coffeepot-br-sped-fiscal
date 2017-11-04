coffeepot-br-sped-fiscal
========================

Project to be used in Brazil to write file in accordance to local regulations.

Este projeto é um mapeamento de classes Java para formatação e gravação do arquivo texto no layout definido para o SPED Fiscal.

Para manter uma relação com a documentação oficial do Sped e facilitar o entendimento dos campos, os nomes dos campos seguem a mesma nomeclatura que está no layout técnico do Sped, mas sem a utilização do underline, usando a notação camelCase.

Projeto baseado em Maven. Utilizando JDK 1.7

Documentação técnica e layout:
  http://sped.rfb.gov.br/estatico/55/84F292AA956E838ED01DB91A8D4C6ECD9E53C8/GUIA%20PR%C3%81TICO%20DA%20EFD%20-%20Vers%C3%A3o%202.0.20.pdf

Dependência: coffeepot-bean-wr -
	https://github.com/jean-merelis/coffeepot-bean-wr

Download from Maven central

```xml
        <dependency>
            <groupId>com.github.jean-merelis</groupId>
            <artifactId>coffeepot-br-sped-fiscal</artifactId>
            <version>1.0.0-Beta.8</version>
        </dependency>
```

Exemplo escrevendo registro a registro no arquivo:
```java
//Criando o escritor do Sped Fiscal
SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(file);

Reg0000 reg = new Reg0000();
//atribui os dados do registro
//reg.set...

//Escreve o registro no arquivo
spedFiscalWriter.write(reg);

Reg0001 reg1 = new Reg0001();
//atribui os dados do registro
//reg1.set...

//Escreve o registro no arquivo
spedFiscalWriter.write(reg1);

spedFiscalWriter.flush();
spedFiscalWriter.close();
```

Exemplo escrevendo um bloco inteiro no arquivo:

```java
//Criando o escritor do Sped Fiscal
SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(file);

Bloco0 bloco0 = new Bloco0();
//atribui os registros do bloco
//bloco0.setReg...

//Escreve o bloco no arquivo
spedFiscalWriter.write(bloco0);

spedFiscalWriter.flush();
spedFiscalWriter.close();
```


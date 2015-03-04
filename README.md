coffeepot-br-sped-fiscal
========================

Project to be used in Brazil to write file in accordance to local regulations.

Este projeto é um mapeamento de classes Java para formatação e gravação do arquivo texto no layout definido para o SPED Fiscal.

Para manter uma relação com a documentação oficial do Sped e facilitar o entendimento dos campos, os nomes dos campos seguem a mesma nomeclatura que está no layout técnico do Sped, mas sem a utilização do underline, usando a notação camelCase.

Projeto baseado em Maven. Utilizando JDK 1.7

Documentação técnica e layout:
  http://www.fazenda.gov.br/confaz/confaz/Atos/Atos_Cotepe/2008/ac009_08.htm

Dependência: coffeepot-bean-wr - 
	https://github.com/jean-merelis/coffeepot-bean-wr


	
Exemplo escrevendo registro a registro no arquivo:

		//Criando o escritor do Sped Fiscal
		Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));       
		SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);
		
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
 
		spedFiscalWriter.writerFlush();
        spedFiscalWriter.writerClose();
		
Exemplo escrevendo um bloco inteiro no arquivo:

		//Criando o escritor do Sped Fiscal
		Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));       
		SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);
		
		Bloco0 bloco0 = new Bloco0();
		//atribui os registros do bloco
		//bloco0.setReg...
		
		//Escreve o bloco no arquivo
        spedFiscalWriter.write(bloco0);
 
		spedFiscalWriter.writerFlush();
        spedFiscalWriter.writerClose();

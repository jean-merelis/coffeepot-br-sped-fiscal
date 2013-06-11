coffeepot-br-sped-fiscal
========================

Project to be used in Brazil to write file in accordance to local regulations.

Documentação técnica e layout:
  http://www.fazenda.gov.br/confaz/confaz/Atos/Atos_Cotepe/2008/ac009_08.htm

Este projeto é um mapeamento de classes Java para formatação e gravação do arquivo texto no layout definido para o SPED Fiscal.

Para manter uma relação com a documentação oficial do Sped e facilitar o entendimento dos campos, os nomes dos campos seguem a mesma nomeclatura que está no layout técnico do Sped, mas sem a utilização do underline, usando a notação camelCase.

Projeto baseado em Maven. Utilizando JDK 1.7

Dependência: coffeepot-bean-wr - 
	https://github.com/jom76/coffeepot-bean-wr

Andamento:
- Bloco 0 - ok.
- Trabalhando no Bloco C.
	- série C100 .. C197 - ok.
	- série C300 .. C390 - ok.
	- série C400 .. C495 - ok.


Jeandeson O. Merelis. <jean.merelis@gmail.com>

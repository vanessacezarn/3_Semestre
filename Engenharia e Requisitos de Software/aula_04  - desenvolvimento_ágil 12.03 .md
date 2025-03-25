 # DESENVOLVIMENTO ÁGIL

## ➤ O QUE É DESENVOLVIMENTO ÁGIL

	🡺 engenharia de software àgil combina filosofia com um conjunto de princípios de desenvolvimento
	🡺 é uma filosofia que defende :
		• satisfação do cliente 
		• entrega de incremental prévio
		• equipes de projeto pequenas e motivadas
		• métodos informais
		• simplicidade no desenolvimento geral ➞ acima de tudo
	🡺 prioriza a entrega mais do que análise e projeto
	🡺 prioriza a comunicação ativa ativa e contínua entre desenvolvedores e clientes.
	🡺 equipe ágil (engenheiro de software e outros envolvidos no projeto) ➞ equipe que se auto-organiza e que controla seu própio destino
	🡺 a engenharia de software ágil tem sido uma razoável alternativa para a engenharia convencional e tem se mostrado capaz de entregar sistemas corretos rapidamente.   
	🡺 Os métodos ágeis são algumas vezes conhecidos como métodos light ou métodos enxutos (lean methods)

# ➤ ETAPAS ENVOLVIDAS

	• desenvolvimento ágil pode ser denominado "engenharia de software flexível".
	**flexibilidade = em relação a tamanho de equipe, da oraganização da equipe, da metodologia 
	🡺 atividades metodológicas básicas permanecem: comunicação, planejamento, modelagem, construção e emprego ➞ Entretanto, estas se transformam em um conjunto de tarefas mínimas que impulsiona a equipe para o desenvolvimento e para a entrega 

## ➤ AGILIDADE

	• ágil = adaptação a mudanças 
	🡺 uma equipe ágil é aquela rápida e capaz de responder apropriadamente a mudanças.
	🡺 mudanças tem muito a ver com desenvolvimento de software ➞ mudança na equipe, mudança na tecnologia, mudança na equipe,...

**➤ AGILIDADE E O CUSTO DAS MUDANÇAS**

![custo_mudança](https://github.com/vanessacezarn/3_Semestre/blob/00348c4d7ad940cd9fc0a90a4e6d8fe61a73deb1/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_04/custos%20de%20mudan%C3%A7a.png)
	
 	🡺 a sabedoria convencional em desenvolvimento de software afirma que os custos de mudanças aumentam de forma não lineares conforme o projeto avança
    🡺 entrega partes do projeto, sempre está construindo partes logo se precisar fazer alterações não precisa mudar tudo como seria no processo de software convencional   
    🡺 em teoria o custo final dos dois processos é igual, só não está distribuido o pagamento de forma equilibrada
		• software convencionar tem forma de uma função exponencial - custo bem elevado no final do projeto (grande variação do preço inicial para o final)
		• software ágil tem alteração nos preço ao decorrer do projeto mas não tem um variação tão grande, pois como vai fazendo e entregando não é necessario mudanças tão bruscras no projeto.



## ➤ o que é processo ágil

	🡺 Um processo ágil de software deve se adaptar incrementalmente.
	🡺 para uma adaptação incremental é necessário:
		• feedback do cliente - para poder realizar adaptações
		• protótipo operacional ou parte de um sistema operacional
		• desenvolvimento incremental
		• entrega dos protótipos em curtos periodos
		• adaptações devem acompanhar o mesmo ritmo das mudanças - imprevisibilidade


    
## ➤ Manifesto para o desenvolvimento agil de software**
 
    	➞ 12 mandamentos/princípio do manifesto àgil:
        	• 1º maior prioridade é satisfazer o cliente através da entrega contínua e adiantada de software com valor agregado
        	• 2º aceitar e adequar-se a mudanças para o cliente, deve-se aproveitar as mudanças como uma vantagem competitiva na relação com o cliente
        	• 3º entregar um software em funcionamento frequentemente, semanas ou meses
        	• 4º pessoal deo comercial e os desenvolvedores devem trabalhar em conjunto durante todo o projeto
       		• 5º projetos com individuos motivados, ambiente e apoio necessarios são essencias
        	• 6º conversas presenciais com a equipe são o método mais eficiente de transmitir informações para a equipe
        	• 7º software funcionando é a medida primária de progresso
        	• 8º processos ágeis promovem desenvolvimento sustentável (todos os envolvidos estão ganhando - quem está produzindo, quem está pagando) 			
	 			➞ os patrocinadores, desenvolvedores e usuarios devem ser capazes de manter um ritmo constante 
        	• 9º contínua atenção a excelencia técnica e bom design aumenta a agilidade ➞ código organizado, bem estruturado, classe, atributo, funções com nome acessiveis e de facil compreensão sobre o que está trabalhando
        	• 10º simplicidade -  maximar a quantidade de trabalho que não precisou ser feito
			• 11º as melhores arquiteturas, requisitos e projetos emergem de equipes que se auto-organizam
        	• 12º em intervalo regulares, o time reflete em como ficar mais efetivo e melhorar.
		**pessoa de negócio = representante do cliente

 

# MODELOS DE PROCESSO ÁGEIS 

	• Extreme Programming - XP
	• Scrum
	• Método de desenvolvimento de sitemas dinâmicos (Dynamic Systems Development Method, DSDM)
	• Desenvolvimento dirigido a Funcionalidades (Feature Drive Development, FDD)

## ➤ EXTREME PROGRAMMING - XP

    🡺 emprega uma abordagem orientada a objetos como seu paradigma de desenvolvimento preferido e envolve um conjunto de regras e praticas constantes no contexto de quatro atividades metodológicas: planejamento, projeto codificação e teste
	
       					PLANEJAMENTO:
		• levantamento de requisitos
        • *histórias de usuário* : definir quais as caracteristicas e funcionalidades que o cliente deseja ter em seu software
        • criterios de teste de aceitação
		• plano de iteração
					 	  🡻
       					PROJETO: 
		•projeto simples com cartões *C.R.C. - classe, responsabilidade, colaboração
			- princípio KIS - 
        • prefere um projeto simples
					  	  🡻
        				CODIFICAÇÃO = construção 
              • testes de unidades que exercitam cada uma das historia a ser incluidas na versao corrente
              • *P.P = programação em dupla = tecnica de revisão/ ferramenta de qualidade, uma pessoa está criando o codigo e outra está colaborando para a criação
	      				 	  🡻
        				 	TESTE: 
              • teste de unidade: devem ser implementados usando-se uma metodologia que os capacite a ser automatizados
              • teste de aceitação(TA): são especificados pelo cliente e mantêm o foco nas características e na funcionalidade do sistema total que são visíveis e que podem ser revistaspelo cliente
	      • teste de intregração(TI):
       	      • teste unitario:
       ➨ entrega partes do projeto e recomeça o ciclo 
      🡺 problemas no XP = pagamento para duas pessoas programarem juntas - IA tem ganhado prioridade

![xp](https://github.com/vanessacezarn/3_Semestre/blob/00348c4d7ad940cd9fc0a90a4e6d8fe61a73deb1/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_04/xp.png)

## ➤ SCRUM -  um dos mais utilizados atualmente**
	
    	🡺 IMAGEM 
				 BACKLOG do PRODUTO - "caixas"
 		• toda fase de comunicação com cliente: 
   		• lista de funcionalidades(caixa) que o produto deve ter
     		• nas funcionalidades são estabelecidades prioridade ( um pouco da fase planejamento) 
       					🡻
				 SPRINT BACKLOG - "pastas"
 		• itens pendentes do backlog expandidos para equipe: 
   			➞ DIVIDE AS TAREFAS PARA A EQUIPE (gerenciamento da equipe) para cada um trabalhar em um parte (pastas) :banco de dados, backend, frontend, design, exeperiencia do usuario 
      		• nessa etapa é realizado o restante do projeto e a modelagem 
		• modelos de projeto ➞ tem que estar detalhado o que devera ser feito
					🡻
				      SPRINT
 		•(construção) :limite de tempo para entregar partes do projeto definida no backlog do spritn - de 2 semanas a 1 mês ➞ ciclos
           	   🡺 comunicação diaria entre a equipe e a pessoa de negocios (PRODUCT ONNER - P.O) - reuniões curtas "DAILY" 
          		• o que foi feito desde a ultima reunião? o que será feito até a próxima reunião? teve problemas em alguma parte do projeto?
          		• pedidos de mudanças no projetos são passadas a equipes pelo representante do cliente -P.O 
	    				🡻
	 			     ENTREGA
    		• apos o sprint é realizado a entrega do projeto / parte do projeto 
       		• nova reunião para comentar sobre a sprint entregue - SPRINT REVIEW ➞ pedidos de melhoras pela equipe, equipamentos, materiasi,...


















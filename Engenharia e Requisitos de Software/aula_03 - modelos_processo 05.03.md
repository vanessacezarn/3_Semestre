   # MODELOS DE PROCESSO 

        Processo: COMUNICAÇÃO 🡺 PLANEJAMENTO 🡺 MODULAGEM 🡺 CONSTRUÇÃO 🡺 EMEPREGO
      
      🡺 engenharia ➞ processo de fazer algo
      🡺 processo de software ➞ seguir uma serie de passos afim de criar um resultado de alta qualidade e dentro de um prazo estabelecido
      🡺 seguir um modelo de processo é importante pois propicia estabilidade, controle e organização para uma atividade.
      🡺 cada processo dependende do software que deseja-se desenvolver
      🡺 artefato = tudo que consegue colocar em um documento textual, codigos, dados produzidos,...
      🡺 como garantir que o trabalho foi feito corretamente - atingiu um nível de "maturidade" de seu processo de software
            ➞ qualidade, cumprimento de prazos e viabilidade a longo prazo são os melhores indicadores de eficácia do processo utilizado.



   
   ## FLUXOS DE PROCESSOS 
   
   🡺 fluxo de processo LINEAR: uma etapa depois da outra
	➞ executa as 5 atividades em sequência   

   ![linear](https://github.com/vanessacezarn/3_Semestre/blob/main/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/linear.png)
      
   🡺 fluxo de processo ITERATIVO: é possível ir e voltar de uma etapa para a outra
   	➞ pode repetir uma ou mais atividades

   ![iterativo](https://github.com/vanessacezarn/3_Semestre/blob/main/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/iterativo.png)
                                                                                   
   🡺 fluxo de processo EVOLUCIONÁRIO: executa as atividades de forma circular, cada vez que as 5 atividade são completas o 
         software passa a ter uma versão mais completa
   
   ![evolucionario](https://github.com/vanessacezarn/3_Semestre/blob/main/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/iterativo.png)
      
   🡺 fluxo de processo PARALELO: pode executar mais de uma atividade ao mesmo tempo 
	➞ exemplo: a modelagem pode ser executada em paralelo com a construção de um outro aspecto do software.
   
   ![paralelo](https://github.com/vanessacezarn/3_Semestre/blob/main/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/paralelo.png)
   
# MODELOS DE PROCESSO PRESCRITIVOS - TRADICIONAIS

## MODELO CASCATA
      🡺 pode ser chamado de ciclo de vida clássico  
      🡺 abordagem sequencial e sistemática, só é possível passar para a próxima etapa depois de concluir anterior, 3 etapas 
         iniciais demandam mais tempo
      🡺 vantagens: tudo muito organizado
      🡺 desvantagens: não são realizados muitos teste no processo, apenas nas etapas finais(construção): imagem no slide

![cascata](https://github.com/vanessacezarn/3_Semestre/blob/892dccfd271336b9939414603b7ecaf542d41319/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/modelo%20cascata.png)

## MODELO V

      🡺 Garantia de qualidade, cada etapa do processo tem testes (validação para ver se o que está sendo feito esta de acordo 
        com o pedido do cliente)
      🡺 VALIDAÇÃO: "lado direito do V -  de baixo para cima"
		➞ realizado uma sequência de testes - ações de garantia da qualidade que valida cada um dos modelos criados à medida que a equipe se desloca no lado esquerdo do V - de cima para baixo.
		➞ teste de aceitação (último teste), o cliente verifica se o software está de acordo com o pedido, 
		➞ teste do sistema,testa se todo o sistema está funcionando de forma correta
		➞ teste de integração, verificar se todas as partes do sistema funcionam e interagem entre si
		➞ teste de unidades, verifica se a parte que foi  desenvolvida está funcionando de forma correta
      🡺 VERIFICAÇÃO: "lado esquerdo do V, de cima para baixo" 	
		➞ os requisitos básicos do problemas são refinados em representações progressivamente cada vez mais detalhadas e técnicas do problema e de sua solução
		➞ verifica se a equipe segue o padrão escolhido, código         devidamente comentado, para o desenvolvimento do software

	🡺 demora muito mais tempo para ser desenvolvido, devido, a grande quantidade de teste, entretanto a quantia de problemas é bem menor, ou seja, possui uma MELHOR QUALIDADE
	🡺 é um  modelo linear, 
	🡺 PROBLEMAS: 
		• projetos reais não seguem o fluxo sequencial que o modelo propõe ➞ mudanças podem provocar confusão à medida que a equipe de projeto prossegue.
		• nem sempre o cliente deixa claro tudo que necessita na primeira etapa do processo, comunicação, o que pode prejudicar as etapas seguintes
		• versão operacional só ficará disponível perto do fim do projeto ➞ caso aja algum erro grave, será desastroso pra o projeto.
		
![modelo V](https://github.com/vanessacezarn/3_Semestre/blob/892dccfd271336b9939414603b7ecaf542d41319/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/modelo%20V.png)

## MODELO DE PROCESSO INCREMENTAL 
      🡺 combina elementos dos fluxos de processos lineares e paralelos
      🡺 aplica sequências lineares de forma escalonada à medida que o tempo vai avançando
	🡺 cada sequencia linear gera "incrementais" (entregáveis/aprovados/liberados) do software.
      🡺 reduz o tempo de entrega, as tarefas são DIVIDIDAS em pequenas partes, incrementos.
      🡺 mini cascatas, cada modulo do sistema passa por todo o processo de desenvolvimento para poder ser entregue ao cliente
      🡺 software é entregue em partes: exemplo, entrega o software de cadastros de clientes, software de recursos financeiros, 
       administração de funcionários,..., o que ao entregar todas as partes forma-se o software completo solicitado pelo cliente
      🡺 o cliente passa a ter contato em um menor tempo com partes do software que já estão utilizáveis. 

![incremental](https://github.com/vanessacezarn/3_Semestre/blob/c55bce3ad1ed50bbd93838ee9d4d5044593e5839/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/modelo%20incremental.png)

## MODELOS DE PROCESSO EVOLUCIONÁRIO
	🡺 são iterarivos
	🡺 fazem círculos de entrega, possibilitando o desenvolvimento de versões cada vez mais completas de software
	🡺 dois modelos comum em evolucionário 
     

***PROTOTIPAÇÃO***
	🡺 planejada rapidamente e ocorre a modelagem em forma de um projeto rápido, representação de aspectos do software que serão visíveis ao usuário final, PROTÓTIPO, o que ao ser mostrado ao cliente pode-se definir mudanças,
 solicitar novas funções, ou seja, o cliente vai avaliando se é isso mesmo que deseja durante o processo de desenvolvimento do software, ou seja, pode-se ir aprimorando os requisitos do projeto
      🡺 problema: 
		• não é desenvolvida pensando no todo o projeto, não é um processo muito organizado, 	
		• código acaba ficando muito  bagunçado e grande o que dificulta a manutenções futuras, isso ocorre devido a rapidez/pressa com que ele foi desenvolvido
![prototipação](https://github.com/vanessacezarn/3_Semestre/blob/c55bce3ad1ed50bbd93838ee9d4d5044593e5839/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/prototipa%C3%A7%C3%A3o.png)

***MODELO DE PROCESSO ESPIRAL***

      🡺 modelo evolucionário 
	🡺 fusão da natureza iterativa da prototipação com os aspectos sistemáticos e controlados do modelo cascata.
	🡺 modelo de processo dirigido a risco
      🡺 sabe o projeto final, mas ainda é feito e entregue por parte, a cada novo incremento, volta na espiral(imagem slide) é entregue parte do projeto ao cliente
      🡺 na etapa de planejamento: ANÁLISE DE RISCO - verifica-se se é possível seguir com o projeto, se ainda tem o  desenvolvedor, pagamento, caso de moeda estrangeira desvalorizar
      🡺 as 5 etapas em estão em círculos 
      🡺 apesar de saber todo o projeto, cada ciclo tem seu preço próprio, o que dificulta a aceitação por parte do cliente, sabe-se apenas o valor inicial e não o valor total a ser gasto no projeto completo
	🡺 problemas: 
		• difícil de convencer o cliente a usar esse modelo
		• necessário um nível considerável de especialização na avaliação de risco, o sucesso desse modelo depende disso.
		• caso um risco importante não seja descoberto e administrado, ocorrerão graves problemas no projeto

![espiral](https://github.com/vanessacezarn/3_Semestre/blob/c55bce3ad1ed50bbd93838ee9d4d5044593e5839/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/modelo%20espiral.png)

## MODELO CONCORRENTE
     
      🡺 também denominado engenharia concorrente
      🡺 possibilita representar elementos concorrentes e iterativos de qualquer um dos modelos acima
      🡺 exemplo:
            • modelagem definida para o modelo espiral é realizada invocando uma ou mais das seguintes ações de engenharia de software: prototipagem, análise de dados e projeto.
      🡺 imagem abaixo - modelagem utilizando uma abordagem de modelagem concorrente:


# MODELOS DE PROCESSO ESPECIALIZADOS

      🡺 esses modelos levam em conta muitas das características de um ou mais dos modelos tradicionais

## DESENVOLVIMENTO BASEADO EM COMPONENTES

      🡺 tem muitas características do modelo espiral
      🡺 por sua natureza é evolucionário - demanda uma abordagem iterativa para a criação de software
      🡺 desenvolve aplicações a partir de componentes de software pré-empacotados.

## MODELO DE MÉTODOS FORMAIS

      🡺 engloba um conjunto de atividades que conduzem à especificação matemática formal do software
      🡺 possibilita especificar, desenvolver e verificar um sistema baseado em computador através da aplicação de uma notação matemática rigorosa


## DESENVOLVIMENTO DE SOFTWARE ORIENTADO A ASPECTOS - AOSD 

      🡺 conhecido como programação orientada a aspectos - AOP
      🡺 é um paradigma de engenharia de software, abordagem metodológica e de processos para definir, especificar, projetar e construir aspectos
      🡺 “mecanismos além das sub-rotinas e herança para localizar a expressão de uma restrição cruzada”
      ** restrições cruzada = restrições que cruzam múltiplas funções, recursos e informações do sistema

# PROCESSO UNIFICADO

      🡺tentativa de aproveitar os melhores recursos e características dos modelos tradicionais, mas caracterizando-os de modo a implementar muitos dos melhores princípios desenvolvimento ágil de software.

![processo_unificado](https://github.com/vanessacezarn/3_Semestre/blob/c55bce3ad1ed50bbd93838ee9d4d5044593e5839/Engenharia%20e%20Requisitos%20de%20Software/imagens/aula_03/processo%20unificado.png)









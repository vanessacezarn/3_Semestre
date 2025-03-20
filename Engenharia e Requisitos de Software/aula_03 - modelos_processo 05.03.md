                                  # MODELOS DE PROCESSO 
Processo: COMUNICAÇÃO --> PLANEJAMENTO --> MODULAGEM --> CONSTRUÇÃO --> EMEPREGO

engenharia --> processo de fazer algo
processo de software--> seguir uma serie de passos --> comunicação, planejamento,modulagem,construção,emprego
artefato = tudo que consegue colocar em um documento textual, codigos, dados produzidos,...
fluxo de processo: linear, uma etapa depois da outra 
fluxo de processo iterativo: é possivel ir e voltar de uma etapa para a outra : comunicação <--> planejamento -->modelagem -->construção ---> entrega
                                                                                    ^                  ^  ^                       ^
                                                                                    |                  |  |                       |   
                                                                                    | ---------------- |  |-----------------------
fluxo de processo evolucionario: executa as atividades de forma circular, cada vez que as 5 atividade são completas o software passa a ter uma versão mais completa
fluxo de processo paralelo: pode executar mais de uma atividade ao mesmo tempo 

MODELOS DE PROCESSO PRESCRITIVOS - TRADICIONAIS
--> Modelo CASCATA: abordagem sequencial e sistemática, só é possivel passar para a proxima etapa depois de concluir anterior, 3 etapas iniciais demandam mais tempo
vantagens: tudo muito organizado
desvantagens: não são realizados muitos teste no processo, apenas nas etapas finais(construção): imagem no slide
--> Modelo V: Garantia de qualidade, cada etapa do processo tem testes (validação para ver se o que está sendo feito esta de acordo com o pedido do cliente)
     -> VALIDAÇÃO: "segundo lado v, de baixo para cima", teste de aceitação(ultimo teste), o cliente verifica se o software está de acordo com o pedido, teste do sistema,testa se todo o sistema está funcionando de forma correta, teste de integração,verificar se todas as partes do sistema funcionam e integarem entre si, teste de unidades,,verifica se a parte que foi desenvolvida está funcionando de forma correta
      -> VERIFICAÇÃO: "primeiro lado do v, de cima para baixo" -> verifica se a equipe segue o padrão escolhido, codigo devidamente comentado, para o desenvolvimento do software
  --> demora muito mais tempo para ser desenvolvido,devido a grande quantidade de teste, entratanto a quantia de problemas é bem menor, ou seja, possui uma melhor qualidade, modelo linear, 
*PROBLEMAS: projetos reais não seguem o fluxo sequencial que o modelo porpõe, nem sempre o cliente deixa claro tudo que necessita na primeira etapa do processo, comunicação, o que pode prejudicar as etapas seguintes

--> MODELO DE PROCESSO INCREMENTAL : reduz o tempo de entrega, as tarefas são DIVIDIDAS em pequenas partes, incrementos.
         mini cascatas, cada modulo do sistema passa por todo o processo de desnvolvimento para poder ser entregue ao cliente
         software é entregue em partes: exemplo, entrega o software de cadastros de clientes, software de recursos finaceiros, administração de funcionarios,..., o que ao entregar todas as partes forma-se o software completo solicitado pelo cliente
         o cliente passa a ter contato em um menor tempo com partes do software que já estão utilizaveis. 

-->MODELOS DE PROCESSO EVOLUCIONÁRIO: fazem circulos de entrega, possibilidando o desnvolvimento de versões cada vez mais completas de software
          *PROTOTIPAÇÃO: planejada rapidamente e ocorre a modelagem em forma de um projeto rápido, representação de aspectos do software que serão visiveis ao usuario final,PROTÓTIPO, o que ao ser mostrado ao cliente pode-se definir mudanças, solicitar novas funções, ou seja, o cliente vai avaliando se é isso mesmo que deseja durante o processo de desenvolvimento do software
                        - problema: nao é desenvolvida pensando no todo o projeto, não é um processo muito organizado, codigo acaba ficando muito bagunçado e grande o que dificulta a manutenções futuras, isso ocorre devido a rapidez/pressa com que ele foi desenvolvido

--> MODELO DE PROCESSO ESPIRAL : modelo evolucionario, fusão do modelo incremental com a prototipação.
          - sabe o projeto final, mas ainda é feito e entregue por parte, a cada novo incremento, volta na espiral - imagem slide,  é entregue parte do projeto ao cliente,
          - na etapa de planejamento: ANÁLISE DE RISCO - verifica-se se é possivel seguir com o projeto, se ainda tem o desenvolvedor, pagamento, caso de moeda estrangeira desvalorizar
          - as 5 etapas em estão em circulos 
          - apesar de saber todo o projeto, cada ciclo tem seu preço própio, o que dificulta a aceitação por parte do cliente, sabe-se apenas o valor inicial e não o valor total a ser gasto no projeto completo














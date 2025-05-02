# revisão Estrutura de dados
    youtube - alezandre Zamberlan video de listas https://www.youtube.com/watch?v=zbqMFNnh1Kc 
    - ABSTRATAS
        • LINEARES
          - lista
          - dicionario
          - pilha
          - fila
        • OPERAÇÕES CLÁSSICAS DAS ED lineares
          - add(Add, append) | push, Push (pilha) | offer, Enqueue (fila)
          - remove (Remove, remove) | pop, Pop (pilha) | poll, Dequeeu (filha)
          - contains (Contains, in)
          - isEmpty (Empty, empty)
          - size(Count, len)
          - pilha/filha -> peek
        • Ed lineares em java, c#, e python são baseadas na teoria da teoria da orientação a objetos
            ◘ terceirização de serviços
                - há objetos e classes que atendem serviços solicitados
        • Contudo, há implementação dessas estruturas sem se basear na orientação a objetos
           ◘ são implementados procedais, geralmente em C para atender necessidades em dispositivos ou recursos computacionais com baixo reccurso (processador, memória,...)
             - possibilidade de trabalhar com estrutura de dados e suas operações via programação
                 ◘ criar a estrutura de dados usando struct em C
                     - inserir
                     - remover
                     - estaContido
                     - estaVzio
                     - tamanho
                ◘ alocação dinâmica de memoria
                  - solicitar (SO) e usar memória em tempo de excecução
                      - malloc -solicitar
                      - free - liberar

  # RECURSÃO  https://www.youtube.com/watch?v=5WAulVX_a0M
    • é uma tecnica de programação que substitui os laços/loop tradicionais - for, while, do..while
    • tecnica baseada em empilhamento do mesmo processo
      - o mesmo método fica se chamando de forma recursiva
  ◘ Estrtura básica de uma repetição:
    1) inicialização da variavel de controle da repetição
    2) teste de parada via variável de controle
    3) transformação da variávelde controle - incrementar, decrementar, modificar
  ◘ Tipos de recursão
    - recursão sem retorno --> via métodos void

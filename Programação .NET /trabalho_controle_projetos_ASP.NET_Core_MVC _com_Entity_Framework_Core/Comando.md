# Trabalho final
* Desenvolver uma aplicação ASP.NET Core MVC com Entity Framework Core, aplicando os conceitos apresentados ao longo da disciplina. O foco principal é demonstrar a capacidade de construir uma aplicação web completa com as seguintes características:
  * Estruturação da aplicação no padrão MVC;
  * Persistência de dados com Entity Framework Core;
  * Implementação de um relacionamento um para muitos (1:N);
* Utilização das boas práticas de organização de código e navegação entre telas.

# Tema da aplicação
* Você deverá implementar um sistema de controle de Projetos e suas respectivas Tarefas.
* No sistema, um Projeto poderá ter várias Tarefas associadas a ele. Cada Tarefa, por sua vez, estará sempre vinculada a um único Projeto.
* A aplicação deverá permitir:
  * Cadastro, listagem, edição e exclusão de Projetos;
  * Cadastro, listagem, edição e exclusão de Tarefas vinculadas a cada Projeto;
  * Exibição, ao visualizar os detalhes de um Projeto, de todas as Tarefas associadas a ele.

# Modelagem
* Você deverá criar duas entidades:
  * Projeto, contendo informações como um identificador, nome do projeto, cliente, data de início e data de término (opcional);
  * Tarefa, contendo um identificador, título, descrição, status da tarefa e a referência ao projeto ao qual está vinculada.

* O relacionamento entre as entidades deverá ser implementado corretamente, de forma que um Projeto possa conter múltiplas Tarefas.

# Requisitos
* A aplicação deve obrigatoriamente utilizar ASP.NET Core MVC e Entity Framework Core, conforme demonstrado em aula;
* O relacionamento entre Projeto e Tarefa deve estar devidamente implementado e funcional;
* A navegação entre as telas deve ser clara e permitir que o usuário cadastre e visualize as Tarefas de cada Projeto;
* Não é permitido o uso de bibliotecas ou frameworks externos não apresentados durante a disciplina;
* Toda a aplicação deve ser implementada com base nos conteúdos e exemplos abordados em aula e no material disponibilizado.

# Entrega
* O projeto completo deve ser disponibilizado em um repositório no GitHub ou enviado zipado aqui nesta atividade;
* O link do repositório deverá ser enviado até 27/06/2025;
* O aluno deverá obrigatoriamente apresentar e explicar o projeto em aula, demonstrando pleno entendimento da implementação realizada.
* Observação:
  * Não será permitido o uso de ferramentas de geração automática de código (como ChatGPT, GitHub Copilot ou similares). A atividade tem caráter avaliativo e será utilizada para verificação de aprendizado.

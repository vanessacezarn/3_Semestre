# ASP.NET CORE MVC
* estrutura específica dentro do ASP.NET Core que segue o padrão de arquitetura MVC.
* É projetado especificamente para o desenvolvimento de aplicativos web que seguem o padrão MVC.
* Fornece componentes específicos para Model, View e Controller, facilitando a organização e manutenção do código.
* Padrão MVC (Model-View-Controller):
  * é um padrão de arquitetura de software amplamente utilizado para desenvolvimento de aplicativos web.
  * Ele divide uma aplicação em três componentes principais: Model, View e Controller, cada um com responsabilidades distintas. 
### MODEL
* representa a estrutura de dados do aplicativo.
* responsável pela lógica de negócios e pela interação com o banco de dados.
* Em ASP.NET Core, um modelo pode ser uma classe simples que representa uma entidade de banco de dados.

### VIEW
* responsável pela apresentação da interface do usuário.
* exibe os dados do modelo aos usuários e também recebe entradas do usuário.
* Em ASP.NET Core, as visualizações são criadas usando o mecanismo de marcação Razor, que combina HTML com código C#.

### CONTROLLER
* responsável por manipular as solicitações do cliente, interagir com os modelos e selecionar as visualizações apropriadas para retornar ao navegador do cliente.
* Em ASP.NET Core, os controladores são classes que herdam da classe Controller.
* Cada ação do controlador corresponde a uma solicitação HTTP.

### MVC
*  O padrão MVC separa a aplicação em três componentes principais, cada um com responsabilidades distintas:
    * Model: Representa a estrutura de dados e a lógica de negócios.
    * View: Responsável pela apresentação da interface do usuário.
    * Controller: Responsável por manipular as solicitações do cliente e coordenar as interações entre o modelo e a visualização.
* Ao utilizar o padrão MVC em ASP.NET Core, pode-se criar aplicativos web de forma organizada e escalável, mantendo uma separação clara entre a lógica de negócios, a apresentação e  controle de fluxo. Isso facilita a manutenção do código e o desenvolvimento de novos recursos

# ENCAPSULAMENTO
   	• Prática de ocultar o estado interno de um objeto e permitir o acesso a esse estado apenas por meio de métodos e propriedades específicas.
		 • mecanismo de controle sobre como os dados de um objeto são acessados e modificados --> código mais organizado, seguro e manutenível
		 • fornecer um nível de abstração que separa a implementação interna de uma classe da sua interface pública
		 • ajuda a proteger os dados de uma classe,permitindo a aplicação de lógica de validação e restrições ao acesso aos campos internos
		 • em C# encapsulamento envolve :
			 - modificadores de acesso
			 - campos (fields)
			 - propiedades (properties)
    
## Modificadores de acesso
	• ajuda a restringir o acesso direto a campos e métodos internos de classes
	• private (-)
		- mais restritivo em termos de visibilidade.
		- membros privados só podem ser acessados dentro da própia classe onde foram declarados.
		- principal objetivo: ocultar os detalhes de implementação interna da classe e garantir que os dados sejam protegidos contra acesso direto de fora da classe.
	• public (+)
		- mais permissivo em termos de visibilidade.
		- membros podem ser acessados de qualquer lugar do código.
		- amplamente visíveis e podem ser usados por qualquer parte do código que tenha acesso à classe que os contém.
	• protected (#) 
		- a classe em que foi decladara e as classes derivadas dela podem acessar e modificar o membro
		- usado para fornecer acesso controlado aos membros para classes derivadas, mas ainda assim mante-lo oculto para as demais
	• internal
		- limita o acesso a membros para classes dentro do mesmo assembly (conjunto de arquivos compilados)
		- membros declarados como internos não podem ser acessados por classes em assemblies externos.
		- do para fornecer um nível intermediário de visibilidade, permitindo que membros sejam usados em um conjunto de classes relacionadas no mesmo assembly
  
## Diagrama de classes
	• atributos
		<acesso> <nome> : <tipo>
	• métodos
		<acesso> <nome> (<parametros>) : <tipo>
	• <acesso> = simbologia dos modificadores de acesso

![image](https://github.com/user-attachments/assets/091a4d90-1296-41ad-a61b-44fa749576e7)


## Campos - fields
	• variáveis de instância privadas que armazenam o estado interno de uma classe
	• Ao encapsular esses campos com propriedades, você controla como os valores são lidos e gravados, garantindo que a integridade dos dados seja mantida.
## Propriedades - properties
	• As propriedades são membros de classe que servem como interfaces para acessar e modificar campos (ou variáveis de instância) privados. 
	• são um recurso da linguagem que permite encapsular um campo privado dentro de uma classe ou estrutura e expor esse campo de forma segura ao mundo externo.
	• Elas geralmente consistem em um getter para recuperar o valor de um campo e, opcionalmente, um setter para modificar o valor. 
	• Propriedades permitem a validação e a lógica personalizada ao acessar e definir valores
	• vantagens:
		- Encapsulamento: Você pode controlar como um valor é definido ou retornado (por exemplo, adicionando validação).
		- Simplicidade: As propriedades permitem que campos privados sejam acessados como se fossem públicos, mas com controle adicional. 
		- Interoperabilidade: Propriedades são importantes para tecnologias como data binding em frameworks de interface gráfica.

## Get e Set
	• métodos especiais usados para acessar e modificar os valores de campos privados de uma classe. 
	• parte fundamental do conceito de propriedades (properties) e são comumente usados para garantir o encapsulamento e o controle do acesso aos dados.

### GETTER - Acessor
	• permite recuperar/obter o valor de um campo privado
	• geralmente é associado a uma propiedade e é definido com a palavra-chave get
	• não tem parâmetros
	• retorna o valor do campo privado correspondente
	
```.java
namespace encapsulamento
{
    internal class Produto
    {
        private string _nome;
        
        public string Nome {
            get
            {
                return _nome;
            }
        }
    }
}
```

### SETTER - Modificador
	• permite modificar (definir) o valor de um campo privado. 
	• definido com a palavra-chave set 
	• deve ter um parâmetro que especifica o novo valor que se deseja atribuir ao campo. 
	• Os setters permitem aplicar validações, lógica personalizada ou regras de negócios ao definir valores em campos privados, garantindo a integridade dos dados.

```.java
namespace encapsulamento
{
    internal class Produto
    {
        private string _nome;
        
        public string Nome {
        set
            {
                _nome = value;
            }
        }
    }
}
```

	• pode-se adicionar validação no método set para garantir que os dados sejam sempre válidos
		- exemplo: não permitir nomes vazios ou nulos

```.java
namespace encapsulamento
{
    internal class Produto
    {
        private string _nome;
        
        public string Nome {
        set
        {
		    if((string.IsNullOrEmpty(value))
			{
			    throw new Exception("nome não pode ser vazio");
			}
			else {
			    _nome = value;
			}
            
        }
    }
}
```

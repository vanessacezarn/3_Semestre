# ORIENTAÇÃO A OBJETOS (OO)

   	➤ CLASSE:
	➜ estrutura que abstrai um conjunto de objetos com características similares.
     	➜ define o comportamento dos objetos através de métodos e atributos
           	• métodos = FUNÇÕES na linguagem estruturada ➝ comportamento 
        	• atributo = VARIÁVEIS na linguagem estruturada ➝ define as características do objeto
   	➜a classe descreve as características e funcionalidades dos objetos
    
  	➤ Linguagem UML : padrão para modelagem de sistemas, linguagem universal
   	ORM = mapeamento objeto relacional

  	➤ OBJETO
       		➜ é uma instância da classe 		** como se fosse um struct?? 
	     	➜ é possível ter vários objetos a partir de uma classe
       
  	➤ ESTADO de um objeto é representado por seus atributos
   
  	➤ COMPORTAMENTO é representando pelos seus métodos
      		exemplo: classe carro
               		objeto gol 
             	  • atributos: modelo, ano, cor, estado
             	  • métodos: ligar e desligar
	
  	➤ ENCAPSULAMENTO = é o empacotamento dos atributos e métodos numa classe 
          	➜ proteção de dados: • público (+);    • privado(-)   • protegido(#)
   
**➤ em resumo:**

	• classe = representa um conjunto de objetos
	• subclasse = classe filha que herda os atributos e os métodos da classe mãe (Herança)
	• objeto = instância de uma classe
	• atributo = características do objeto
	• método = funcionalidade do objeto


# ➤ primeira classe em java -codigo slide/aula

```.java
public class Pessoa{
		public String nome;
		public int idade;
	}
```
	• nome da classe = Pessoa
	• nome do arquivo = Pessoa.java
	• classe não pode ter um nome diferente do arquivo
	• não tem métodos, tem apenas atributos (nome e idade)
	• como não tem main não é possível executar.

	➜Instanciando a classe pessoa

```.java
public class Principal{
		public static void main(String[]args){
			Pessoa p = new Pessoa();
			System.out.println("a pessoa foi instanciada")
		}
	}
```
	
	• instanciar = criar um objeto
	• objeto criado = p
	
	➜ após instanciar a classe Pessoa - obter os valores dos atributos
		•System.out.println("O nome da pessoa é :"+p.nome);
		•System.out.println("Idade: "+p.idade);

    ➤ Criando objetos (instanciando classes) e somente depois definindo valores aos atributos.
	              public class Pessoa{
		                  public String nome;
		                  public int idade;
	                }

	            public class Principal{
		              public static void main(String [] args){
			              Pessoa p1 = new Pessoa();
			              p1.nome = "João";
			              Pessoa p2 = new Pessoa ();
			              p2.nome = "Maria";
			              System.out.println("o nome da pessoa 1 é:"+p1.nome);
			              System.out.println("o nome da pessoa 2 é:"+p2.nome);
              }
          	}  










# ARQUIVOS 
* a manipulação de arquivos se dá através de algumas classes existentes dentro da biblioteca java.io
    * FileWriter
    * BufferedWriter
    * FileReader
    * BufferedReader
* primeiro escreve no buffererWriter para não precisar ficar sempre abrindo o arquivo txt por isso usa
* padrão na escrita de dados --> ; ou , --> para quando for ler o arquivo ou usar o split saber onde estam cada um dos dados
* escritor.close -> encerra o buffer e manda para o file
* arquivo.close --> encerra o file e salva o arquivo
### Classe FileWriter
* escrever caracteres em um arquivo
* é uma classe especializada que deriva da classe abstrata Writer
* ao criar uma instância do FileWriter, você precisa fornecer o caminho do arquivo que deseja escrever
* permite gravar dados de caracteres diretamente em um arquivo, substituindo conteúdo existente,, se houver
### Classe BufferedWriter
* escrever grande quantidade de dados de caracteres em um fluxo de saida com melhor desempenho
* escreve os dados em um buffer interno antes de gravalos fisicamente no dispositivo interno de armazenamento --> MELHORA o desesempenho
* também é derivada da classe abstrata Writer
* minimiza o número de operações de gravação física, tornando a gravação mais eficiente
### Classe FileReader
* ler caracteres de um arquivo
* é uma classe especializada que deriva da classe abstrata Reader
* precisa fornecer o caminho do arquivo que deseja ler
* permite ler os caracteres do arquivo de forma sequencial
### Classe BufferedReader
* usada para ler grande quantidade de caracteres de um fluxo de entrada com melhor desempenho
* também é uma classe derivada da classe abstrata Reader
* melhora o desempenho lendo os dados de um buffer interno antes de retorná-lo ao chamador
* minimiza o numero de operações de leitura física, tornando a leitura mais eficiente

## exemplo 1
**aluno**
```java
package exemplo1;
public class Aluno {
	private String nome;
	private int idade;
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
}

```
**principal**
``` java
package exemplo1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Vanessa",22);
		Aluno a2 = new Aluno("João",20);
		Aluno a3 = new Aluno("Maria",19);
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\laboratorio\\eclipse-workspace\\arquivos\\src\\exemplo1\\alunos.txt", true);
			//true para não sobreescrever o que ja tem no arquivo --> dessa forma ele sempre adiciona os novos dados no final do arquivo um append
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			escritor.write(a1.getNome()+","+a1.getIdade());
			escritor.newLine();
			escritor.write(a2.getNome()+","+a2.getIdade());
			escritor.newLine();
			escritor.write(a3.getNome()+","+a3.getIdade());
			escritor.newLine();
			escritor.close();
			arquivo.close();
			System.out.println("Alunos salvos com sucesso no arquivo .txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

```
**Principal 2**
```.java
package exemplo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Principal2 {
	public static void main(String[] args) {
		try {
			FileReader arquivo = new FileReader("C:\\Users\\laboratorio\\eclipse-workspace\\arquivos\\src\\exemplo1\\alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Alunos lidos no arquivo");
			String linha;
			while((linha = leitor.readLine()) != null ) {
				String [] campo = linha.split(",");
				
				String nome = campo[0];
				int idade = Integer.parseInt(campo[1]);
				Aluno a = new Aluno(nome,idade);
				System.out.println("Nome: "+a.getNome() + ", idade: "+a.getIdade());
			}
			leitor.close();
			arquivo.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

```
# SERIALIAÇÃO
* é o processo de converter um objeto em fluxo de bytes para armazenar o objeto ou transmiti-lo para a memória, um banco de dados ou um arquivo
* finalidade --> salvar o estado de um objeto para recriá-lo quando necessário
* o processo inverso é chamado de desserialização
* o objeto é serealizado para um fluxo que carrega os dados
* o fluxo também pode ter informações sobre o tipo do objeto, como sua versão, cultura e nome do assembly
* desse fluxo, o objeto pode ser armazenado em um banco de dados, um arquivo ou memória
* o processo de serialização é independente da aplicação, um dado serializado em uma plataforma deve poder ser deserializada por qualquer outra


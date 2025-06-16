# ARQUIVOS 
* biblioteca java.io
    * FileWriter
    * BufferedWriter
    * FileReader
    * BufferedReader
* primeiro escreve no buffererWriter para não precisar ficar sempre abrindo o arquivo txt por isso usa
* padrão na escrita de dados --> ; ou , --> para quando for ler o arquivo ou usar o split saber onde estam cada um dos dados
* escritor.close -> encerra o buffer e manda para o file
* arquivo.close --> encerra o file e salva o arquivo
### FileWriter
* escrever caracteres em um arquivo
* é uma classe especializada que deriva da classe abstrata Writer
### BufferedWriter
* escrever grande quantidade de dados de caracteres em um fluxo de saida com melhor desempenho
* escreve os dados em um buffer interno antes de gravalos fisicamente no dispositivo interno de armazenamento
### FileReader
* ler caracteres de um arquivo precisa fornecer o caminho do arquivo
### BufferedReader
* grnade quantidade de caracteres de um fluxo de entrada com melhor desempenho
* melhora o desempenho lendo os dados de um buffer interno

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
``` .java
package serializacaoJson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("vanessa",22);
		
		JSONObject json = new JSONObject();
		json.put("nome",p.getNome());
		json.put("idade",p.getIdade());
		String jsonString =  json.toJSONString();
		
		gravaArquivo(jsonString);
		
		try {
			lerArquivo();
		}catch(org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void gravaArquivo(String jsonString) {
		try(FileWriter fileWriter = new FileWriter("pessoa.json")) {
			fileWriter.write(jsonString);
			System.out.println("Arquivo person.json salvo com sucesso");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() throws org.json.simple.parser.ParseException  {
		try(FileReader fileReader = new FileReader("pessoa.json")) {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
			// CRIANDO UM OBJETO PERSON A PARTIR DO JSON
					
			String nome = (String) jsonObject.get("nome");
			long idade = (long) jsonObject.get("idade");
			
			Pessoa deserializedPerson = new Pessoa(nome, (int)idade);
			System.out.println("OBJETO desserializado: "+deserializedPerson);

			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

``` 

package SerializacaoJSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("RICARDO",30);
		
		JSONObject json = new JSONObject();
		json.put("nome",p.getNome());
		json.put("idade",p.getIdade());
		String jsonString = json.toJSONString();
		
		gravaArquivo(jsonString);
		
		try {
			lerArquivo();
		}catch(org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void gravaArquivo(String jsonString) {
		try (FileWriter fileWriter = new FileWriter("pessoa.json")){
			fileWriter.write(jsonString);
			System.out.println("Arquivo person.json salvo com sucesso");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() throws org.json.simple.parser.ParseException {
	
		try(FileReader fileReader = new FileReader("pessoa.json")){
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
			String nome = (String) jsonObject.get("nome");
			long idade = (long) jsonObject.get("idade");
			
			Pessoa deserializedPerson = new Pessoa(nome,(int) idade);
			
			System.out.println("Objeto desserializado: "+deserializedPerson);			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}

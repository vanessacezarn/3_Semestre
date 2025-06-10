package arquivo;

import java.util.ArrayList;
import java.util.List;

import exemplo1.Aluno;

public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Vanessa",22);
		Aluno a2 = new Aluno("João",20);
		Aluno a3 = new Aluno("Maria",19);
		
		List<Aluno> lista = new ArrayList<>();
		Arquivo arquivo = new Arquivo("teste");
		arquivo.gravaArquivo(a1);
		arquivo.gravaArquivo(a2);
		arquivo.gravaArquivo(a3);
		
		lista = arquivo.leArquivo();
		for(Aluno a : lista) {
			System.out.println("Nome: "+a.getNome() + ", idade: "+a.getIdade());

		}

	}

}

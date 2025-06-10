package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exemplo1.Aluno;

public class Arquivo {
	
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Aluno> listAluno;
	public String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listAluno = new ArrayList<>();
	}
	
	public void gravaArquivo(Aluno a) {
		try {
			arqw = new FileWriter (nomeArquivo+".txt",true);
			escritor = new BufferedWriter(arqw);
			escritor.write(a.getNome()+";"+a.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			System.out.println("Arquivos salvos com sucesso no .txt");
					
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List <Aluno> leArquivo(){
		System.out.println("alunos lidos do arquivo");
		try {
			arqr = new FileReader(nomeArquivo+".txt");
			leitor = new BufferedReader(arqr);
			String linha;
			while((linha = leitor.readLine())!=null) {
				String[]campo = linha.split(";");
				String nome = campo[0];
				int idade = Integer.parseInt(campo[1]);
				Aluno aluno = new Aluno(nome,idade);
				listAluno.add(aluno);
			}
			leitor.close();
			arqr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return listAluno;
	}




}

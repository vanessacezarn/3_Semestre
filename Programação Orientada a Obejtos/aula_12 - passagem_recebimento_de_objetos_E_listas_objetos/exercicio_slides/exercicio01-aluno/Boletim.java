 package exercicio01;

public class Boletim {
	
	public void imprimirStatus(Aluno a) {
		if(a.getNotaFinal()>=6) {
			System.out.println("aprovado");

		}else {
			System.out.println("reprovado");

		}
	}

	
	
}

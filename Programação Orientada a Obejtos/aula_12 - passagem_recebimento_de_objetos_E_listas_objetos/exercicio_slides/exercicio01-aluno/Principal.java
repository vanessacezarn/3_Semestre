package exercicio01;

public class Principal {

	public static void main(String[] args) {

		Aluno a = new Aluno("Vanessa",8,new Boletim());
		System.out.println("nome: "+a.getNome());
		a.getBoletim().imprimirStatus(a);
		
		Aluno a2 = new Aluno("Amanda",5.5,new Boletim());
		System.out.println("nome: "+a2.getNome());
		a.getBoletim().imprimirStatus(a2);
		
		
		
	}

}

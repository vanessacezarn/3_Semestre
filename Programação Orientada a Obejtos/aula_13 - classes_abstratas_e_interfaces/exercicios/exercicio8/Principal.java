package exercicio08;

public class Principal {

	public static void main(String[] args) {

		BancoDados bd = new BancoDados();
		bd.conectar();
		bd.inserir();
		bd.atualizar();
		bd.excluir();
		bd.desconectar();
		
	}

}

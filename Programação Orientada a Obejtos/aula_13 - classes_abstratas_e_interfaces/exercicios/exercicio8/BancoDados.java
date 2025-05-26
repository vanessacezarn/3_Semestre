package exercicio08;

public class BancoDados implements AcessoDados {

	@Override
	public void conectar() {
		System.out.println("conectando-se ao banco de dados");
	}

	@Override
	public void desconectar() {
		System.out.println("desconectando-se do banco de dados");
	}

	@Override
	public void inserir() {
		System.out.println("inserindo dados no banco de dados");
		
	}

	@Override
	public void atualizar() {
		System.out.println("atualizando dados no banco de dados");
		
	}

	@Override
	public void excluir() {
		System.out.println("excluindo dados do banco de dados");
		
	}

}

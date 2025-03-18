package pkg3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		
		calc.n1 = 7.14;
		calc.n2 = 8.23;
		
		double retorno;
		retorno=calc.somar();
		System.out.println("Resultado da soma: "+retorno);
		
		//System.out.println("Resultado da soma: "+calc.somar()); - OUTRA FORMA DE EXIBIR O RESULTADO
		
		calc.multiplicar();
		
		calc.divisao(4.17, 5.43);
		
		retorno = calc.subtracao(5.44, 2.17);
		System.out.println("Subtração: "+retorno);
		//System.out.println("Resultado da subtração: "+calc.subtracao(5.44, 2.17));


		
	}

}

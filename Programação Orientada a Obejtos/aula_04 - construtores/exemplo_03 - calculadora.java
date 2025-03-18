package pkg3;

public class Calculadora {
	public double n1;
	public double n2;

	public double somar() { //retorna double
		double resultado;
		resultado = n1+n2;
		return resultado;
		//return (n1+n2)
	}
	
	public void multiplicar() {
		double resultado;
		resultado = n1*n2;
		System.out.println("Multiplicação = "+resultado);
	}
	
	public void divisao(double num1, double num2) {
		double resultado;
		resultado = num1 /num2;
		System.out.println("divisão = "+resultado);
	}
	
	public double subtracao(double num1, double num2) {
		double resultado;
		resultado = num1 - num2;
        return resultado;
		}
}

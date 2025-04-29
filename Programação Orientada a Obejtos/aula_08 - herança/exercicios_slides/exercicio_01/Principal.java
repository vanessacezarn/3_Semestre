/*Crie uma classe Figura com os seguintes atributos: cor e preenchido. Em seguida, crie uma classe Retangulo
 que herda de Figurae adiciona dois atributos: largura e altura. Crie um método na classe Retangulo chamado 
 calcularArea() que retorna a área do retângulo (altura * largura).*/

package exercicio1;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo("azul","semipreenchido",2.5,2);
		
		double area = r.calcularArea();
		System.out.println("cor: "+r.cor+" \npreenchimento: " +r.preenchido+"\naltura: "+ r.altura +" \nlargura: "+r.largura+"\narea: "+area);
	} 

}

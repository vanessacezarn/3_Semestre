
package exercicio1;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		r.cor="azul";
		r.preenchido="sonte a lateral";
		r.altura=5.5;
		r.largura=5;
		double area = r.calcularArea();
		System.out.println("altura: "+ r.altura +" \nlargura "+r.largura+" \ncor  "+r.cor+" \npreenchimento " +r.preenchido+"\narea "+area);
	} 

}

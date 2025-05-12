/*Crie uma classe Pessoa com atributos nome, idade e sexo. Crie uma lista de pessoas e adicione algumas pessoas
 *  nessa lista. Em seguida, crie um método que recebe uma lista de pessoas e retorna a quantidade de mulheres.
 *   Por fim, chame esse método passando a lista de pessoas e imprima a quantidade de mulheres.
*/
package exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static int contaMulheres(List<Pessoa> listaPessoa) {
		int m=0;
		for(Pessoa pe : listaPessoa) {
			if(pe.sexo == "F") {
				m++;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {

		List<Pessoa> listaPessoa = new ArrayList<>();
		Pessoa p = new Pessoa("Vanessa",22,"F");
		listaPessoa.add(p);
		
		Pessoa p2 = new Pessoa("Luiza",20,"F");
		listaPessoa.add(p2);
		Pessoa p3 = new Pessoa("Guilherme",20,"M");
		listaPessoa.add(p3);
		Pessoa p4 = new Pessoa("Thiago",25,"M");
		listaPessoa.add(p4);
		Pessoa p5 = new Pessoa("Amanda",2,"F");
		listaPessoa.add(p5);
		
		int mulheres = contaMulheres(listaPessoa);
		
		System.out.println("na lista há "+mulheres+ " mulheres");
		
		
	}
	
	

}

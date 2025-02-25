package vetor;
import java.util.Scanner;
public class VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vetor = new int [5];
		Scanner teclado= new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			System.out.print("Digite o elemento"+i+":");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.print("ELEMENTO "+i+": ");
			System.out.println(vetor[i]);
		}

	}

}

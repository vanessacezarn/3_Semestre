// 2 - Escreva um programa Java que use uma matriz para ler os valores de uma tabela de multiplicação (tabuada) de 10x10 e depois a imprima na tela.
package vetor_matriz_ex02;

public class Ex2 {
	
    public static void main(String[] args) {
    	
        int[][] tabuada = new int[10][10];
        int i,j;
        
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                tabuada[i][j] = (i+1) * (j+1);
            }
        }
        for (i = 0;i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.printf("%4d", tabuada[i][j]); //PARA FORMATAR A TABELA

            }
            System.out.println();
        }
        
    }
}

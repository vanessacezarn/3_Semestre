package matriz;

public class Matrizzzzzzzz {

	public static void main(String[] args) {
		int [][] matriz = new int[3][3];
		matriz[0][0]=1;
		matriz[0][1]=5;
		matriz[0][2]=6;
		matriz[1][0]=8;
		matriz[1][1]=6;
		matriz[1][2]=4;
		matriz[2][0]=6;
		matriz[2][1]=5;
		matriz[2][2]=1;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

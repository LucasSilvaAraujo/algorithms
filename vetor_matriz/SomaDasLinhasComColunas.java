package vetor_matriz;
import java.util.Scanner;

public class SomaDasLinhasComColunas {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[][] matrizM = new int[4][6];
		int[][] matrizN = new int[6][4];
		int somaMatrizes[] = new int[4];
		    
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				
				System.out.print("Digite um número aleatório para a coluna " + (j + 1) + ", linha " + (i + 1) + " da primeira matriz[0 - 9]: ");
				matrizM[i][j] = leitor.nextInt();
				
				if (matrizM[i][j] > 9 || matrizM[i][j] < 0) {
					System.err.println("Número Inválido!");
					j--;
				} 
			}
		}
		    
		for (int i = 0; i < matrizN.length; i++) {
			for (int j = 0; j < matrizN[i].length; j++) {
				
				System.out.print("Digite um número aleatório para a coluna " + (j + 1) + ", linha " + (i + 1) + " da segunda matriz[0 - 9]: ");
				matrizN[i][j] = leitor.nextInt();
				
				if (matrizN[i][j] > 9 || matrizN[i][j] < 0) {
					System.err.println("Número Inválido!");
					j--;
				} 
			}
		}
		    
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				somaMatrizes[i] = somaMatrizes[i] + matrizM[i][j] + matrizN[j][i];
			}
		}
		    
		for (int i = 0; i < 4; i++) {
			System.out.println("A " + (i+1) + "ª soma da linha da MatrizM com a coluna da MatrizN é: " +somaMatrizes[i]);
		} 

		leitor.close();
		
	}
}

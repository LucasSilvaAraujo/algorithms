package vetor_matriz;
import java.util.Scanner;

public class MultiplicaçãoPelaSoma {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[][] matriz = new int[10][5];
		int[] vetor = new int[5];
		int somaTotalVetor = 0;
		    
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("Digite um número aleatório para a coluna " + (j + 1) + ", linha " + (i + 1) + " [0 - 9]: ");
				
				matriz[i][j] = leitor.nextInt();
				if (matriz[i][j] > 9 || matriz[i][j] < 0) {
					System.err.println("Número Inválido!");
					j--;
				} 
			}
		}
		    
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 10; i++) {
				vetor[j] = vetor[j] + matriz[i][j];
			}
		}
		    
		for (int i = 0; i < vetor.length; i++) {
			somaTotalVetor = somaTotalVetor + vetor[i];
		}
		    
		System.out.println("\t--MATRIZ ATUALIZADA--");
		    
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = matriz[i][j] * somaTotalVetor;
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		leitor.close();
		    
	}
}
package vetor_matriz;
import java.util.Scanner;

public class PosiçãoMaiorMenor {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[][] matriz = new int[6][3];
		int maiorNumero = 0;
		int menorNumero = 0;
		int posUm[] = new int[2];
		int[] posDois = new int[2];
    
		for (int i = 0; i < matriz.length; i++) {
		      
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("Digite o número da coluna " + (j + 1) + ", linha " + (i + 1) + ": ");
				matriz[i][j] = leitor.nextInt();

				if (matriz[i][j] > maiorNumero) {
					maiorNumero = matriz[i][j];
					posUm[0] = i;
					posUm[1] = j;
				} 
			}
		}
		    
		menorNumero = maiorNumero;

		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < menorNumero) {
					menorNumero = matriz[i][j];
					posDois[0] = i;
					posDois[1] = j;
				} 
			}
		}
		    
		System.out.println("\nO maior elemento da matriz é " + maiorNumero + " e está na linha " + (posUm[0] + 1) + ", coluna " + (posUm[1] + 1));
		System.out.println("O menor elemento da matriz é " + menorNumero + " e está na linha " + (posDois[0] + 1) + ", coluna " + (posDois[1] + 1));
		    
		leitor.close();
		
	}
}
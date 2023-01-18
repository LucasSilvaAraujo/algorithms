package vetor_matriz;
import java.util.Scanner;

public class InfoSobreImparesEPares {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		  
		int[][] matriz = new int[2][4];
		int imparLinhaUM = 0;
		int imparLinhaDOIS = 0;
		int somaPares = 0;
		double mediaPares = 0;
		int aux = 0;
		    
		for (int i = 0; i < matriz.length; i++) {
		      
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("Digite o número da coluna " + (j + 1) + ", linha " + (i + 1) + ": ");
				matriz[i][j] = leitor.nextInt();
				
				if (matriz[i][j] % 2 != 0 && i == 0) {
					imparLinhaUM = imparLinhaUM + 1;
				}
				else if (matriz[i][j] % 2 != 0 && i == 1) {
					imparLinhaDOIS = imparLinhaDOIS + 1;
				}
				else {
					somaPares = somaPares + matriz[i][j];
					if (matriz[i][j] != 0 )
						aux++;
				}   
			}
		}
		    
		mediaPares = (double) somaPares / aux;
		    
		System.out.println("--QUANTIDADE DE NÚMEROS ÍMPARES--\nLinha 1: " + imparLinhaUM + "\nLinha 2: " + imparLinhaDOIS);
		    
		if (somaPares != 0)
			System.out.println("\nMédia dos elementos pares da matriz: " + mediaPares);
		else
			System.out.println("Não há elementos pares na matriz.");
		    
		leitor.close();
		    
	}
}
package vetor_matriz;
import java.util.Scanner;

public class ElementosEntre3e7 {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		  
		byte[][] matriz = new byte[3][5];
		int quantElementos = 0;
		    
		for (int i = 0; i < matriz.length; i++) {
		      
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("Digite o número da coluna " + (j + 1) + ", linha " + (i + 1) + " [0 – 9]: ");
				matriz[i][j] = leitor.nextByte();
				
				if (matriz[i][j] > 9 || matriz[i][j] < 0) {
					System.err.println("Número Inválido!");
					j--;
				}
				
				else if (matriz[i][j] > 3 && matriz[i][j] < 7) {
					quantElementos = quantElementos + 1;
				} 
			}
		}
		    
		System.out.println("Existem " + quantElementos + " números entre 3 e 7.");
		    
		leitor.close();
		
	}
}
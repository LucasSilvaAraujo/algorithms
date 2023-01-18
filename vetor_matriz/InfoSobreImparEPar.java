package vetor_matriz;
import java.util.Scanner;

public class InfoSobreImparEPar {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] numeros = new int[6];
		int[] numerosPares = new int[6];
		int[] numerosImpares = new int[6];
		int somaPar = 0;
		int quantidadeImpar = 0;
		boolean validar = false;
		    
		for(byte i = 0; i < 6; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = leitor.nextInt();
		}
		    
		System.out.println("RELATÓRIO");
		System.out.println("Os números pares são: ");
		    
		for(byte i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				numerosPares[i] = numeros[i];
				somaPar = somaPar + numerosPares[i];
				validar = true;
				System.out.println("número " + numerosPares[i] + " na posição " + (i + 1));
			}
		}
		    
		if (validar == false)
			System.out.println("Não há números pares!");
		    
		System.out.println("Soma dos pares = " + somaPar);
		System.out.println("\nOs números ímpares são: ");
		    
		for(byte i = 0; i < 6; i++) {
			if (numeros[i] % 2 != 0) {
				numerosImpares[i] = numeros[i];
				quantidadeImpar = quantidadeImpar + 1;
				System.out.println("número " + numerosImpares[i] + " na posição " + (i + 1));
			}
		}
		    
		if (quantidadeImpar == 0)
			System.out.println("Não há números ímpares!");
		      
		System.out.println("Quantidade de ímpares = " + quantidadeImpar);
		    
		leitor.close();
		
	}
}
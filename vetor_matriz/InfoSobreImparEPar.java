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
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
			numeros[i] = leitor.nextInt();
		}
		    
		System.out.println("RELAT�RIO");
		System.out.println("Os n�meros pares s�o: ");
		    
		for(byte i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				numerosPares[i] = numeros[i];
				somaPar = somaPar + numerosPares[i];
				validar = true;
				System.out.println("n�mero " + numerosPares[i] + " na posi��o " + (i + 1));
			}
		}
		    
		if (validar == false)
			System.out.println("N�o h� n�meros pares!");
		    
		System.out.println("Soma dos pares = " + somaPar);
		System.out.println("\nOs n�meros �mpares s�o: ");
		    
		for(byte i = 0; i < 6; i++) {
			if (numeros[i] % 2 != 0) {
				numerosImpares[i] = numeros[i];
				quantidadeImpar = quantidadeImpar + 1;
				System.out.println("n�mero " + numerosImpares[i] + " na posi��o " + (i + 1));
			}
		}
		    
		if (quantidadeImpar == 0)
			System.out.println("N�o h� n�meros �mpares!");
		      
		System.out.println("Quantidade de �mpares = " + quantidadeImpar);
		    
		leitor.close();
		
	}
}
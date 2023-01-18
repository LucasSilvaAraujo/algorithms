package vetor_matriz;
import java.util.Scanner;

public class VetorN�merosPrimos {

	static boolean validarNumPrimo(int numero) {
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] numeros = new int[9];
		    
		for (byte i = 0; i < numeros.length; i++) {
			System.out.print("Digite o n�mero na " + (i + 1) + "� posi��o: ");
			numeros[i] = leitor.nextInt();
		}
		    
		System.out.println("--N�MEROS PRIMOS E SUAS RESPECTIVAS POSI��ES--");
		    
		for (byte i = 0; i < numeros.length; i++) {
			if (validarNumPrimo(numeros[i])) {
				System.out.println((i + 1) + "�: " + numeros[i]);
			}
		}

		leitor.close();
		
	}
}
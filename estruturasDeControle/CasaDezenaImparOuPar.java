package estruturasDeControle;
import java.util.Scanner;

public class CasaDezenaImparOuPar {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		byte numeroCentena = 0;
		byte restoDiv = 0;
		byte verificador = 0;

		do {
			System.out.print("Digite um número com 3 dígitos: ");
			numero = leitor.nextInt();

			if (numero >= 100 && numero <= 999 || numero <= -100 && numero >= -999) {
				numeroCentena = (byte) (numero / 100);
				restoDiv = (byte) (numeroCentena - ((numeroCentena / 2) * 2));
				verificador = 1;
				if (restoDiv == 0)
					System.out.println("O número na casa da centena é par!");
				else
					System.out.println("O número na casa da centena é ímpar!");
			}
			
			else
				System.err.println("Número inválido!");
		
		} while (verificador == 0);
		
		leitor.close();
	}
}
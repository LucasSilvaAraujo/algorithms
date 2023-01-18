package estruturasDeControle;
import java.util.Scanner;

public class VerificarN�meroPrimo {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int num1 = 0;
		byte verificador = 0;
		int restoDIV = 0;
		boolean validar = false;
		    
		do {
			System.out.print("Digite um n�mero maior que 1: ");
			num1 = leitor.nextInt();
		    
			if (num1 > 1) {
				validar = true;
				for (int contador = 1; contador <= num1; contador++) {
					restoDIV = num1 % contador;
					if (restoDIV == 0)
						verificador++;
				}
		        
				if (verificador == 2)
					System.out.println("� n�mero primo.");
				else
					System.out.println("N�o � n�mero primo.");
			}
			
			else
				System.err.println("N�mero inv�lido");
			
		} while (validar == false);

		leitor.close();
		
	}
}
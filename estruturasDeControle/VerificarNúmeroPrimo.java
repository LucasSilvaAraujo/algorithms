package estruturasDeControle;
import java.util.Scanner;

public class VerificarNúmeroPrimo {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int num1 = 0;
		byte verificador = 0;
		int restoDIV = 0;
		boolean validar = false;
		    
		do {
			System.out.print("Digite um número maior que 1: ");
			num1 = leitor.nextInt();
		    
			if (num1 > 1) {
				validar = true;
				for (int contador = 1; contador <= num1; contador++) {
					restoDIV = num1 % contador;
					if (restoDIV == 0)
						verificador++;
				}
		        
				if (verificador == 2)
					System.out.println("É número primo.");
				else
					System.out.println("Não é número primo.");
			}
			
			else
				System.err.println("Número inválido");
			
		} while (validar == false);

		leitor.close();
		
	}
}
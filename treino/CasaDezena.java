package treino;
import java.util.Scanner;

public class CasaDezena {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		byte bbb = 0;

		do {
			System.out.println("Digite um número com 3 dígitos: ");
			n1 = leitor.nextInt();

			if (n1 >= 100 && n1 <= 999 || n1 <= -100 && n1 >= -999) {
				n2 = (n1 % 100) / 10;
				bbb = 1;
				System.out.println("O número das dezenas é: " + n2);
			}
			
			else
				System.out.println("Número inválido!");
			
		} while (bbb == 0);
	
		leitor.close();
	
	}
}
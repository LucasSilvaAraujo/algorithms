package treino;
import java.util.Scanner;

public class CasaDezena {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		byte bbb = 0;

		do {
			System.out.println("Digite um n�mero com 3 d�gitos: ");
			n1 = leitor.nextInt();

			if (n1 >= 100 && n1 <= 999 || n1 <= -100 && n1 >= -999) {
				n2 = (n1 % 100) / 10;
				bbb = 1;
				System.out.println("O n�mero das dezenas �: " + n2);
			}
			
			else
				System.out.println("N�mero inv�lido!");
			
		} while (bbb == 0);
	
		leitor.close();
	
	}
}
package treino;
import java.util.Scanner;

public class CentenasDezenasUnidades {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int res = 0;
		byte bbb = 0;

		do {
			System.out.println("Digite um n�mero de tr�s digitos: ");
			n1 = leitor.nextInt();

			if (n1 >= 100 && n1 <= 999 || n1 <= -100 && n1 >= -999) {
				aux1 = n1 / 100;
				aux2 = (n1 % 100) / 10;
				aux3 = (n1 % 10);
				res = (aux3 * 100 + aux2 * 10 + aux1) * (-1);
				bbb = 1;
				System.out.println("O inverso deste n�mero �: " + res);
			}

			else
				System.out.println("N�mero inv�lido!");

		} while (bbb == 0);

		leitor.close();

	}
}
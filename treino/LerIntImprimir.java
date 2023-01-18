package treino;
import java.util.Scanner;

public class LerIntImprimir {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int numero = 0;

		System.out.println("Digite um número: ");
		numero = leitor.nextInt();

		System.out.println("O número inteiro digitado foi " + numero);
		
		leitor.close();
		
	}
}
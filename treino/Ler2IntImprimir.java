package treino;
import java.util.Scanner;

public class Ler2IntImprimir {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;

		System.out.println("Digite o 1º número: ");
		n1 = leitor.nextInt();

		System.out.println("Digite o 2º número: ");
		n2 = leitor.nextInt();

		System.out.println("Os números inteiros digitados foram " + n1 + " e " + n2);
		
		leitor.close();
		
	}
}
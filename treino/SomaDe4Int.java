package treino;
import java.util.Scanner;

public class SomaDe4Int {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int fim = 0;

		System.out.println("Digite o 1º número: ");
		n1 = leitor.nextInt();

		System.out.println("Digite o 2º número: ");
		n2 = leitor.nextInt();

		System.out.println("Digite o 3º número: ");
		n3 = leitor.nextInt();

		System.out.println("Digite o 4º número: ");
		n4 = leitor.nextInt();

		fim = n1 + n2 + n3 + n4;

		System.out.println("A soma dos 4 números é: " + fim);
		
		leitor.close();
		
	}
}
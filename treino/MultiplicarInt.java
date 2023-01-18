package treino;
import java.util.Scanner;

public class MultiplicarInt {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n1 = 0; 
		int n2 = 0;
		int n3 = 0;

		System.out.println("Digite o 1º número: ");
		n1 = leitor.nextInt();

		System.out.println("Digite o 2º número: ");
		n2 = leitor.nextInt();

		n3 = n1 * n2;

		System.out.println("Resultado: " + n3);
		
		leitor.close();
		
	}
}
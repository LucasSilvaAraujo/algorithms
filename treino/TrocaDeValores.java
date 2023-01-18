package treino;
import java.util.Scanner;

public class TrocaDeValores {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		int aux = 0;

		System.out.println("Digite um número: ");
		n1 = leitor.nextInt();

		aux = n1;

		System.out.println("Digite outro número: ");
		n2 = leitor.nextInt();

		n1 = n2;
		n2 = aux;

		System.out.println("Os números informados são: " + n1 + ", " + n2);
		
		leitor.close();
		
	}
}
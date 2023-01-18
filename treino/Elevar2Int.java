package treino;
import java.util.Scanner;

public class Elevar2Int {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		int aux = 0;

		System.out.println("Digite a base: ");
		n1 = leitor.nextInt();

		aux = n1;

		System.out.println("Digite o expoente: ");
		n2 = leitor.nextInt();

		for(int loop = 1; loop < n2; loop++) { 
			n1 = n1 * aux;    
		}

		System.out.println("A potência de " + aux + " elevado a " + n2 + " é " + n1);
		
		leitor.close();
		
	}
}
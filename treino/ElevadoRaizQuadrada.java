package treino;
import java.util.Scanner;

public class ElevadoRaizQuadrada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		double n1 = 0.0;
		double n2 = 0.0;
		double n3 = 0.0;

		System.out.println("Digite um número: ");
		n1 = leitor.nextDouble();

		n2 = Math.sqrt(n1);
		n3 = n1 * n1;
		    
		System.out.println("A raiz quadrada e a potenciação deste número são respectivamente: " + n2 + " e " + n3);
		
		leitor.close();
		
	}
}
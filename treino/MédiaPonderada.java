package treino;
import java.util.Scanner;

public class M�diaPonderada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		double n1, p1 = 0.0;
		double n2, p2 = 0.0;
		double n3, p3 = 0.0;
		double res = 0.0;

		System.out.println("Digite a 1� nota: ");
		n1 = leitor.nextDouble();

		System.out.println("Digite o peso da 1� nota: ");
		p1 = leitor.nextDouble();
		    
		System.out.println("Digite a 2� nota: ");
		n2 = leitor.nextDouble();

		System.out.println("Digite o peso da 2� nota: ");
		p2 = leitor.nextDouble();

		System.out.println("Digite a 3� nota: ");
		n3 = leitor.nextDouble();

		System.out.println("Digite o peso da 3� nota: ");
		p3 = leitor.nextDouble();

		res = (n1 * p1 + n2 * p2 + n3 * p3) / (1 + 2 + 3);
		    
		System.out.println("A M�dia Ponderada das 3 notas �: " + res);
		
		leitor.close();

	}
}
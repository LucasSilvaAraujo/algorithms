package treino;
import java.util.Scanner;

public class MédiaPonderada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		double n1, p1 = 0.0;
		double n2, p2 = 0.0;
		double n3, p3 = 0.0;
		double res = 0.0;

		System.out.println("Digite a 1ª nota: ");
		n1 = leitor.nextDouble();

		System.out.println("Digite o peso da 1ª nota: ");
		p1 = leitor.nextDouble();
		    
		System.out.println("Digite a 2ª nota: ");
		n2 = leitor.nextDouble();

		System.out.println("Digite o peso da 2ª nota: ");
		p2 = leitor.nextDouble();

		System.out.println("Digite a 3ª nota: ");
		n3 = leitor.nextDouble();

		System.out.println("Digite o peso da 3ª nota: ");
		p3 = leitor.nextDouble();

		res = (n1 * p1 + n2 * p2 + n3 * p3) / (1 + 2 + 3);
		    
		System.out.println("A Média Ponderada das 3 notas é: " + res);
		
		leitor.close();

	}
}
package treino;
import java.util.Scanner;

public class MédiaAritméticaV2 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		double n1 = 0.0;
		double n2 = 0.0;
		double n3 = 0.0;
		double res = 0.0;

		System.out.println("Digite a 1ª nota: ");
		n1 = leitor.nextDouble();
		    
		System.out.println("Digite a 2ª nota: ");
		n2 = leitor.nextDouble();

		System.out.println("Digite a 3ª nota: ");
		n3 = leitor.nextDouble();

		res = (n1 + n2 + n3) / 3.0;
		    
		System.out.println("A Média Aritmética das 3 notas é: " + res);
	
		leitor.close();
	
	}
}
package treino;
import java.util.Scanner;

public class M�diaAritm�ticaV2 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		double n1 = 0.0;
		double n2 = 0.0;
		double n3 = 0.0;
		double res = 0.0;

		System.out.println("Digite a 1� nota: ");
		n1 = leitor.nextDouble();
		    
		System.out.println("Digite a 2� nota: ");
		n2 = leitor.nextDouble();

		System.out.println("Digite a 3� nota: ");
		n3 = leitor.nextDouble();

		res = (n1 + n2 + n3) / 3.0;
		    
		System.out.println("A M�dia Aritm�tica das 3 notas �: " + res);
	
		leitor.close();
	
	}
}
package treino;
import java.util.Scanner;

public class Ter�aParteDoDouble {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double n1 = 0.0;
		double n2 = 0.0;

		System.out.println("Digite um n�mero: ");
		n1 = leitor.nextDouble();

		n2 = n1 / 3;

		System.out.println("A ter�a parte de " + n1 + " �: " + n2);
		
		leitor.close();
		
	}
}
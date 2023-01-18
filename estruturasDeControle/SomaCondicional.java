package estruturasDeControle;
import java.util.Scanner;

public class SomaCondicional {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int n1 = 0;
		int n2 = 0;
		int resultado = 0;
		    
		System.out.print("Digite um número: ");
		n1 = leitor.nextInt();

		System.out.print("Digite outro número: ");
		n2 = leitor.nextInt();
		    
		resultado = n1 + n2;
		    
		if (resultado > 10) 
			System.out.print("O resultado desta adição é: " + resultado);
		else
			System.err.print("Não é possível fazer a adição!");
		    
		leitor.close();
		    
	}
}
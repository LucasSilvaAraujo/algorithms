package estruturasDeControle;
import java.util.Scanner;

public class CondicionalMúltiploDe3 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		int calculo = 0;
		int comparador = 0;
		    
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		    
		calculo = numero / 3;
		comparador = calculo * 3;
		    
		if (numero == comparador) 
			System.out.print("É múltiplo de 3.");
		else
			System.out.print("Não é múltiplo de 3.");

		leitor.close();
		
	}
}
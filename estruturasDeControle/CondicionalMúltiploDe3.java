package estruturasDeControle;
import java.util.Scanner;

public class CondicionalM�ltiploDe3 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		int calculo = 0;
		int comparador = 0;
		    
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextInt();
		    
		calculo = numero / 3;
		comparador = calculo * 3;
		    
		if (numero == comparador) 
			System.out.print("� m�ltiplo de 3.");
		else
			System.out.print("N�o � m�ltiplo de 3.");

		leitor.close();
		
	}
}
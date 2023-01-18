package estruturasDeControle;
import java.util.Scanner;

public class CálculoCondicional {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double numero = 0.0;
		double raiz = 0.0;
		double quadrado = 0.0;
		  
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		          
		if (numero >= 0) {
			raiz = Math.sqrt(numero);
			System.out.print("A raiz quadrada desse número é: " + raiz);
		}
		
		else {
			quadrado = numero * numero;
			System.out.print("O quadrado desse número é: " + quadrado);
		}
		    
		leitor.close();
		
	}
}
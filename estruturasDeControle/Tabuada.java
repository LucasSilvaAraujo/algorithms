package estruturasDeControle;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int num1 = 0;
		byte contador = 0;
		int calculo = 0;
		    
		System.out.print("Digite um número: ");
		num1 = leitor.nextInt();
		    
		while (contador <= 10) {
			calculo = num1 * contador;
			System.out.println(+ num1 + " * " + contador + " = " + calculo); 
			contador++;
		}
		
		leitor.close();
		
	}
}
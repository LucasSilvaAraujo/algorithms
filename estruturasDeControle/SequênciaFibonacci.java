package estruturasDeControle;
import java.util.Scanner;

public class SequênciaFibonacci {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int num1 = 0;
		int aux1 = 1;
		int aux2 = 0;
		int calculo = 0;
		int contador = 1;
		    
		System.out.print("Digite um número: ");
		num1 = leitor.nextInt();
		    
		System.out.print(calculo);
		    
		while (contador < num1) {
			calculo = aux1 + aux2;
			aux1 = aux2;
			aux2 = calculo;
			System.out.print("\t" + calculo); 
			contador++;
		}
		
		leitor.close();
		
	}
}
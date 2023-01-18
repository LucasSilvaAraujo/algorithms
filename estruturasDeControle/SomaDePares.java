package estruturasDeControle;
import java.util.Scanner;

public class SomaDePares {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int m = 0;
		int n = 1;
		int resul = 0;
		    
		while (m < n) {
			System.out.print("Digite um número: ");
			m = leitor.nextInt();
		      
			System.out.print("Digite outro número: ");
			n = leitor.nextInt();
		      
			if (m >= 0 && n >= 0) {
				resul = m + n;
				System.out.println("Soma entre esses dois números: " + resul);  
			}
			
			else
				System.err.println("Número Inválido!");
		} 
		    
		leitor.close();
		
	}
}
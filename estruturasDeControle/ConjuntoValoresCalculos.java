package estruturasDeControle;
import java.util.Scanner;

public class ConjuntoValoresCalculos {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double num1 = 1;
		double potenciaQua = 0;
		double potenciaCub = 0;
		double raizQ = 0;
		    
		do {
			System.out.print("DIGITE UM NÚMERO: ");
			num1 = leitor.nextDouble();
		      
			if (num1 > 0) { 
				potenciaQua = Math.pow(num1, 2);
				potenciaCub = Math.pow(num1, 3);
				raizQ = Math.sqrt(num1);
				System.out.println("Número Digitado: " + num1 + "\nElevado ao Quadrado: " + potenciaQua + "\nElevado ao Cubo: " + potenciaCub + "\nRaiz Quadrada: " + raizQ);
			}
		    
		} while (num1 > 0); 
		    
		leitor.close();
		
	}
}
package vetor_matriz;
import java.util.Scanner;

public class PosiçãoSuperioresA5 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] numeros = new int[10];
		boolean validar = false;
		    
		for(byte i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número de 0 a 10: ");
			numeros[i] = leitor.nextInt();
			
			if (numeros[i] < 0 || numeros[i] > 10) {
				System.err.println("Número Inválido!");
				i--;
			}
			
			else if (numeros[i] > 5) {
				validar = true;
			}
		}
		    
		if (validar == true)
			System.out.println("--NÚMEROS MAIORES QUE 5--");
		    
		for(byte i = 0; i < 10; i++) {
			if (numeros[i] > 5)
		        System.out.println("Número " + numeros[i] + " na " + (i + 1) + "ª Posição.");
		}
		    
		if (validar == false)
			System.out.println("Não há nenhum número maior que 5.");
		    
		leitor.close();
		    
	}
}
package vetor_matriz;
import java.util.Scanner;

public class Posi��oSuperioresA5 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] numeros = new int[10];
		boolean validar = false;
		    
		for(byte i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero de 0 a 10: ");
			numeros[i] = leitor.nextInt();
			
			if (numeros[i] < 0 || numeros[i] > 10) {
				System.err.println("N�mero Inv�lido!");
				i--;
			}
			
			else if (numeros[i] > 5) {
				validar = true;
			}
		}
		    
		if (validar == true)
			System.out.println("--N�MEROS MAIORES QUE 5--");
		    
		for(byte i = 0; i < 10; i++) {
			if (numeros[i] > 5)
		        System.out.println("N�mero " + numeros[i] + " na " + (i + 1) + "� Posi��o.");
		}
		    
		if (validar == false)
			System.out.println("N�o h� nenhum n�mero maior que 5.");
		    
		leitor.close();
		    
	}
}
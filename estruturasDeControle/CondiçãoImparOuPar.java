package estruturasDeControle;
import java.util.Scanner;

public class CondiçãoImparOuPar {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		byte resto = 0;
		    
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		    
		resto = (byte) (numero - ((numero / 2) * 2));
		    
		if (resto == 0) 
			System.out.print(+ numero + " é par.");
		else
			System.out.print(+ numero + " é ímpar.");

		leitor.close();
		
	}
}
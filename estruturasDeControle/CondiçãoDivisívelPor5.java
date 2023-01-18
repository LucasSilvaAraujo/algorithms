package estruturasDeControle;
import java.util.Scanner;

public class CondiçãoDivisívelPor5 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		byte resto = 0;
		    
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		    
		resto = (byte) ((numero - (numero / 5) * 5));
		    
		if (resto == 0) 
			System.out.print(+ numero + " é divisível por 5.");
		else
			System.out.print(+ numero + " não é divisível por 5.");

		leitor.close();
		
	}
}
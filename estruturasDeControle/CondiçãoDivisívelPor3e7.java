package estruturasDeControle;
import java.util.Scanner;

public class CondiçãoDivisívelPor3e7 {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		int quociente = 0;
		byte resto = 0;
		    
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		    
		quociente = (numero / 7) / 3;
		resto = (byte) ((numero / 7) - (quociente * 3));
		    
		if (resto == 0) 
			System.out.print(+ numero + " é divisível por 3 e 7.");
		else
			System.out.print(+ numero + " não é divisível por 3 e 7.");

		leitor.close();
		
	}
}
package estruturasDeControle;
import java.util.Scanner;

public class Condi��oDivis�velPor5 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		byte resto = 0;
		    
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextInt();
		    
		resto = (byte) ((numero - (numero / 5) * 5));
		    
		if (resto == 0) 
			System.out.print(+ numero + " � divis�vel por 5.");
		else
			System.out.print(+ numero + " n�o � divis�vel por 5.");

		leitor.close();
		
	}
}
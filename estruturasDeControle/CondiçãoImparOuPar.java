package estruturasDeControle;
import java.util.Scanner;

public class Condi��oImparOuPar {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		byte resto = 0;
		    
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextInt();
		    
		resto = (byte) (numero - ((numero / 2) * 2));
		    
		if (resto == 0) 
			System.out.print(+ numero + " � par.");
		else
			System.out.print(+ numero + " � �mpar.");

		leitor.close();
		
	}
}
package estruturasDeControle;
import java.util.Scanner;

public class Entre20e90OuNão {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		    
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		    
		if (numero >= 20 && numero <= 90)
			System.out.print("Este número está entre 20 e 90.");
		else
			System.out.print("Este número não está entre 20 e 90.");

		leitor.close();
	
	}	
}
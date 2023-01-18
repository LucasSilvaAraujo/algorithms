package estruturasDeControle;
import java.util.Scanner;

public class MaiorQue20 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int numero = 0;
		    
		System.out.println("Digite um número: ");
		numero = leitor.nextInt();
		    
		if (numero > 20) 
			System.out.print(+ numero); 

		leitor.close();
		    
	}
}
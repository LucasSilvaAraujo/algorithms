package estruturasDeControle;
import java.util.Scanner;

public class VerificarPrimeiroCaractereVogal {
	 
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		String nome = "";
		char primeiraLetra = '\u0000';
		    
		System.out.println("Digite um nome: ");
		nome = leitor.nextLine();
		    
		primeiraLetra = nome.toLowerCase().charAt(0);
		    
		switch(primeiraLetra) {
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println("A primeira letra � vogal.");
			break;     
		default:
			System.out.println("A primeira letra n�o � vogal.");
			break;
		}
		
		leitor.close();
		
	}
}
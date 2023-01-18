package estruturasDeControle;
import java.util.Scanner;

public class SiglasEstado {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		String siglaEstado = "";
		boolean validar = false;
		    
		do {  
			System.out.print("Digite a sigla de um estado: ");
			siglaEstado = leitor.nextLine();
		    
			if (siglaEstado.length() == 2) {  
				validar = true;
				switch (siglaEstado.toUpperCase()) {  
				case "MG":
					System.out.println("Mineiro");
					break;
				case "ES":
					System.out.println("Capixaba");
					break;
				case "RJ":
					System.out.println("Carioca");
					break;
				case "SP":
					System.out.println("Paulista");
					break;
				default:
					System.out.println("Outro Estado");
					break;
				} 
			}
		    
			else
				System.err.println("Sigla Inválida");
		
		} while (validar == false);
		
		leitor.close();
		
	}
}
package estruturasDeControle;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MédiaIdades {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");

		double num1 = 0.0;
		double acumulativo = 0.0;
		double aux = 0.0;
		double media = 0.0;
		    
		do {
			System.out.print("Digite uma idade(Insira '0' quando quiser parar): ");
			num1 = leitor.nextDouble();
			acumulativo = acumulativo + num1;
			aux++;  
		} while (num1 != 0);
		    
		aux = aux - 1;
		media = acumulativo / aux;
		    
		System.out.println("Média das idades digitadas: " + df.format(media));
		    
		leitor.close();
		
	}
}
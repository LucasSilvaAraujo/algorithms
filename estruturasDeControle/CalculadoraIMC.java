package estruturasDeControle;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		    
		float altura = 0.0f;
		char sexo = '\u0000';
		double pesoIdeal = 0.0;
		boolean validar = false;
		    
		System.out.println("Informe a altura da pessoa: ");
		altura = leitor.nextFloat();
		    
		do {
			System.out.println("Informe o sexo da pessoa (M/F): ");
			sexo = leitor.next().toLowerCase().charAt(0);
		      
			switch (sexo) {
			case 'm':
				pesoIdeal = (72.7 * altura) - 58;
				System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));
				validar = true;
				break;
			case 'f':
				pesoIdeal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));
				validar = true;
				break;
			default:
				System.err.println("Sexo inválido!");
				break;
			}
			
		} while (validar == false); 

		leitor.close();
		    
	}
}
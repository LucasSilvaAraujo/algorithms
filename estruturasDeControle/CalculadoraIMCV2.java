package estruturasDeControle;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraIMCV2 {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		    
		float altura = 0.0f;
		double massa = 0.0;
		double resultadoIMC = 0.0;
		    
		System.out.print("--CALCULADORA DE IMC--\nInforme sua altura (M): ");
		altura = leitor.nextFloat();
		    
		System.out.print("Informe sua massa corporal (KG): ");
		massa = leitor.nextDouble();
		    
		resultadoIMC = massa / (altura * altura);
		    
		System.out.println("IMC: " + df.format(resultadoIMC));
		    
		if (resultadoIMC < 17)
			System.out.println("Muito abaixo do peso.");
		    
		else if (resultadoIMC >= 17 && resultadoIMC <= 18.49)
			System.out.println("Abaixo do peso.");
		    
		else if (resultadoIMC >= 18.50 && resultadoIMC <= 24.99)
			System.out.println("Peso normal.");
		    
		else if (resultadoIMC >= 25 && resultadoIMC <= 29.99)
			System.out.println("Acima do peso.");
		    
		else if (resultadoIMC >= 30 && resultadoIMC <= 34.99)
			System.out.println("Obesidade I.");
		    
		else if (resultadoIMC >= 35 && resultadoIMC <= 39.99)
			System.out.println("Obesidade II (severa).");
		    
		else
			System.out.println("Obesidade III (mórbida).");
		    
		leitor.close();
		    
	}
}
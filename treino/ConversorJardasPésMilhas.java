package treino;
import java.util.Scanner;

public class ConversorJardasP�sMilhas {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double pes = 0.0;
		double pol = 0.0;
		double jar = 0.0;
		double mil = 0.0;

		System.out.println("Digite uma medida em p�s: ");
		pes = leitor.nextDouble();

		pol = pes * 12;
		jar = pes / 3;
		mil = jar / 1760;

		System.out.println("--CONVERS�O--\nPolegadas: " + pol + "\nJardas: " + jar + "\nMilhas: " + mil);
		
		leitor.close();
		
	}
}
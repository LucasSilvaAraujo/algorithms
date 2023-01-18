package treino;
import java.util.Scanner;

public class ÁreaDoTriângulo {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double base = 0.0;
		double altura = 0.0;
		double area = 0.0;

		System.out.println("Digite a base do Triângulo: ");
		base = leitor.nextDouble();

		System.out.println("Digite a altura do Triângulo: ");
		altura = leitor.nextDouble();

		area = (base * altura) / 2;

		System.out.println("A área deste triângulo é: " + area);
		
		leitor.close();
		
	}
}
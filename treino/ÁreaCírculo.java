package treino;
import java.util.Scanner;

public class ÁreaCírculo {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double raio = 0.0;
		double area = 0.0;

		System.out.println("Digite o raio do Círculo: ");
		raio = leitor.nextDouble();

		area = Math.PI * (raio*raio);

		System.out.println("A área deste círculo é: " + area);
		
		leitor.close();
		
	}
}
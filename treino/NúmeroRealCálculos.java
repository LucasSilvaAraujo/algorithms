package treino;
import java.util.Scanner;

public class NúmeroRealCálculos {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double n1 = 0.0;
		double raiz = 0.0;
		double raizc = 0.0;
		double qua = 0.0;
		double cub = 0.0;

		System.out.println("Digite um número: ");
		n1 = leitor.nextDouble();

		qua = n1 * n1;
		cub = n1 * n1 * n1;
		raiz = Math.sqrt(n1);
		raizc = Math.cbrt(n1);

		System.out.println("--RESULTADOS--\nElevado ao Quadrado: " + qua + "\nElevado ao Cubo: " + cub + "\nRaiz Quadrada: " + raiz + "\nRaiz Cúbica: " + raizc);
		
		leitor.close();
		
	}
}
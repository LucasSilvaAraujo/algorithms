package treino;
import java.util.Scanner;

public class AntecessorSucessor {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n = 0;
		int sus = 0;
		int ant = 0;

		System.out.println("Digite um n�mero: ");
		n = leitor.nextInt();

		sus = n + 1;
		ant = n - 1;

		System.out.println("O antecessor de " + n + " � " + ant + " e o sucessor � " + sus);
		
		leitor.close();
		
	}
}
package treino;
import java.util.Scanner;

public class AnoNascimentoMenosAtual {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int idade = 0;
		int ano = 0;
		int nasc = 0;
		int fut = 0;

		System.out.println("Digite o ano de nascimento: ");
		nasc = leitor.nextInt();

		System.out.println("Digite o ano atual: ");
		ano = leitor.nextInt();

		idade = ano - nasc;
		fut = 2050 - nasc;

		System.out.println("Essa pessoa tem " + idade + " anos e terá " + fut + " em 2050.");
		
		leitor.close();

	}
}
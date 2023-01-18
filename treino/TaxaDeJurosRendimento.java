package treino;
import java.util.Scanner;

public class TaxaDeJurosRendimento {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double deposito = 0.0;
		double rendimento = 0.0;
		double juros = 0.0;
		double totalrend = 0.0;

		System.out.println("Digite o valor do depósito: ");
		deposito = leitor.nextDouble();

		System.out.println("Digite o valor da taxa de juros: ");
		juros = leitor.nextDouble();

		rendimento = deposito * juros / 100;
		totalrend = deposito + rendimento;
		    
		System.out.println("O depósito gerou um rendimento de " + rendimento + " reais e totalizou " + totalrend + " reais.");
		
		leitor.close();
		
	}
}
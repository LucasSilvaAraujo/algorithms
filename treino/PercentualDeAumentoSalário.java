package treino;
import java.util.Scanner;

public class PercentualDeAumentoSalįrio {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double salarioAtual = 0.0;
		double novoSalario = 0.0;
		double percentual = 0.0;
		double aumento = 0.0;

		System.out.println("Digite o salįrio atual do funcionįrio: ");
		salarioAtual = leitor.nextDouble();

		System.out.println("Digite o percentual de aumento: ");
		percentual = leitor.nextDouble();

		aumento = salarioAtual * percentual / 100;
		novoSalario = salarioAtual + aumento;
		    
		System.out.println("O funcionįrio teve um aumento de " + aumento + " reais e seu salįrio ficou " + novoSalario + " reais.");
		
		leitor.close();
		
	}
}
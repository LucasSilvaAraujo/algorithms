package treino;
import java.util.Scanner;

public class CálculoNovoSalário {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double salarioAtual = 0.0;
		double novoSalario = 0.0;

		System.out.println("Digite o salário atual do funcionário: ");
		salarioAtual = leitor.nextDouble();

		novoSalario = salarioAtual * 1.25;
		    
		System.out.println("Novo Salário = " + novoSalario);
	
		leitor.close();
	
	}
}
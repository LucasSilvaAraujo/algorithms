package treino;
import java.util.Scanner;

public class CálculoDeSalário {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double salarioAtual = 0.0;
		double novoSalario = 0.0;

		System.out.println("Digite o salário atual do funcionário: ");
		salarioAtual = leitor.nextDouble();

		novoSalario = (salarioAtual * 1.05) - (salarioAtual * 7 / 100);
		    
		System.out.println("Novo salário = " + novoSalario);
		
		leitor.close();
		
	}	
}
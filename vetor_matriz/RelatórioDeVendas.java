package vetor_matriz;
import java.util.Scanner;
import java.text.DecimalFormat;

public class RelatórioDeVendas {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		double[] valorUnitarioOBJ = new double[10];
		int[] quantVendidaOBJ = new int[10];
		double[] valorTotalOBJ = new double[10];
		double valorGeral = 0.0;
		double valorComissao = 0.0;
		int objMaisVendido = 0;
		byte posicaoMaisVendido = 0;
		    
		for (byte i = 0; i < 10; i++) {
			System.out.print("Digite o valor unitário do "+ (i + 1) + "º objeto: ");
			valorUnitarioOBJ[i] = leitor.nextDouble();
			System.out.print("Digite a quantidade vendida do "+ (i + 1) + "º objeto: ");
			quantVendidaOBJ[i] = leitor.nextInt();
			valorTotalOBJ[i] = valorUnitarioOBJ[i] * quantVendidaOBJ[i];
			valorGeral = valorGeral + valorTotalOBJ[i];
			if (quantVendidaOBJ[i] > objMaisVendido) {
				objMaisVendido = quantVendidaOBJ[i];
				posicaoMaisVendido = i;
			}
		}
		    
		valorComissao = 545 + (0.05 * valorGeral);
		    
		System.out.println("--RELATÓRIO--");
		    
		for (byte i = 0; i < 10; i++) {
			System.out.println((i + 1) + "º Objeto \tValor Unitário: R$" + df.format(valorUnitarioOBJ[i]) + "\tQuantidade Vendida: " + quantVendidaOBJ[i] + "\tValor Total: R$" + df.format(valorTotalOBJ[i]));
		}
		    
		System.out.println("\nValor Geral das Vendas: R$" + df.format(valorGeral));
		System.out.println("\nValor da Comissão paga ao Vendedor: R$" + df.format(valorComissao));
		System.out.println("\nValor do Objeto mais Vendido e sua Posição: R$" + df.format(objMaisVendido) + " , " + (posicaoMaisVendido+1));
		    
		leitor.close();
		    
	}
}
package vetor_matriz;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Relat�rioDeVendas {

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
			System.out.print("Digite o valor unit�rio do "+ (i + 1) + "� objeto: ");
			valorUnitarioOBJ[i] = leitor.nextDouble();
			System.out.print("Digite a quantidade vendida do "+ (i + 1) + "� objeto: ");
			quantVendidaOBJ[i] = leitor.nextInt();
			valorTotalOBJ[i] = valorUnitarioOBJ[i] * quantVendidaOBJ[i];
			valorGeral = valorGeral + valorTotalOBJ[i];
			if (quantVendidaOBJ[i] > objMaisVendido) {
				objMaisVendido = quantVendidaOBJ[i];
				posicaoMaisVendido = i;
			}
		}
		    
		valorComissao = 545 + (0.05 * valorGeral);
		    
		System.out.println("--RELAT�RIO--");
		    
		for (byte i = 0; i < 10; i++) {
			System.out.println((i + 1) + "� Objeto \tValor Unit�rio: R$" + df.format(valorUnitarioOBJ[i]) + "\tQuantidade Vendida: " + quantVendidaOBJ[i] + "\tValor Total: R$" + df.format(valorTotalOBJ[i]));
		}
		    
		System.out.println("\nValor Geral das Vendas: R$" + df.format(valorGeral));
		System.out.println("\nValor da Comiss�o paga ao Vendedor: R$" + df.format(valorComissao));
		System.out.println("\nValor do Objeto mais Vendido e sua Posi��o: R$" + df.format(objMaisVendido) + " , " + (posicaoMaisVendido+1));
		    
		leitor.close();
		    
	}
}
package vetor_matriz;
import java.util.Scanner;

public class MêsSemanaDoMês {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[][] matriz = new int[12][4];
		String[] mesesAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int totalVendasAno = 0;
		int[] totalMeses = new int[12];
		int aux = 0;
		    
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor da venda na " + (j + 1) + "ª semana de " + mesesAno[i] + ": ");
				matriz[i][j] = leitor.nextInt();
				totalVendasAno = totalVendasAno + matriz[i][j];
				aux = aux + matriz[i][j];
			}
			totalMeses[i] = totalMeses[i] + aux;
			aux = 0;
		}
		    
		System.out.println("\n--TOTAL DE VENDAS POR MÊS--");
		    
		for (int i = 0; i < totalMeses.length; i++) {
			System.out.println(mesesAno[i] + " - Total de Vendas: R$" + totalMeses[i] + ",00");
		}
		    
		System.out.println("\n--TOTAL DE VENDAS POR SEMANA NO ANO--");
		    
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("R$" + matriz[i][j] + ",00 \t");
			}
			System.out.println();
		}
		    
		System.out.println("\nTotal de Vendas no Ano: R$" + totalVendasAno + ",00");

		leitor.close();
		
	}
}
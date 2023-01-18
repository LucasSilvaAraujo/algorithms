package vetor_matriz;
import java.util.Scanner;

public class SepararVetoresPositivosNegativos {

	static void printarValores(byte a, int b[]) {
		for(byte i = 0; i < a; i++) {
			System.out.print("\t" + b[i]);
		}
	}

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] vetorPrimario = new int[8];
		int[] vetorPositivo = new int[8];
		int[] vetorNegativo = new int[8];
		byte aux1 = 0;
		byte aux2 = 0;
		    
		for(byte i = 0; i < 8; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vetorPrimario[i] = leitor.nextInt();
		      
			if (vetorPrimario[i] >= 0) {
				vetorPositivo[aux1] = vetorPrimario[i];
				aux1++;
			}
			
			else {
				vetorNegativo[aux2] = vetorPrimario[i];
				aux2++;
			}
		}
		      
		System.out.println("--LISTA DOS VALORES--");
		System.out.print("Valores Positivos: ");
		printarValores(aux1, vetorPositivo);
		System.out.print("\nValores Negativos: ");
		printarValores(aux2, vetorNegativo);
		
		leitor.close();
		
	}
}
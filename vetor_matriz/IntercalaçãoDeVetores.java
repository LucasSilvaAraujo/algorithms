package vetor_matriz;
import java.util.Scanner;

public class IntercalaçãoDeVetores {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int[] vetorUm = new int[10];
		int[] vetorDois = new int[10];
		int[] vetorIntercalado = new int[20];
		byte aux = 0;
		    
		for(byte i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor do 1º vetor: ");
			vetorUm[i] = leitor.nextInt();
		}
		      
		for(byte i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor do 2º vetor: ");
			vetorDois[i] = leitor.nextInt();
		}
		    
		for(byte i = 0; i < 10; i++) {
			vetorIntercalado[aux] = vetorUm[i];
			aux++;
			vetorIntercalado[aux] = vetorDois[i];
			aux++;
		}
		    
		System.out.print("Intercalação: ");
		    
		for(byte i = 0; i < 20; i++) {
			System.out.print("\t" + vetorIntercalado[i]);
		}
		    
		leitor.close();
		
	}
}
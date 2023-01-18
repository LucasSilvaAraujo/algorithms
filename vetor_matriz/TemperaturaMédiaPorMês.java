package vetor_matriz;
import java.util.Scanner;

public class TemperaturaM�diaPorM�s {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		    
		int[] temperaturaMedia = new int[12];
		int maiorTemp = 0;
		int menorTemp = 0;
		int aux2 = 0;
		int aux = 0;
		String[] mesesAno = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		    
		for(byte i = 0; i < 12; i++) {
			System.out.print("Digite a temperatura m�dia de " + mesesAno[i] + ": ");
			temperaturaMedia[i] = leitor.nextInt();
			if (temperaturaMedia[i] > maiorTemp) {
				maiorTemp = temperaturaMedia[i];
				aux = i;
			}
		}
		    
		menorTemp = maiorTemp;
		    
		for(byte i = 0; i < 12; i++) {
			if (menorTemp > temperaturaMedia[i]) {
				menorTemp = temperaturaMedia[i];
				aux2 = i;
			}
		}
		    
		System.out.println("Maior Temperatura do Ano: " + maiorTemp + "�C em " + mesesAno[aux]);
		System.out.println("Menor Temperatura do Ano: " + menorTemp + "�C em " + mesesAno[aux2]); 
		 
		leitor.close();

	}
}
package vetor_matriz;
import java.util.Scanner;

public class CorrigirProvaMultiplaEscolha {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		char[] gabarito = new char[8];
		int[] numAlunos = new int[10];
		char[] respostasAlunos = new char[8];
		int[] notaAlunos = new int[10];
		int aprovados = 0;
		    
		for(byte i = 0; i < 8; i++) {
			
			System.out.print("Digite a " + (i + 1) + "� resposta da prova(A, B, C, D, E): ");
			gabarito[i] = leitor.next().toUpperCase().charAt(0);
			
			switch (gabarito[i]) {
			case 'A', 'B', 'C', 'D', 'E':
				break;    
			default:
				System.err.println("Resposta Inv�lida!");
				i--;
				break;
			}
		}
		    
		for(byte i = 0; i < 10; i++) {
			
			System.out.print("Digite o n�mero do " + (i + 1) + "� aluno: ");
			numAlunos[i] = leitor.nextInt();
			
			if (numAlunos[i] < 1) {
				System.err.println("N�mero Inv�lido!");
				i--;
			}
		}
		    
		for(byte i = 0; i < 10; i++) {
			
			System.out.println("Digite as respostas do " + numAlunos[i] + "� aluno(A, B, C, D, E): ");
			
			for(byte n = 0; n < respostasAlunos.length; n++) {
				
				System.out.print((n + 1) + "� Resposta: ");
				respostasAlunos[n] = leitor.next().toUpperCase().charAt(0);
				
				switch (respostasAlunos[n]) {
				case 'A', 'B', 'C', 'D', 'E':
					if (respostasAlunos[n] == gabarito[n]) {
						notaAlunos[i] = notaAlunos[i] + 1;
					}
					break;
		        default:
					System.err.println("Resposta Inv�lida!");
					n--;
					break;
				}
			}
			
			if (notaAlunos[i] >= 6) {
				aprovados = aprovados + 1;
			}
		}
		    
		aprovados = aprovados * 10;
		    
		System.out.println("--NOTAS DOS ALUNOS--");
		    
		for(byte i = 0; i < 10; i++) {
			System.out.println(numAlunos[i] + "� aluno: Nota " + notaAlunos[i]);
		}
		    
		System.out.println("Porcentagem de Aprova��o: " + aprovados + "%");

		leitor.close();
		
	}
}
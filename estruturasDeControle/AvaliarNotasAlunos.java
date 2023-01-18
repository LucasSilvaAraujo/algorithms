package estruturasDeControle;
import java.util.Scanner;

public class AvaliarNotasAlunos {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double nota4 = 0.0;
		double notaFinal = 0.0;
		String resultado = "";
		    
		System.out.println("--CALCULAR MÉDIA--\nInforme as 4 notas do aluno, uma por vez: ");
		nota1 = leitor.nextDouble();
		nota2 = leitor.nextDouble();
		nota3 = leitor.nextDouble();
		nota4 = leitor.nextDouble();
		    
		notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		    
		resultado = (notaFinal >= 7) ? "Aprovado" : "Reprovado";
		    
		System.out.println("Média: " + notaFinal + "\nStatus: " + resultado);
		  
		leitor.close();
		
	}
}
package treino;
import java.util.Scanner;

public class LerInforma��es {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome;
		String end;
		String tel;

		System.out.println("Informe o nome: ");
		nome = leitor.nextLine();

		System.out.println("Informe o endere�o: ");
		end = leitor.nextLine();

		System.out.println("Informe o telefone: ");
		tel = leitor.nextLine();

		System.out.println("O " + nome + " reside na " + end + " e tem o seguinte n�mero de telefone: " + tel);
		
		leitor.close();
		
	}
}
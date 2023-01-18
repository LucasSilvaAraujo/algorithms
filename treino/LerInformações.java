package treino;
import java.util.Scanner;

public class LerInformações {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome;
		String end;
		String tel;

		System.out.println("Informe o nome: ");
		nome = leitor.nextLine();

		System.out.println("Informe o endereço: ");
		end = leitor.nextLine();

		System.out.println("Informe o telefone: ");
		tel = leitor.nextLine();

		System.out.println("O " + nome + " reside na " + end + " e tem o seguinte número de telefone: " + tel);
		
		leitor.close();
		
	}
}
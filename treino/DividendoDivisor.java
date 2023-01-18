package treino;
import java.util.Scanner;

public class DividendoDivisor {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int div1 = 0; 
		int div2 = 0; 
		int quo = 0; 
		int res = 0;

		System.out.println("Digite o dividendo: ");
		div1 = leitor.nextInt();

		System.out.println("Digite o divisor: ");
		div2 = leitor.nextInt();

		quo = div1 / div2;
		res = div1 - (quo * div2);

		System.out.println(+ quo + " e " + res + " são, respectivamente, o quociente e resto da divisão de " + div1 + " por " + div2);
	
		leitor.close();
	
	}
}
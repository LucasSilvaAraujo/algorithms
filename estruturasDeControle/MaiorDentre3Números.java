package estruturasDeControle;
import java.util.Scanner;

public class MaiorDentre3N�meros {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		    
		System.out.println("Digite 3 valores diferentes, um por vez: ");
		num1 = leitor.nextInt();
		num2 = leitor.nextInt();
		num3 = leitor.nextInt();
		  
		if (num1 > num2 && num1 > num3) 
			System.out.println("O " + num1 + " � o maior dos 3 n�meros.");
		    
		else if (num2 > num1 && num2 > num3)
			System.out.println("O " + num2 + " � o maior dos 3 n�meros.");
		    
		else
			System.out.println("O " + num3 + " � o maior dos 3 n�meros.");
		    
		leitor.close();
		
	}
}
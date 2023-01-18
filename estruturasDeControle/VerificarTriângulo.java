package estruturasDeControle;
import java.util.Scanner;

public class VerificarTriângulo {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int X = 0;
		int Y = 0;
		int Z = 0;
		    
		System.out.print("Informe o lado X do Triângulo: ");
		X = leitor.nextInt();
		    
		System.out.print("Informe o lado Y do Triângulo: ");
		Y = leitor.nextInt();
		    
		System.out.print("Informe o lado Z do Triângulo: ");
		Z = leitor.nextInt();
		    
		if (X + Y > Z && Y + Z > X && Z + X > Y) {      
			if (X == Y && X == Z) 
				System.out.println("Triângulo Equilátero.");
		      
			else if (X != Y && Y != Z && X != Z) 
				System.out.println("Triângulo Escaleno.");
		      
			else
				System.out.println("Triângulo Isósceles."); 
		}   
		
		else
			System.out.println("É impossível um Triângulo ter essas medidas.");

		leitor.close();
		    
	}
}
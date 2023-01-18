package estruturasDeControle;
import java.util.Scanner;

public class VerificarTri�ngulo {

	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		int X = 0;
		int Y = 0;
		int Z = 0;
		    
		System.out.print("Informe o lado X do Tri�ngulo: ");
		X = leitor.nextInt();
		    
		System.out.print("Informe o lado Y do Tri�ngulo: ");
		Y = leitor.nextInt();
		    
		System.out.print("Informe o lado Z do Tri�ngulo: ");
		Z = leitor.nextInt();
		    
		if (X + Y > Z && Y + Z > X && Z + X > Y) {      
			if (X == Y && X == Z) 
				System.out.println("Tri�ngulo Equil�tero.");
		      
			else if (X != Y && Y != Z && X != Z) 
				System.out.println("Tri�ngulo Escaleno.");
		      
			else
				System.out.println("Tri�ngulo Is�sceles."); 
		}   
		
		else
			System.out.println("� imposs�vel um Tri�ngulo ter essas medidas.");

		leitor.close();
		    
	}
}
package estruturasDeControle;
import java.util.Scanner;

public class ResolverEqua��oDe2�Grau {
	
	public static void main(String[] args) {
		    
		Scanner leitor = new Scanner(System.in);
		    
		double A = 0.0;
		double B = 0.0;
		double C = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		double delta = 0.0;
		    
		System.out.print("---C�LCULO EQUA��O DE SEGUNDO GRAU---\nInforme o A: ");
		A = leitor.nextDouble();
		    
		System.out.print("Informe o B: ");
		B = leitor.nextDouble();
		    
		System.out.print("Informe o C: ");
		C = leitor.nextDouble();
		    
		delta = (B * B) - 4 * (A * C);
		    
		if (delta < 0) 
			System.out.println("Delta negativo n�o possu� raiz real.");
		    
		else if (delta == 0) {
			x1 = (B + Math.sqrt(delta)) / (A * 2);
			System.out.println("Ambas as ra�zes s�o " + x1 + " pois o delta � 0.");
		}
		    
		else {
			x1 = (B + Math.sqrt(delta)) / (A * 2);
			x2 = (B - Math.sqrt(delta)) / (A * 2);
			System.out.println("X1: " + x1 + "\nX2: " + x2);
		}
		    
		leitor.close();
  
	}
}
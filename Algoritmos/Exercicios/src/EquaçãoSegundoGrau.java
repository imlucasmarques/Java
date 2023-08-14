import java.util.Scanner;

public class EquaçãoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
  
		double a, b, c, delta, x1, x2;
		
		System.out.println(" a = ");
		a = teclado.nextDouble();
		
		if ( a == 0 ) {
		System.out.println(" Não é uma equação do segundo grau ");
		} else {
			
			System.out.println(" b = ");
			b = teclado.nextDouble();
			
			System.out.println(" c = ");
			c = teclado.nextDouble();
	
			delta = b*b -4*a*c;
		
			if( delta >= 0) {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println(" X1 = " + x1);
				System.out.println(" X2 = " + x2);
			} else {
				System.out.println(" A equação não tem, raiz real");
			}
			}
	}
	}
	


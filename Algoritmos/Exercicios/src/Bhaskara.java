import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	double a, b, c, delta, x1, x2;
	
	System.out.println(" digite o valor de a:");
	a = teclado.nextDouble();
	
	System.out.println(" digite o valor de b;");
	b = teclado.nextDouble();
	
	System.out.println(" digite o valor de c:");
	c = teclado.nextDouble();
	
	delta = Math.pow(b, 2) - 4*a*c;
	System.out.println(" O valor de delta é:" + delta);
	
	x1 = (-b + Math.sqrt(delta)) / (2*a);
	System.out.println(" O valor de x1 é:" + x1);
	
	x2 = (-b - Math.sqrt(delta)) / (2*a);
	System.out.println(" O valor de x2 é:" + x2);
	
	}

}

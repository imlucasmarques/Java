import java.util.Scanner;

public class Expressão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		double x, y;
		
		System.out.println(" Digite o valor de x: ");
		x = teclado.nextDouble();
		
		if (x > 5 || x < -5 ) {
			y = (x - 8) / Math.sqrt(x * x - 25);
			System.out.println(" O valor de y é " + y );
		} else {
		System.out.println(" Valor inválido ");
		}
	}

}

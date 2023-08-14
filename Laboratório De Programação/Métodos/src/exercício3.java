import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.print(" Digite o primeiro valor: ");
		a = teclado.nextDouble();
		
		System.out.print(" Digite o segundo valor: ");
		b = teclado.nextDouble();
		
		System.out.print(" Digite o terceiro valor: ");
		c = teclado.nextDouble();
		
		System.out.println(" maior valor = " + maior(a, b, c));
	}

	public static double maior(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}
}

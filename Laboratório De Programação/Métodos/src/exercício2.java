import java.util.Scanner;

public class exerc�cio2 {

	public static void main (String[]args) {
		
		Scanner teclado = new Scanner (System.in);
		double a, b, c;
		
		System.out.println(" Digite o primeiro valor: ");
		a = teclado.nextDouble();
		
		System.out.println(" Digite o segundo valor: ");
		b = teclado.nextDouble();
		
		System.out.println(" Digite o terceiro valor: ");
		c = teclado.nextDouble();
		
		if(a < b + c && b < a + c && c < a + b) {
			classificar(a, b, c);
		  } else {
				System.out.println(" Os valores n�o formam um tri�ngulo ");
			}
		}
	
	public static void classificar (double a, double b, double c) {
		if (a == b && b == c) {
			System.out.println(" Tri�ngulo equilatero ");
		} else if (a == b || a == c || b == c) {
			System.out.println(" Tri�ngulo is�celes ");
		} else {
			System.out.println(" Tri�ngulo escaleno ");
		}
	}
}

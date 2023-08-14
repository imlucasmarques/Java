import java.util.Scanner;

public class exercício2 {

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
				System.out.println(" Os valores não formam um triângulo ");
			}
		}
	
	public static void classificar (double a, double b, double c) {
		if (a == b && b == c) {
			System.out.println(" Triângulo equilatero ");
		} else if (a == b || a == c || b == c) {
			System.out.println(" Triângulo isóceles ");
		} else {
			System.out.println(" Triângulo escaleno ");
		}
	}
}

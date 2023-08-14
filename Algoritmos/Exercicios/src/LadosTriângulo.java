import java.util.Scanner;

public class LadosTriângulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double a, b, c;
		
		System.out.println(" Informe os lados do triângulo: ");
		
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println(" Os valores formam um triângulo ");
		} else {
			System.out.println(" Os valores não fromam um triângulo ");
		}
	}

}

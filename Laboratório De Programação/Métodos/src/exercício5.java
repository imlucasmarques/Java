import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		double a, b, c, d;
		double [] raiz;
		System.out.println(" valor de a --> ");
		a = teclado.nextDouble();
		if (a == 0) {
			System.out.println(" Não é uma equação do 2o grau ");
		} else {
			System.out.println(" valor de b --> ");
			b = teclado.nextDouble();
			System.out.println(" valor de c --> ");
			c = teclado.nextDouble();
			d = delta(a, b, c);
			if (d < 0) {
				System.out.println(" A equação não tem raiz real ");
			} else {
				raiz = calcular(a, b, d);
				System.out.println(" x1 = " + raiz[0]);
				System.out.println(" x2 = " + raiz[1]);
			}
		}
	}

	public static double delta(double a, double b, double c) {
		return (b * b - 4 * a * c);
		
	}

	public static double[] calcular(double a, double b, double d) {
		double[] raiz = new double[2];
		raiz[0] = (-b + Math.sqrt(d)) / (2 * a);
		raiz[1] = (-b - Math.sqrt(d)) / (2 * a);
		return raiz;
	}

}


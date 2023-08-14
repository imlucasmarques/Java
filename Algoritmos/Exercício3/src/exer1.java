import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
		double x, y, z;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o 1� lado do tri�ngulo: ");
		x = teclado.nextDouble();

		System.out.print("Digite o 2� lado do tri�ngulo: ");
		y = teclado.nextDouble();

		System.out.print("Digite o 3� lado do tri�ngulo: ");
		z = teclado.nextDouble();

		while (!(z < x + y && y < x + z && x < y + z)) {
			System.out.println("");
			System.out.println("Esse tri�ngulo � inv�lido! Tente novamento.");
			System.out.print("Digite o 1� lado do tri�ngulo: ");
			x = teclado.nextDouble();

			System.out.print("Digite o 2� lado do tri�ngulo: ");
			y = teclado.nextDouble();

			System.out.print("Digite o 3� lado do tri�ngulo: ");
			z = teclado.nextDouble();
		}

		System.out.println("");
		System.out.println("===============================");
		System.out.println("====== Tipo de Tri�ngulo ======");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("1� Lado: " + String.format("%.2f", x));
		System.out.println("2� Lado: " + String.format("%.2f", y));
		System.out.println("3� Lado: " + String.format("%.2f", z));
		System.out.println("");
		if (x == y && x == z && y == z) {
			System.out.println("Tipo: Equil�tero");
		} else if (x == y || x == z || y == z) {
			System.out.println("Tipo: Is�sceles");
		} else if (x != y || x != z || y != z) {
			System.out.println("Tipo: Escaleno");
		}
		System.out.println("");
		System.out.println("==============================");
		System.out.println("");

	}
}

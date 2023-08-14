import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
		double x, y, z;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o 1º lado do triângulo: ");
		x = teclado.nextDouble();

		System.out.print("Digite o 2º lado do triângulo: ");
		y = teclado.nextDouble();

		System.out.print("Digite o 3º lado do triângulo: ");
		z = teclado.nextDouble();

		while (!(z < x + y && y < x + z && x < y + z)) {
			System.out.println("");
			System.out.println("Esse triângulo é inválido! Tente novamento.");
			System.out.print("Digite o 1º lado do triângulo: ");
			x = teclado.nextDouble();

			System.out.print("Digite o 2º lado do triângulo: ");
			y = teclado.nextDouble();

			System.out.print("Digite o 3º lado do triângulo: ");
			z = teclado.nextDouble();
		}

		System.out.println("");
		System.out.println("===============================");
		System.out.println("====== Tipo de Triângulo ======");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("1º Lado: " + String.format("%.2f", x));
		System.out.println("2º Lado: " + String.format("%.2f", y));
		System.out.println("3º Lado: " + String.format("%.2f", z));
		System.out.println("");
		if (x == y && x == z && y == z) {
			System.out.println("Tipo: Equilátero");
		} else if (x == y || x == z || y == z) {
			System.out.println("Tipo: Isósceles");
		} else if (x != y || x != z || y != z) {
			System.out.println("Tipo: Escaleno");
		}
		System.out.println("");
		System.out.println("==============================");
		System.out.println("");

	}
}

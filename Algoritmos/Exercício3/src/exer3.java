
import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double x, y;

		System.out.print("Digite o valor da coordenada X --> ");
		x = teclado.nextDouble();

		System.out.print("Digite o valor da coordenada Y --> ");
		y = teclado.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("O ponto est� localizado no 1� quadrante.");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto est� localizado no 2� quadrante.");
		} else if (x < 0 && y < 0) {
			System.out.println("O ponto est� localizado no 3� quadrante.");
		} else if (x > 0 && y < 0) {
			System.out.println("O ponto est� localizado no 4� quadrante.");
		} else if (x == 0 && y != 0) {
			System.out.println("O ponto est� localizado no Eixo Y.");
		} else if (y == 0 && x != 0) {
			System.out.println("O ponto est� localizado no Eixo X.");
		} else if (x == y && x == 0 && y == 0) {
			System.out.println("O ponto est� localizado na origem.");
		}

	}
}
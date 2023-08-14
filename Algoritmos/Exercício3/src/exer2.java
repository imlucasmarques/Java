import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int A, B, C, D;

		System.out.print("Escreva o valor de A --> ");
		A = teclado.nextInt();

		System.out.print("Escreva o valor de B --> ");
		B = teclado.nextInt();

		System.out.print("Escreva o valor de C --> ");
		C = teclado.nextInt();

		System.out.print("Escreva o valor de D --> ");
		D = teclado.nextInt();

		while (!(B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0)) {
			System.out.println("");
			System.out.println("Esse valores não são aceitos. Tente novamente!");
			System.out.println("");

			System.out.print("Escreva o valor de A --> ");
			A = teclado.nextInt();

			System.out.print("Escreva o valor de B --> ");
			B = teclado.nextInt();

			System.out.print("Escreva o valor de C --> ");
			C = teclado.nextInt();

			System.out.print("Escreva o valor de D --> ");
			D = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Valores aceitos.");
	}
}

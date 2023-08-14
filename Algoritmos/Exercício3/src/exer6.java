import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String nome;
		double renda, imposto;

		System.out.print("Escreva o nome do habitante --> ");
		nome = teclado.nextLine();
		System.out.print("Escreva a renda do habitante --> R$");
		renda = teclado.nextDouble();

		if (renda >= 0 && renda <= 2000) {
			imposto = 0;
		} else if (renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000) * 0.08;
		} else if (renda > 3000 && renda <= 4500) {
			imposto = ((renda - 3000) * 0.18) + 80;
		} else {
			imposto = ((renda - 4500) * 0.28) + 350;
		}

		System.out.println("=============================");
		System.out.println("");
		System.out.println("Nome do habitante: " + nome);
		System.out.println("");
		System.out.println("Renda: R$" + String.format("%.2f", renda));
		if (imposto == 0) {
			System.out.println("Imposto: Insento");
		}else {
			System.out.println("Imposto: R$" + String.format("%.2f", imposto));
		}
		System.out.println("");
		System.out.println("=============================");

	}

}
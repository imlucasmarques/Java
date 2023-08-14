import java.util.Random;

public class exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa em Java para preencher um vetor de 1000 posições
		// com valores fornecidos pelo usuário. Imprima no vídeo apenas os
		// números primos armazenados no vetor. Um número é primo quando ele
		// tem apenas 2 divisores (1 e ele mesmo)

		Random gerador = new Random();

		int[] x = new int[10];
		int total;

		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(20);
			System.out.print(x[i] + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < x.length; i++) {
			total = 0;
			for (int j = 2; j < x[i]; j++) {
				
				if (x[i] % j == 0) {
					total++;
					break;
				}
				
	}
			if (total == 0) {
					System.out.print(x[i] + " ");
			}
		}
	}
}
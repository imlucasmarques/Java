import java.util.Scanner;

public class exerc�cio6m�todo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qnt; 

		System.out.print(" Quantas salas de aula h� na universidade? ");
		qnt = teclado.nextInt();
		System.out.println("");

		int salas[] = new int[qnt];

		notas(salas);
	}

	public static void notas(int[] salas) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < salas.length; i++) {
			System.out.print(" Quantos alunos h� na sala " + (i + 1) + " ? ");
			salas[i] = teclado.nextInt();
		}

		System.out.println("");
		media(salas);
	}

	public static void media(int[] salas) {
		// FOR das salas
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < salas.length; i++) {
			System.out.println("");
			System.out.println(" DIGITE AS M�DIAS DE CADA ALUNO DA SALA " + (i + 1));
			double notas[] = new double[salas[i]];
			double media = 0;
			double acima = 0; // alunos acima da m�dia
			double x; // porcentagem de alunos acima da m�dia

			// FOR para para digitar a m�dia de cada aluno de cada sala
			for (int j = 0; j < salas[i]; j++) {
				System.out.print(" M�dia do aluno(a) " + (j + 1) + " da sala " + (i + 1) + " : ");
				notas[j] = teclado.nextDouble();
			}

			// FOR para somar as notas de todos os alunos de uma sala
			for (int k = 0; k < salas[i]; k++) {
				media = media + notas[k];
			}

			media = media / salas[i];

			// FOR para saber quantos alunos est�o acima da media (porcentagem)
			for (int l = 0; l < salas[i]; l++) {
				if (notas[l] > media) {
					acima++;
				}
			}

			// porcentagem de alunos acima da m�dia

			x = acima * 100 / salas[i];

			// m�dia de cada sala

			System.out.println(" A m�dia da sala " + (i + 1) + " � : " + media);

			System.out.println(" N�mero de alunos acima da m�dia : " + acima);

			System.out.println(" Porcentagem de alunos acima da m�dia : " + String.format("%.3f", x) + "%");
		}
	}

}

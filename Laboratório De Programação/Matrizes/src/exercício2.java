import java.util.Random;

public class exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa em Java que preencha uma matriz D10x10 com valores aleat�rios 
		//entre 0 e 1000. Imprima o maior valor armazenado bem como a sua localiza��o (linha 
				//e coluna). Observa��o: caso o maior valor se repetida dentro da matriz, todas as 
				//localiza��es dever�o ser impressas.
		
		Random gerador = new Random();
		int[][] x = new int[3][3];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(" Valor ");
				x[i][j] = gerador.nextInt(0, 20);
				System.out.print(x[i][j] + "\t");
	    }
			System.out.println();
}
	}
}

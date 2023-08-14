import java.util.Scanner;

public class parcial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[5];
		int y[] = new int[5];
		
		preenchimento(x,y);
		
		System.out.println(" O número armazenado na primeira posição do primeiro vetor se repete " + repeticoes(x,y) + " vezes no segundo vetor.");
	}

	public static void preenchimento(int[]x, int[]y) {

		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(" Informe o valor " + (i + 1) + " do array x : ");
			x[i] = teclado.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < y.length; i++) {
			System.out.print(" Informe o valor " + (i + 1) + " do array y : ");
			y[i] = teclado.nextInt();
		}
		
		System.out.println("");

		repeticoes(x,y);
		
	}

	public static int repeticoes(int[]x, int[]y) {
		int aux = 0;
		for(int i = 0; i < y.length; i++) {
			if(x[0] == y[i]) {
				aux++;
			}
		}
		
		return aux;
	
	}
	
}


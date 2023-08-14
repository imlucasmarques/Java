import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		
		int[] x = new int[5];	
		
		preencher(x);
		System.out.println(" soma = " + somar(x));
	}

	public static void preencher(int[] x) {
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < x.length; i++) {
			System.out.println(" Digite o valor: ");
			x[i] = teclado.nextInt();
		}
	}

	public static int somar(int[] x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i]; // total = total + x[i];
		}
		return total;
	}
}

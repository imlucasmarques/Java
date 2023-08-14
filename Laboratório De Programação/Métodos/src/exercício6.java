import java.util.Random;

public class exercício6 {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		
		preencher(x);
		System.out.println(" Antes da ordenação: ");
		imprimir(x);
		ordenar(x);
		System.out.println(" \n\nDepois da ordenação ");
		imprimir(x);
		
	}

	public static void ordenar(int[] x) {
		int aux;
		
		for (int j = 1; j <= x.length; j++) {			
		
		for (int i = 0; i < x.length - 1; i++) {
			if(x[i] > x[i + 1]) {
				aux = x[i];
				x[i] = x[i + 1];
				x[i + 1] = aux;
			}
		}
	}
}
	
	public static void preencher(int[] x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(5, 75);
			
		}
	}

	public static void imprimir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");			
		}
	}
}


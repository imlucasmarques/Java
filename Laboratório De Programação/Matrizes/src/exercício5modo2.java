import java.util.Random;

public class exercício5modo2 {

	public static void main(String[] args) {


			
					int [][] x = new int [4][4];
					
					// preencher a matriz
					
					preencher(x);
			
					// imprimir a matriz antes da troca das diagonais
					System.out.println("Antes da troca:");
					
					imprimir(x);
					
					
					// trocar os elementos das diagonais
					
					trocar(x);
					
					
					// immprimir a matriz após a troca das diagonais
					System.out.println("\nDepois da troca");
					
					imprimir(x);
					
					
		}

		
		public static void preencher(int[][] x) {
			Random gerador = new Random();
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x.length; j++) {
					x[i][j] = gerador.nextInt(20);
				}
			}
			
			
		}
		
		
		public static void trocar(int[][] x) {
			
			int aux;
			for (int i = 0, j = x.length -1; i < x.length; i++, j--) {
				aux = x[i][i];
				x[i][i] = x[i][j];
				x[i][j] = aux;
			
		}
	} 
		
		public static void imprimir(int[][] x) {
			
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x.length; j++) {
					System.out.print(x[i][j] + "\t");
				}
				
				System.out.println();
			}
			
			
		}
	}
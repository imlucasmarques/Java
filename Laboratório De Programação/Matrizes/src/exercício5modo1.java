import java.util.Random;

public class exercício5modo1 {

		public static void main(String[] args) {

			
					Random gerador = new Random() ;
					int [][] x = new int [4][4];
					int aux;
					
					// preencher a matriz
					
					for (int i = 0; i < x.length; i++) {
						for (int j = 0; j < x.length; j++) {
							x[i][j] = gerador.nextInt(20);
						}
					}
			
					// imprimir a matriz antes da troca das diagonais
					System.out.println("Antes da troca:");
				
					for (int i = 0; i < x.length; i++) {
						for (int j = 0; j < x.length; j++) {
							System.out.print(x[i][j] + "\t");
						}
						
						System.out.println();
					}
					
					
					// trocar os elementos das diagonais
					
					for (int i = 0, j = x.length -1; i < x.length; i++, j--) {
						aux = x[i][i];
						x[i][i] = x[i][j];
						x[i][j] = aux;
					}
					
					
					// imprimir a matriz após a troca das diagonais
					System.out.println("\nDepois da troca");
					
					for (int i = 0; i < x.length; i++) {
						for (int j = 0; j < x.length; j++) {
							System.out.print(x[i][j] + "\t");
						}
						
						System.out.println();
					}
					
					
		}

	}


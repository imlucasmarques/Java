import java.util.Scanner;

public class exerc�cio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		//Para o exerc�cio anterior, imprima no v�deo um histograma da varia��o da 
		//temperatura durante a semana. Dever� ser impresso no v�deo uma linha 
		//com uma quantidade de caracteres de tamanho proporcional � 
		//temperatura.
		
				// vari�veis
				double[] temperatura = new double[7];
				String[] dias = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira",
						"Quinta-feira", "Sexta-feira", "Sabado"};
			
				// processamento
				for(int i = 0; i < temperatura.length; i++) {
					System.out.print("Temperatura do(a) " + dias[i] + ": ");
					temperatura[i] = teclado.nextDouble();
				}
					
				
				
				System.out.println();
				for(int i = 0; i < temperatura.length; i++) {
					System.out.print(String.format("%-13s", dias[i]) + " ");
					for(int j = 1; j <= temperatura[i]; j++) {
						System.out.print("*");// j = 1 * j = 2 **
					}
					System.out.println();
				}
				
					}
				
			}
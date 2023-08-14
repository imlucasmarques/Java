import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		//Para o exercício anterior, imprima no vídeo um histograma da variação da 
		//temperatura durante a semana. Deverá ser impresso no vídeo uma linha 
		//com uma quantidade de caracteres de tamanho proporcional à 
		//temperatura.
		
				// variáveis
				double[] temperatura = new double[7];
				String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
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
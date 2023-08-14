import java.util.Scanner;

public class exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		// Escreva um programa que leia a temperatura máxima diária da última 
		// semana (de domingo a sábado). Imprima no vídeo os dias em que a 
		// temperatura esteve acima da média da semana.
		
		// variáveis
		double [] temperatura = new double[7];
		String [] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
		
		double media = 0;  // o valor vai se alterando conforme as rodadas
		
		
		// processamento
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println(" temperatura do(a) " + dias[i] +":");
			temperatura [i] = teclado.nextDouble();
			media = media + temperatura[i]; // no primeiro media, 0x444 = 0
		}
		
		// cálculo da média
			media = media / temperatura.length; // media = media/7;
			System.out.println("média da semana:" + media);
		
		// impressão dos dias da semana com temperatura acima da média
	    for (int i = 0; i < temperatura.length; i++) {
	    	if (temperatura[i] > media) {
	    		System.out.println(dias [i]);
	    	}
	    }
		
	}
	

}


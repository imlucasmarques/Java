import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		// Escreva um programa em Java que preencha um vetor de 1000 posições (não precisa ser 1000)
		// com valores fornecidos pelo usuário. Imprima no vídeo a quantidade de 
		// números pares e ímpares digitados.
		
		int[] x = new int [5];
		int par = 0;
		
		for(int i = 0; i < x.length; i++ ) {
		System.out.println(" valor: ");
		x[i] = teclado.nextInt();
		
		if(x[i] % 2 == 0) {
			par++; // par = par + 1
	
		}
	}

		System.out.println(" total de pares -->" + par);
		System.out.println(" total de ímpares -->" + (x.length - par));

}
}
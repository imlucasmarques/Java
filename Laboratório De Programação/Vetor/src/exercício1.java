import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner (System.in);
	
		// Escreva um programa em Java que preencha um vetor de 1000 posi��es (n�o precisa ser 1000)
		// com valores fornecidos pelo usu�rio. Imprima no v�deo o maior e o menor 
		// valor armazenado.
	
	int [] x = new int[5];
	int maior = 0;
	int menor = 0;
	
	for(int i = 0; i < x.length; i++) {
		System.out.println("valor: ");
		x [i] = teclado.nextInt();
		
		if(x[i] > maior || i == 0) {
			maior = x[i];
		}
		
		if(x[i] < menor || i == 0) {
			menor= x[i];
		}

	}
	
	System.out.println(" maior valor =" + maior);
	System.out.println(" menor valor =" + menor);
	}

}

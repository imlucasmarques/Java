import java.util.Random;
import java.util.Scanner;

public class exerc�cio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escreva um programa em Java que preencha um vetor de 10 posi��es com 
		//n�meros aleat�rios inteiros n�o duplicados.
		
		Scanner teclado = new Scanner (System.in);
	    Random gerador = new Random();
		
	    int qtd;
	    boolean achei;
	    
	    System.out.println(" Quantos n�meros? ");
	    qtd = teclado.nextInt();
	    
	    int[] x = new int [qtd];
	    
	    for (int i = 0; i < x.length; i++) {
	    	x[i] = gerador.nextInt(10);
	    	achei = false;
	    	for(int j = 0; j < i; j++) {
	    		if(x[i] == x[j]) {
	    			achei = true;
	    			break;
	    		}
	    }
	    	if (achei == false) {
	    		System.out.print(x[i] + " ");
	    		i++;
	    
	    }
	    
	    
	    }
	}
}



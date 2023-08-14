import java.util.Random;
import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escreva um programa em Java que preencha um vetor de 10 posições com 
		//números aleatórios inteiros não duplicados.
		
		Scanner teclado = new Scanner (System.in);
	    Random gerador = new Random();
		
	    int qtd;
	    boolean achei;
	    
	    System.out.println(" Quantos números? ");
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



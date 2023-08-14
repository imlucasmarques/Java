
import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();
		
		int[] x = new int[10];
		int n = gerador.nextInt(10);
		
		// 1 - preencher o array
		preenchimento(x);
		
		System.out.println("Antes da ordena��o: \n");
		
		// 2 - imprimir e ordenar
		impressao(x);
		ordenacao(x);
		
		System.out.println(" \n\nDepois da ordena��o: \n ");
		
		// 3 - imprimir ( array j� ordenado )
		impressao(x);
		
		// 4 - procurar o n�mero inteiro "n" no array
		procurar(x,n);
		
		System.out.println("\n\nN�mero inteiro --> " + n);
		boolean encontrado = procurar(x,n); // --> boleana que foi retonarda do m�todo "buscar" (true ou false)
		
		if (encontrado) { // se a bolena retornada for TRUE
			System.out.println( "\nSitua��o do n�mero inteiro: *PRESENTE* ");
		} else { // se a bolena retornada for FALSE
			System.out.println( "\nSitua��o do n�mero inteiro: *AUSENTE* ");
		}
	}

	public static void preenchimento(int[] x) {

		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(10);
			
		}
	}

	public static void impressao(int[] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");			
		}

	}

	public static void ordenacao(int[] x) {

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

	public static boolean procurar(int[] x, int n) {
		
		// o exerc�co pede para achar o elemento central e verificar se o n�mero inteiro e ele s�o... (pr�xima linha)
		// iguais, se sim, retorna. se n�o for, verificar se � maior ou menor. se for maior ou menor, repetir... (pr�xima linha)
		// o processo (achar o central, no caso, agora, nos dois subarrays a direita e esquerda do elemento central[loop com condi��o])... (pr�xima linha)
		// at� achar ou n�o tiver nenhum elemento a mais para verificar.
		
		// elemento central = metade
		// metade = comprimento (ponto final + ponto inicial) / 2
		// final = tamanho do array (no caso fiz pelo �ltimo �ndice 9)
		// inicial = 0
	  
		// f = final
		// i = inicial
		// ec = elemento central
		// e = elemento do array 
		// n = n�mero inteiro gerado aleatoriamente
		
		
			int f = x.length - 1;
		
			int i = 0;
			
		do {
			
				int ec = (i + f)/ 2;
						
				int e = x[ec];
						
				if (n == e) {
				  return true;
				} else if (n > e){
					i = ec;
					if(n == x[x.length - 1]) { // para verificar o �ltimo elemento (�ndice 9)
						return true;
					}
				} else if (n < e) {
					f = ec;
					if(n == x[i]) {  // para verificar o primeiro elemento (�ndice 0)
						return true;
					}
				} 
					
		} while (f - 1 != i && f != i);
				
		return false;
		
	}
	
}
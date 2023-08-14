import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();
		
		int[] x = new int[10];
		int n = gerador.nextInt(10);
		
		// 1 - preencher o array
		preenchimento(x);
		
		System.out.println("Antes da ordenação: \n");
		
		// 2 - imprimir e ordenar
		impressao(x);
		ordenacao(x);
		
		System.out.println(" \n\nDepois da ordenação: \n ");
		
		// 3 - imprimir ( array já ordenado )
		impressao(x);
		
		// 4 - procurar o número inteiro "n" no array com RECURSIVIDADE
		
		System.out.println("\n\nNúmero inteiro --> " + n);
		boolean encontrado = procurar(x,n,0,x.length-1); // --> boleana que foi retonarda do método "buscar" (true ou false)
		
		if (encontrado) { // se a bolena retornada for TRUE
			System.out.println( "\nSituação do número inteiro: *PRESENTE* ");
		} else { // se a bolena retornada for FALSE
			System.out.println( "\nSituação do número inteiro: *AUSENTE* ");
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

	public static boolean procurar(int[] x, int n, int i, int f) {
		
		// o exercíco pede para achar o elemento central e verificar se o número inteiro e ele são... (próxima linha)
		// iguais, se sim, retorna. se não for, verificar se é maior ou menor. se for maior ou menor, repetir... (próxima linha)
		// o processo (achar o central, no caso, agora, nos dois subarrays a direita e esquerda do elemento central[loop com condição])... (próxima linha)
		// até achar ou não tiver nenhum elemento a mais para verificar.
		
		// elemento central = metade
		// metade = comprimento (ponto final + ponto inicial) / 2
		// final = tamanho do array (no caso fiz pelo último índice 9)
		// inicial = 0
	  
		// f = final
		// i = inicial
		// ec = elemento central
		// e = elemento do array 
		// n = número inteiro gerado aleatoriamente
		
			//RECURSIVIDADE
		
			if (i == f || f - 1 == i) { // caso base (condição de procura)
				return false;
			}
			
		
				int ec = (i + f)/ 2;
						
				int e = x[ec];
						
				if (n == e) {
				  return true;
				} else if (n > e){
					i = ec;
					if(n == x[x.length - 1]) { 
						return true;
					}
				} else if (n < e) {
					f = ec;
					if(n == x[i]) {  
						return true;
					}
				} 
				
				return procurar(x,n,i,f);
		
	}
	
}

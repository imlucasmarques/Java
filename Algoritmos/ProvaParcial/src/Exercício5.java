import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int valor1, valor2, valor3, valor4;
		
		System.out.println(" Digite o valor 1 (n�mero inteiro): ");
		valor1 = teclado.nextInt();
		
		System.out.println(" Digite o valor 2 (n�mero inteiro): ");
		valor2 = teclado.nextInt();
		
		System.out.println(" Digite o valor 3 (n�mero inteiro): ");
		valor3 = teclado.nextInt();
		
		System.out.println(" Digite o valor 4 (n�mero inteiro): ");
		valor4 = teclado.nextInt();
		
			 
		if(valor1 < valor2 && valor2 < valor3 && valor3 < valor4) {
			 System.out.println("Os valores est�o em ordem crescente");
		} else if ( valor1 > valor2 && valor2 > valor3 && valor3 > valor4) {
			 System.out.println("Os valores est�o em ordem decrescente");
		} else {
			 System.out.println("Os valores n�o est�o ordenados");
			 
		}
		}
}




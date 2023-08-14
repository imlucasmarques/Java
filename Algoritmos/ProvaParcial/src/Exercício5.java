import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int valor1, valor2, valor3, valor4;
		
		System.out.println(" Digite o valor 1 (número inteiro): ");
		valor1 = teclado.nextInt();
		
		System.out.println(" Digite o valor 2 (número inteiro): ");
		valor2 = teclado.nextInt();
		
		System.out.println(" Digite o valor 3 (número inteiro): ");
		valor3 = teclado.nextInt();
		
		System.out.println(" Digite o valor 4 (número inteiro): ");
		valor4 = teclado.nextInt();
		
			 
		if(valor1 < valor2 && valor2 < valor3 && valor3 < valor4) {
			 System.out.println("Os valores estão em ordem crescente");
		} else if ( valor1 > valor2 && valor2 > valor3 && valor3 > valor4) {
			 System.out.println("Os valores estão em ordem decrescente");
		} else {
			 System.out.println("Os valores não estão ordenados");
			 
		}
		}
}




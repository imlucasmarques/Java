import java.util.Scanner;

public class Calc2 {

	public static void main(String[] args) {
		int valor1, valor2, resultado;
		double divisao;
		Scanner teclado = new Scanner(System.in);
	
	
		System.out.println("Digite o primeiro valor: ");	
	valor1= teclado.nextInt();
	System.out.println("Digite o segundo valor:");
	valor2= teclado.nextInt();
			
	resultado = valor1 + valor2;
	System.out.println("O resultado da soma �:"+ resultado);
	
	resultado = valor1 - valor2;
	System.out.println("O resultado da subtra��o �:" + resultado);
	
	resultado = valor1 * valor2;
	System.out.println("O resultado da multiplica��o �:" + resultado);
	
	resultado = valor1 % valor2;
	System.out.println("O resultado do resto �:" + resultado);

	divisao = (double) valor1 / valor2;
	System.out.println("O resultado da divis�o �:" + divisao );
	}

}

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		int valor, contador, resultado;
		int resposta;
		
		do {
		System.out.println(" Valor: ");
		valor = teclado.nextInt();
		
		contador = 0;
		
		while(contador <= 10) {
			resultado = valor * contador;
			System.out.println(valor + " * " + contador + " = " + resultado);
			contador = contador + 1;
		}
		
			System.out.println(" \nDigite 1 para nova tabuada ou 0 para finalizar:" );
			resposta = teclado.nextInt();
		} while (resposta == 1);
		}

}

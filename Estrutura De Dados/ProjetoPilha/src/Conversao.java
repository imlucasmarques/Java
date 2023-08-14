import java.util.Scanner;
import java.util.Stack;

// ler um valor inteiro e positivo e converter para bin�rio 

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declara��o de var�aveis
		Scanner teclado = new Scanner (System.in);
		Stack<Long> binario = new Stack<>();	// estrutura para criar uma PILHA
		long valor;
		
		// entrada de dados
		System.out.print(" Informe um valor inteiro e positivo: ");
		valor = teclado.nextLong();
		
		while(valor != 0) {
			binario.push(valor % 2);
			valor = valor / 2;
		}
		
		// impress�o do n�mero em bin�rio
		while(!binario.empty()) {
			System.out.print( binario.pop());
		}
	}

}

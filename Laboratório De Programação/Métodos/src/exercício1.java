import java.util.Scanner;

public class exercício1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int valor;
		
		System.out.print(" Digite o valor inteiro e positivo: ");
		valor = teclado.nextInt();
		
		if(valor <= 0) {
			System.out.println(" O valor deve ser inteiro e positivo ");
		} else {
			imprimir(valor); // argumento --> valor que será enviado ao método
		}
	}
	
	public static void imprimir(int valor) {
		for(int cont = 1; cont <= valor; cont++) {
			if (valor % cont == 0) {
				System.out.println(cont);
			}
		}
	}
}


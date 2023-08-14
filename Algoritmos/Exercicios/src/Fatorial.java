import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int valor, contador;
		int fatorial;
		
		//entrada de dados
		do { System.out.println(" valor inteiro e positivo: ");
		valor = teclado.nextInt();
		if (valor < 0) {
			System.out.println(" Você pode digitar um valor inteiro e positivo!!");
		
		}
		
		} while (valor < 0);
		// cálculo e a impressão do fatorial
		contador = 1;
		fatorial = 1;
		while (contador <= valor) {
			fatorial = fatorial * contador;
			contador = contador + 1;
		}
		System.out.println(valor + "! = " + fatorial);
	}

}

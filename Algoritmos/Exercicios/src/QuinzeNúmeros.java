import java.util.Scanner;

public class QuinzeNúmeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int valor;
		int contador = 1;
		int maior = 0;
		
		while(contador <= 5) {
		System.out.println(" Valor: ");
		valor = teclado.nextInt();
		if (valor > maior || contador == 1 ) {
			maior = valor;
		}
			contador = contador + 1;
		}
			System.out.println(" maior = " + maior);
	}

}

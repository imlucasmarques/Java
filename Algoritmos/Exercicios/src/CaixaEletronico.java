import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int saque, nota100, nota50, nota20, nota10, nota5, nota1, quantidade;
		
		System.out.println(" Informe o valor de saque : ");
		saque = teclado.nextInt();
		
		nota100 = saque/100;
		nota50 = saque % 100 / 50;
		nota20 = saque % 100 % 50 / 20;
		nota10 = saque % 100 % 50 % 20 / 10;
		nota5 = saque % 100 % 50 % 20 % 10 / 5;
		nota1 = saque % 100 % 50 % 20 % 10 % 5 / 1;
		
		System.out.println(" R$100: " + nota100);
		System.out.println(" R$50: " + nota50);
		System.out.println(" R$20: " + nota20);
		System.out.println(" R$10: " + nota10);
		System.out.println(" R$5: " + nota5);
		System.out.println(" R$1: " + nota1);
		
		
		
		
	}

}

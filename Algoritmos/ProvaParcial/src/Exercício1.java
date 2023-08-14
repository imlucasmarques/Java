import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		double montante, capital, taxa, tempo;
		
		System.out.println(" Digite o capital que deseja investir: ");
		capital = teclado.nextDouble();
		
		System.out.println(" Digite a taxa de juros: ");
		taxa = teclado.nextDouble();
		
		System.out.println(" Digite o tempo (em meses): ");
		tempo = teclado.nextDouble();
		
		montante = capital * Math.pow(1 + (taxa/100), tempo);
		
		System.out.println(" O montante da sua aplicação é : " + montante);
	}

}

//criar um programa para imprimir no v�deo a �re e o per�metro de um ret�ngulo

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declara��o das vari�veis
		Scanner teclado = new Scanner(System.in);
		double base, altura, area, perimetro;
		
		// entrada de dados
		System.out.println(" digite o valor da base:");
		base = teclado.nextDouble();
		
		System.out.println(" digite o valor da altura:");
		altura = teclado.nextDouble();
		
		// processamento e sa�da de dados
		area = base * altura;
		System.out.println(" O valor da �rea �:" + String.format("%.2f", area));
		
		perimetro = (2 * base) + (2 * altura);
		System.out.println(" O valor do per�metro �:" + String.format("%.2f", perimetro));
	}

}

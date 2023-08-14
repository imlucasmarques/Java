//criar um programa para imprimir no vídeo a áre e o perímetro de um retângulo

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double base, altura, area, perimetro;
		
		// entrada de dados
		System.out.println(" digite o valor da base:");
		base = teclado.nextDouble();
		
		System.out.println(" digite o valor da altura:");
		altura = teclado.nextDouble();
		
		// processamento e saída de dados
		area = base * altura;
		System.out.println(" O valor da área é:" + String.format("%.2f", area));
		
		perimetro = (2 * base) + (2 * altura);
		System.out.println(" O valor do perímetro é:" + String.format("%.2f", perimetro));
	}

}

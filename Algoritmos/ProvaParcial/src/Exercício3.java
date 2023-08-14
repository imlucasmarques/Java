import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		double consumidor, fabrica, distribuidor, imposto;
		
		System.out.println(" Digite o custo de fabrica: ");
		fabrica = teclado.nextDouble();
		
		 
		if (fabrica >= 0 && fabrica <= 12000) {
			distribuidor = 0.05 * fabrica;
			consumidor = fabrica + distribuidor;
			System.out.println(" O custo do consumidor é: " + consumidor);
		} else if (fabrica > 12000 && fabrica <= 25000) {
			distribuidor = 0.10 * fabrica;
			imposto = 0.15 * fabrica;
			consumidor = fabrica + distribuidor + imposto;
			System.out.println(" O custo do consumidor é: " + consumidor);
		} else if (fabrica > 25000) {
			distribuidor = 0.15 * fabrica;
			imposto = 0.20 * fabrica;
			consumidor = fabrica + distribuidor + imposto;
			System.out.println(" O custo do consumidor é: " + consumidor);
		}
	}

}

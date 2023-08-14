import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner (System.in);
			
			double peso, altura, IMC;
			
			System.out.println(" Digite o valor de seu peso: ");
			peso = teclado.nextDouble();
			
			System.out.println(" Digite o valor de sua altura : ");
			altura = teclado.nextDouble();
			
			IMC = peso / (altura * altura);
		
			if (IMC < 25) { 
				
				System.out.println(" Seu IMC está NORMAL.");
			} else {
				System.out.println(" Você está acima do peso. ");
			}
	}

}

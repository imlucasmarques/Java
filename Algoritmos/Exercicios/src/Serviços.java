import java.util.Scanner;

public class Servi�os {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int diaria;
		double conta;
		
		System.out.println(" Digite o n�mero de di�rias : ");
		diaria = teclado.nextInt();
		
		if (diaria > 15){
			conta = 150 * diaria + 15.5 * diaria;
		
		} else if (diaria == 15){
			conta = (150 + 36) * diaria;
		
		} else {
			conta = (150 + 58) * diaria;
		}
		
		System.out.println(" O valor da conta � = R$ " + conta);
	
	
		
		}

}

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		double renda, imposto;
		
		System.out.println(" Renda anual --> R$");
		renda = teclado.nextDouble();
		
		if(renda <= 10000) {
			System.out.println(" Isento");
		} else {
			if(renda <= 25000) {
				imposto = renda * 10.35 / 100;
			}else if(renda <= 5000) {
				imposto = renda * 25.42 / 100;
			}else {
				imposto = renda * 29.75 / 100;
			}
			
			System.out.println(" Imposto a pagar R$ " + imposto );
		}
		
	}

}

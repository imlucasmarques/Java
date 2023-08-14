import java.util.Scanner;

public class Aprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);
			
			double nota1, nota2, media;
			
			System.out.println(" Digite sua primeira nota: ");
			nota1 = teclado.nextDouble();
			
			System.out.println(" Digite sua segunda nota: ");
			nota2 = teclado.nextDouble();
			
			media = (nota1 + nota2) /2;
			System.out.println(" A sua média é: " + media );
			
			if(media >=7) {
			System.out.println(" Você está aprovado!");
			} else {
			System.out.println(" Você está reprovado");
			}
				
	}
	

}

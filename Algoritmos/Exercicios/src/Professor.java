import java.util.Scanner;

public class Professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		double prova1, prova2, trabalho1, trabalho2, media1, media2, media3;
		
		System.out.println(" Nota da prova 1: ");
		prova1 = teclado.nextDouble();
		
		System.out.println(" Nota da prova 2: ");
		prova2 = teclado.nextDouble();
		
		media1 = (prova1 + prova2) /2;
		
		System.out.println(" Nota do trabalho 1: ");
		trabalho1 = teclado.nextDouble();
		
		System.out.println(" Nota do trabalho 2: ");
		trabalho2 = teclado.nextDouble();
		
		media2 = (trabalho1 + trabalho2) /2;
		
		media3= 0.7 * media1 + 0.3 * media2;
		 
		if(media3 >= 7) {
		System.out.println(" Aprovado ");
		} else {
		System.out.println(" Reprovado ");
		}
		
		
	}

}

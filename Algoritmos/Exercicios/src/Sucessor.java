import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int x, sucessor;
		
		System.out.println(" Digite um número entre 0 e 60 : ");
		x = teclado.nextInt();
		
		sucessor = (x+1)%61;
		System.out.println(" O sucessor desse número é " + sucessor );
		
	}

}

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String palavra, aux = "";
		
		
		System.out.print(" Digite uma palavra: ");
		palavra = teclado.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			aux += palavra.charAt(i);
			System.out.println(aux);
		}
		
		
	}

}

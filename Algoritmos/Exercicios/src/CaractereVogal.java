import java.util.Scanner;

public class CaractereVogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String letra;
		
		System.out.println(" letra --> ");
		letra = teclado.next();
	 
		letra = letra.toLowerCase(); //converte a string para min�sculo
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println(" � uma vogal ");
		} else {
			System.out.println(" N�o � uma vogal ");
		}
			}

}

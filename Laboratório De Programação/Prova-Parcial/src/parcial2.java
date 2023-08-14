
import java.util.Scanner;
public class parcial2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	String frase, invertida = "";
	
	System.out.println("Digite a frase que deseja inverter : ");
	System.out.println("");
	frase = teclado.nextLine();
	
	invertida = inverter(frase, invertida);
	
	System.out.println("");
	System.out.println( invertida );
	
	}
	
	public static String inverter(String frase, String invertida) {
		for(int i = (frase.length()-1); i >= 0; i--) {
			invertida += frase.charAt(i);
		}
		
		return invertida;
	}

}
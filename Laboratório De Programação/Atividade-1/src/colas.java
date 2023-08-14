
import java.util.Scanner;
public class colas {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	String frase, invertida = "";
	
	System.out.println(" Digite a frase que deseja inverter : ");
	
	frase = teclado.nextLine();
	invertida = inversor(frase, invertida);
	
	System.out.println(invertida);
	}
	
	public static String inversor(String frase, String invertida) {
		for(int i = (frase.length()-1); i >= 0; i--) {
			invertida += frase.charAt(i);
		}
		return invertida;
	}
}
import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String palavra, invertida = "";
		
		System.out.println("palavra --> ");
		palavra = teclado.next();
		
		for(int i = palavra.length() - 1; i >= 0; i--) {
			invertida += palavra.charAt(i);
		}
		
		//verifica se as strings são idênticas
		if (palavra.equalsIgnoreCase(invertida)) {
			System.out.println("são palíndromos");
		} else {
			System.out.println("não são palíndromos");
		}
	}

}

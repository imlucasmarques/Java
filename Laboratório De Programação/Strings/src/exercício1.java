import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String palavra, invertida = "";
		
		System.out.println("palavra --> ");
		palavra = teclado.next();
		
		for(int i = palavra.length() - 1; i >= 0; i--) {
			invertida += palavra.charAt(i);
		}
		
		//verifica se as strings s�o id�nticas
		if (palavra.equalsIgnoreCase(invertida)) {
			System.out.println("s�o pal�ndromos");
		} else {
			System.out.println("n�o s�o pal�ndromos");
		}
	}

}

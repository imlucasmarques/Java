import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String nome;
		double altura, peso;
		int genero;
		
		System.out.println(" Digite seu nome : ");
		nome = teclado.next();
		
		System.out.println(" Digite sua altura (em metros) : ");
		altura = teclado.nextDouble();
		
		System.out.println(" Digite 1 para masculino ou 2 para feminino : ");
		genero = teclado.nextInt();
		
		if (genero < 1 || genero > 2) {
			System.out.println(" Genêro inválido para esse programa");
		} else {
			if (genero == 1) {
				peso = 72.7* altura - 58;
			} else {
				peso = 61.1* altura - 44.7;
			}
			System.out.println(nome +", seu peso ideal é " + peso);
		}
	}


}

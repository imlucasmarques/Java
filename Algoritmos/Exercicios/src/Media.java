import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declara��o das vari�veis
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		// entrada de dados
		System.out.println(" nota1 = ");
		nota1 = teclado.nextDouble();
		
		System.out.println(" nota2 = ");
		nota2 = teclado.nextDouble();
		
		System.out.println(" nota3 = ");
		nota3 = teclado.nextDouble();
		
		// processamento de dados
		media = (nota1 + nota2 + nota3) / 3;
		
		// sa�da de dados
		System.out.println(" media = " + media);
		
				
				
	}

}

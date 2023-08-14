import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		 int valor1, valor2;
		 
		 System.out.println(" 1o valor -->");
		 valor1 = teclado.nextInt();
		 
		 System.out.println(" 2o valor -->");
		 valor2 = teclado.nextInt();
		 
		 if(valor1 < valor2) {
			 while(valor1 <= valor2) {
				 System.out.println(valor1);
				 valor1 = valor1 + 1;
			 }
		 } else { 
			 System.out.println(" O primeiro valor deve ser menor que o segundo ");
		 }
	}

}

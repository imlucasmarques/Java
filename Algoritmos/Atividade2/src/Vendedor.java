import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		double vendas, salario;
		
		System.out.println(" Digite o seu valor total de vendas : ");
		vendas = teclado.nextDouble();
		
		if(vendas <=25000) {
			salario = 0.175 * vendas;
		}else {
			salario = 0.1885 * vendas;
		}
		
		System.out.println(" O salário do vendedor é = R$ " + salario);
	}

}

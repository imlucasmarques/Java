import java.util.Scanner;

public class BaseBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner (System.in);
			
			int binario, m, c, d, u, decimal;
			
			System.out.println(" binário -->");
			binario = teclado.nextInt();
			
			m = binario/1000;
			c = binario % 1000 / 100;
			d = binario % 100 / 10;
			u = binario % 10;
			
			decimal = m*8 + c*4 + d*2 + u*1;
			
			System.out.println(" decimal --> 1" + decimal );
			
			
	}

}

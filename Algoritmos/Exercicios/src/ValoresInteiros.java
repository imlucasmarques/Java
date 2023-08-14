import java.util.Scanner;

public class ValoresInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.println(" primeiro valor -->");
		x = teclado.nextInt();
		
		System.out.println(" segundo valor -->");
		y = teclado.nextInt();
		
		System.out.println(" terceiro valor -->");
		z = teclado.nextInt();
		
		if(x==y || x==z || y==z) {
			System.out.println(" os valores devem ser diferentes ");
		} else {
			if(x<y && x<z) {
				System.out.println(" menor valor = " + x );
			} else if (x<z) {
				System.out.println(" menor valor = " + y );
			} else {
				System.out.println(" menor valor = " + z );
			}
		}
	}
	

}

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double x,y,u,w,q,z;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println(" Digite o valor de x:");
			
			x= teclado.nextDouble();
			
			System.out.println(" Digite o valor de y:");
			
			y= teclado.nextDouble();
			
			System.out.println(" Digite o valor de u:");
			
			u= teclado.nextDouble();
			
			System.out.println(" Digite o valor de w:");
			
			w= teclado.nextDouble();
			
			System.out.println(" Digite o valor de q:");
			
			q= teclado.nextDouble();
			
			z= (x+y) /(u+w/q);
					
			System.out.println("O valor de sua operação é:" + z);
					
	}

}

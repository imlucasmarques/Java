import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner (System.in);
	
	double p1x, p1y, distancia1 ;
	double p2x, p2y, distancia2;
	
	System.out.println(" Coordenada x do ponto 1: ");
	p1x = teclado.nextDouble();
	
	System.out.println(" Coordenada y do ponto 1: ");
	p1y = teclado.nextDouble();
	
	System.out.println(" Coordenada x do ponto 2: ");
	p2x = teclado.nextDouble();
	
	System.out.println(" Coordenada y do ponto 2: ");
	p2y = teclado.nextDouble();
	
	distancia1 = Math.sqrt( p1x * p1x + p1y * p1y );
	distancia2 = Math.sqrt( p2x * p2x + p2y * p2y );
	
	if (distancia1 < distancia2) {
	System.out.println(" Ponto 1 mais próximo da origem ");
	} else {
	System.out.println(" Ponto 2 mais próximo da origem ");
	}
	
	
	
	

	}

}

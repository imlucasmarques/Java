import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int numero, n1, n2, n3, n4, reverso;
		
		System.out.print("Digite o n�mero desejado --> ");
		numero = teclado.nextInt();
		
		while(numero < 0 || !(numero < 10000 && numero > 999)) {
			System.out.println("");
			System.out.println("N�mero inv�lido.");
			System.out.println("");
			System.out.print("Digite o n�mero desejado --> ");
			numero = teclado.nextInt();
		}
		
		n1 = numero/1000;
		n2 = (numero%1000)/100;
		n3 = ((numero%1000)%100)/10;
		n4 = numero%10;
		
		reverso = n4*1000+n3*100+n2*10+n1*1;
		
		if(reverso == numero) {
			System.out.println("Este n�mero � pal�ndromo.");
		}else {
			System.out.println("Este n�mero n�o � pal�ndromo.");
		}
		
	}
}

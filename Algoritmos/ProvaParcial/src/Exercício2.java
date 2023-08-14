import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int A, B, C, branco, total;
		
		System.out.println(" Informe a quantidade de votos na chapa A: ");
		A = teclado.nextInt();
		
		System.out.println(" Informe a quantidade de votos na chapa B: ");
		B = teclado.nextInt();
		
		System.out.println(" Informe a quantidade de votos na chapa C: ");
		C = teclado.nextInt();
		
		System.out.println(" Informe a quantidade de votos em branco:");
		branco = teclado.nextInt();
		
		total = A + B + C + branco;
		System.out.println(" O total de alunos que votaram: " + total);
		
		if(A > B && A > C && B > C ) {
			System.out.println(" Chapa vencedora: A ");
			System.out.println(" Chapa perdedora: C");
		} else if (A > B && A > C && C > B) {
			System.out.println(" Chapa vencedora: A ");
			System.out.println(" Chapa perdedora: B ");
		} else if (B > A && B > C && A > C) {
			System.out.println(" Chapa vencedora: B ");
			System.out.println(" Chapa perdedora: C ");
		} else if (B > A && B > C && C > A) {
			System.out.println(" Chapa vencedora: B ");
			System.out.println(" Chapa perdedora: A ");
		} else if (C > A && C > B && B > A) {
			System.out.println(" Chapa vencedora: C ");
			System.out.println(" Chapa perdedora: A ");
		} else if (C > A && C > B && A > B) {
			System.out.println(" Chapa vencedora: C ");
			System.out.println(" Chapa perdedora: B ");
		}
		
		
	}

}

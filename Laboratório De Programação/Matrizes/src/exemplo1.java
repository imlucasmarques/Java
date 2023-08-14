import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[][] x = new int[3][3];
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.print(" Valor ");
				x[i][j] = teclado.nextInt();
			}
		}
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			
			System.out.println();
		}

}
}

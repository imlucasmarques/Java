import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner teclado = new Scanner(System.in);
		Aluno[] aluno = new Aluno[3];
		
			// entrada de dados
			for(int i = 0; i < aluno.length; i++) {
				aluno[i] = new Aluno();
				System.out.println("RA --> ");
				aluno[i].ra = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Nome --> ");
				aluno[i].nome = teclado.nextLine();
				System.out.println("Nota 1 --> ");
				aluno[i].nota1 =teclado.nextDouble();
				System.out.println("Nota 2 --> ");
				aluno[i].nota2 =teclado.nextDouble();
				System.out.println();
			}
			
			// imprimir o nome do aluno, a média e a situação
			for(int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i].ra + "   \t" + aluno[i].nome + "      \t" + aluno[i].nota1 + "   \t" + aluno[i].nota2 + "   \t" + String.format("%.2f", aluno[i].calcularMedia()) );
	}

		
	

}
}

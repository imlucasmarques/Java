import java.util.Scanner;

public class SalárioProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner (System.in);
			
			int aulas;
			double valor, SB, HA, DSR, salario;
			
			System.out.println(" Digite a quantidade de aulas semanais do professor : ");
			aulas = teclado.nextInt();
			
			System.out.println(" Digite o valor de cada aula do professor : ");
			valor = teclado.nextDouble();
			
			SB = aulas * 4.5 * valor;
			
			HA = 0.05 * SB;
			
			DSR = (SB + HA)/6;
			
			salario = SB + HA + DSR;
			
			System.out.println(" O valor do salário do professor é : R$ " + salario);
			
			
			
			
			
	}

}

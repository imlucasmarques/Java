import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	 Scanner teclado = new Scanner (System.in);
	 
	 String nome;
	 int nascimento, ingresso, idade, tempo;
	 
	 System.out.println(" Digite o seu nome: ");
	 nome = teclado.next();
	 
	 System.out.println(" Digite o seu ano de nascimento: ");
	 nascimento = teclado.nextInt();
	 
	 System.out.println(" Digite o ano de ingresso na empresa: ");
	 ingresso = teclado.nextInt();
	 
	 tempo = 2022 - ingresso;
	 idade = 2022 - nascimento;
	 
	 System.out.println("" + nome );
	 System.out.println(" Idade: " + idade);
	 System.out.println(" Tempo de trabalho na empresa: " + tempo);
	 
	 if(idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Não requerer");
	}

}
}

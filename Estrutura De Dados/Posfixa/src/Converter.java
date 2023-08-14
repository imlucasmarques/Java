import java.util.Scanner;
import java.util.Stack;

public class Converter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String expressao, posfixa;

		System.out.println("Express�o --> ");
		expressao = sc.nextLine();

		posfixa = converter(expressao);

		System.out.println(posfixa);

	}

	private static String converter(String expressao) {
		Stack<Character> pilha = new Stack<Character>();
		String posfixa = "";
		char ch;

		for (int i = 0; i < expressao.length(); i++) {
			ch = expressao.charAt(i); // charAt eh posicao
			if (ch != ' ') {
				switch (ch) {
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
					while (!pilha.isEmpty() && prioridade(pilha.peek()) >= prioridade(ch)) {
						posfixa += pilha.pop();
					}
					pilha.push(ch);
					break;
				case '(':
					pilha.push(ch);
					break;
				case ')':
					while (pilha.peek() != '(') {
						posfixa += pilha.pop();
					}
					pilha.pop();
					break;
				default: // tipo um else, qdo nao for nenhum desses
					posfixa += ch;

				}
			}

		}

		// ser� que tem algu�m na pilha?

		while (!pilha.isEmpty()) {
			posfixa += pilha.pop();
		}

		return posfixa;
	}

	private static int prioridade(char ch) {
		int p = 0;
		switch (ch) {
		case '(':
			p = 1;
			break;
		case '+':
		case '-':
			p = 2;
			break;
		case '*':
		case '/':
		case '%':
			p = 3;
		}
		return p;
	}
}
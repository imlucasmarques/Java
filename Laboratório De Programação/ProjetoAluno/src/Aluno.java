
public class Aluno {

	//atributos ou propriedade ou vari�vel de inst�ncia (= objeto)
	int ra;
	String nome;
	double nota1;
	double nota2;

	//m�todo para calcular e retornar a m�dia
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

	//m�todo para retornar a situa��o (aprovado ou reprovado) do aluno
	public String situacao() {
		return (calcularMedia() > 7.0 ? "Aprovado" : "Reprovado");
	}
}


public class Aluno {

	//atributos ou propriedade ou variável de instância (= objeto)
	int ra;
	String nome;
	double nota1;
	double nota2;

	//método para calcular e retornar a média
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

	//método para retornar a situação (aprovado ou reprovado) do aluno
	public String situacao() {
		return (calcularMedia() > 7.0 ? "Aprovado" : "Reprovado");
	}
}

public class Paciente {

	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private double quadril;

	// construtor:

	public Paciente(String nome, int idade, double peso, double altura, double quadril) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
	}

	public Paciente(String nome) {
		this.nome = nome;
	}
	
	// m�todo para calcular e retornar a frequ�ncia m�xima

	public int frequenciaMaxima() { // todo metodo tem (), td metodo � um bloco de c�digo
		return 220 - idade;
	}

	// m�todo para calcular e retornar a frequ�ncia alvo

	public double[] frequenciaAlvo() { // frequenciaAlvo � o nome do m�todo
		double[] alvo = new double[2];
		alvo[0] = frequenciaMaxima() * 0.5;
		alvo[1] = frequenciaMaxima() * 0.85;
		return alvo;

	}

	// m�todo para calcular e retornar o IMC

	public double calcularIMC() {

		return peso / (altura * altura);
	}

	// m�todo para calcular e retornar o BAI

	public double calcularBAI() {

		return quadril / (altura * Math.sqrt(altura)) - 18;
	}

	// toString() -- se nao usarmos o to string, na hora de impressao sairia s� o
	// endereco de memoria, por ser objeto

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "IMC: " + String.format("%.2f", calcularIMC()) + "\n";
		aux += "BAI: " + String.format("%.2f", calcularBAI()) + "\n";
		aux += "Frequ�ncia M�xima: " + frequenciaMaxima() + "\n";
		double[] alvo = frequenciaAlvo();
		aux += "Frequ�ncia alvo: " + alvo[0] + " -> " + alvo[1] + "\n";
		return aux;

	}

	// equals()

	@Override
	public boolean equals(Object obj) {

		Paciente paciente = (Paciente) obj;
		if (paciente.nome.equalsIgnoreCase(nome)) {
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

}
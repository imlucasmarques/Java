
public class Professor {

	String nome;
	String cpf;
	int totalDeAulas;
	double valorDaAula;
	
	// método para calcular e retornar o valor do salário mensal
	
	public double calcularSalario() {
		
		double sb, ha, dsr, salario;
		
		sb = totalDeAulas * 4.5 * valorDaAula;
		
		ha = sb * 5 / 100;
		
		dsr = (sb + ha) / 6;
		
		salario = sb + ha + dsr;
		
		return salario;
	}
	
	//metodo para retornar os dados do professor
	
	public String getDados() {
		String aux = "";
		
		aux += " Nome: " + nome + "\n";
		aux += " CPF: " + cpf + "\n";
		aux += " Salário: R$ " + String.format("%.2f", calcularSalario()) + "\n";
		
		return aux;
		
	}

}

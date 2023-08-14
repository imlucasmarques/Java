
public class Cliente {

	// atributos dos clientes da loja de alguel de carros
	
	String nome;
	String cpf;
	int tempo;
	
	public double calcularaluguel() {
		
		double aluguel;
		
		aluguel = 0.50 * tempo;
		
		return aluguel;
	}
	
	public String getDados() {
		String aux = "";
		
		aux += " Nome: " + nome + "\n";
		aux += " Valor do aluguel: R$ " + String.format("%.2f", calcularaluguel()) + "\n";
		
		return aux;
}

	public double getSalario() {
		
		double Aux = 0;
		
		Aux += calcularaluguel();
		
		return Aux;
	}
}


public class Paciente {

	// atributos
	
	String nome;
	int idade;
	
	// método p calcular e retornar a frequência
	
	public int frequenciaMaxima(){
		return 220 -idade;
	}
	
	// método p calcular e retornar a frequência alvo
	
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		
		alvo[0] = frequenciaMaxima() * 0.5;
		alvo[1] = frequenciaMaxima() * 0.85;
		return alvo;
	}
}


public class Veiculo {

	String placa;
	String marca;
	
	// método construtor para inicializar os atributos
	
	public Veiculo(String p, String m) {
		placa = p;
		marca = m;
	}
	
	public String toString() {
		return placa + "/n" + marca;
	}
	
	public boolean equals (Object obj) {
		Veiculo v = (Veiculo) obj;
		if(v.placa.equals(placa)) {
			return true;
		}
		return false;
	}
}

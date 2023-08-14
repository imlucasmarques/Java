
public class Reserva {

	String nome;
	String telefone;
	String pagamento; // a vista ou parcelado

	public String getDados() {
		
		String aux = "";
		
		aux += " Nome: " + nome + "\n";
		aux += " Telefone: " + telefone + "\n";
		aux += " Forma de pagamento: " + pagamento + "\n";
		
		return aux;
		
	}
}

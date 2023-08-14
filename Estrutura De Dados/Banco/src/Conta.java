
public class Conta {

	String nome;
	double saldo;
	
	//método para sacar um valor da conta
	
	public void sacar (double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
}

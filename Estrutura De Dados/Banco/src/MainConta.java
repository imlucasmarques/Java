
public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.nome = "Selmini";
		conta.saldo = 50;
		conta.depositar(100);
		conta.sacar(30);
		
		System.out.println(conta.saldo);
	}

}

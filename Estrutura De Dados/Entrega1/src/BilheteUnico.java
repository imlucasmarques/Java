
public class BilheteUnico {

	// atributos privados
	
		private int numero;
	    private double saldo;
	    private double valorDaTarifa;
	    private Usuario usuario;

	 // construtor
	    
	    public BilheteUnico(int numero, double saldo, double valorDaTarifa, Usuario usuario) {
	        this.numero = numero;
	        this.saldo = saldo;
	        this.valorDaTarifa = valorDaTarifa;
	        this.usuario = usuario;
	    }

	    public BilheteUnico(Usuario u) {
			// TODO Auto-generated constructor stub
		}
	 // get e set
	    
	    public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getValorDaTarifa() {
			return valorDaTarifa;
		}

		public void setValorDaTarifa(double valorDaTarifa) {
			this.valorDaTarifa = valorDaTarifa;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

	    public boolean passarNaCatraca() {
	       
	    	if (valorDaTarifa > saldo) {
	            return false;
	        } else {
	            this.saldo -= valorDaTarifa;

	            return true;
	        }
	    }

	 // método para carregar o bilhete
	    
	    public void carregarBilhete(double recarga) {
	        if (recarga <= 0) {
	        	 this.saldo += recarga;
	        	 return;
	        }
	    }
	    
	 // métodos toString() e equals()
		 
		@Override
		public String toString() {
			String aux = "";
			aux += "Número: " + numero + "\n";
			aux += "Saldo: " + saldo + "\n";
			aux += "Usuário: " + usuario  + "\n";
			return aux;
		}

		@Override
		public boolean equals(Object obj) {
			BilheteUnico bilhete = (BilheteUnico) obj;
			if (bilhete.numero == this.numero && bilhete.usuario == this.usuario) {
				return true;
			}
			return false;
		}
}



public class BilheteUnico {
   
	// atributos 
	
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

    // get & set
    
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

    public double getSaldo() {
        return saldo;
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

    public void carregarBilhete(double recarga) {
        if (recarga <= 0) {
            return;
        }

        this.saldo += recarga;
    }
    
    public boolean passarNaCatraca() {
        
    	if (valorDaTarifa > saldo) {
            return false;
        } else {
            this.saldo -= valorDaTarifa;

            return true;
        }
    }

    // toString e equals
    
    @Override
	public String toString() {
		String aux = "";
		aux += "Número: " + numero + "\n";
		aux += "Saldo: " + saldo + "\n";
		aux += "Usuário: " + usuario  + "\n";
		return aux;
	}

    @Override
    public boolean equals(Object object) {
        return (object instanceof BilheteUnico) && ((BilheteUnico) object).numero == this.numero
                || ((BilheteUnico) object).usuario == this.usuario;
    }

    
}
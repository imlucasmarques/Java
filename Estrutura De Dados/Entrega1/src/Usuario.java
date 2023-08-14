
public class Usuario {

	// atributos privados
	
	private String nome;
    private String cpf;
    private String tipoDeTarifa;

    // construtor
    
    public Usuario(String nome, String cpf, String tipoDeTarifa) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoDeTarifa = tipoDeTarifa;
    }

    // get e set
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoDeTarifa() {
        return tipoDeTarifa;
    }

    public void setTipoDeTarifa(String tipoDeTarifa) {
        this.tipoDeTarifa = tipoDeTarifa;
    }

 // métodos toString() e equals()

 	@Override
 	public String toString() {
 		String aux = "";
 		aux += "Nome: " + nome + "\n";
 		aux += "CPF: " + cpf + "\n";
 		return aux;
 	}

 	@Override
	public boolean equals(Object obj) {
		Usuario usuario = (Usuario) obj;
		if (usuario.cpf.equalsIgnoreCase(cpf)) {
			return true;
		}
		return false;
	}
}

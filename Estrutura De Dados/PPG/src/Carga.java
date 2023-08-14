public class Carga {
    String cnpj;
    String nomeEmpresa;
    String destinoCarga;
    double pesoTotal; 

    public Carga(String cnpjEmpresa, String nomeEmpresa, String destinoCarga, double pesoTotal) {
        this.cnpj = cnpjEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.destinoCarga = destinoCarga;
        this.pesoTotal = pesoTotal;
    }
    
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getDestinoCarga() {
		return destinoCarga;
	}

	public void setDestinoCarga(String destinoCarga) {
		this.destinoCarga = destinoCarga;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	@Override
    public String toString() {
		String aux = "";
		aux += "Nome da empresa: " + nomeEmpresa + "\n";
		aux += "CNPJ: " + cnpj + "\n";
		aux += "Peso total da carga: " + pesoTotal  + "\n";
		aux += "Destino da carga: " + destinoCarga  + "\n";
		return aux;	

    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass()) && ((Carga) obj).cnpj.equals(this.cnpj);
    }

}
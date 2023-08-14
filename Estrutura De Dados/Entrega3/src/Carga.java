

public class Carga {
		  
		// atributos

		 private String cnpj;
		 private String nomeEmpresa;
		 private String destinoCarga;
		 private double pesoTotal; 
		 
		  // construtor
		   
		    public Carga() {
		        
		    }
		    
		 // get & sets
		    
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

			// toString & equals

			@Override
		    public String toString() {
				String aux = "";
				aux += "Nome da empresa: " + nomeEmpresa + "\n";
				aux += "CNPJ: " + cnpj + "\n";
				aux += "Peso total da carga: " + pesoTotal  + "\n";
				aux += "Destino da carga: " + destinoCarga  + "\n";
				return aux;	

		    }
	
}

package Adega;

public class Vinho {

	private String produto;
	private int safra;
	
	public Vinho(String produto, int safra) {
		this.produto = produto;
		this.safra = safra;
	}

	@Override
	public String toString() {
		return produto + "\n" + safra + "\n";
		
	}
	
	
	

	
	
}

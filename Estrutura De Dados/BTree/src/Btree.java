
public class Btree<T extends Comparable<T>> {
	private No<T> raiz;
	
	// inserir um n� na �rvore bin�ria de busca
	public void inserir(T dado) {
		if(raiz == null) {
			raiz = new No<>(dado);
		} else {
			raiz.inserirNo(dado);
		}
	}
	
	// m�todo para fazer o percurso pr�-ordem
	public String preOrdem() {
		return preOrdem(raiz);
	}
	
	private String preOrdem(No<T> raiz) {
		String aux = "";
		if(raiz == null) {
			return "";
		}
		
		aux += raiz.getDado() + "\n";
		aux += preOrdem(raiz.getEsq());
		aux += preOrdem(raiz.getDir());
		return aux;
	}

	// m�todo para fazer o percurso em-ordem
	public String emOrdem() {
		return emOrdem(raiz);
	}
	
	private String emOrdem(No<T> raiz) {
		String aux = "";
		if(raiz == null) {
			return "";
		}
		
		aux += emOrdem(raiz.getEsq());
		aux += raiz.getDado() + "\n";		
		aux += emOrdem(raiz.getDir());
		return aux;
	}
	
	// m�todo para fazer o percurso p�s-ordem
	public String posOrdem() {
		return posOrdem(raiz);
	}
	
	private String posOrdem(No<T> raiz) {
		String aux = "";
		if(raiz == null) {
			return "";
		}
		
		aux += posOrdem(raiz.getEsq());				
		aux += posOrdem(raiz.getDir());
		aux += raiz.getDado() + "\n";
		return aux;
	}

	
}


public class Lista {

	No inicio, fim;
	
	// método para inserir um nó no início da lista
	
	public void inserirInicio (String nome) {
		No aux = new No();
		aux.nome = nome;
		if(inicio == null && fim == null) {
			inicio = aux;
			fim = aux;
		} else {
			aux.prox = inicio;
			inicio = aux;
		}
	}
	
	// método para imprimir os elementos da lista
	
	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println(aux.nome);
			aux = aux.prox;
		}
	}
	
	// método para inserir um nó no fim da lista
	
	public void inserirFim(String nome) {
		No aux = new No();
		aux.nome = nome;
		
		if(inicio == null && fim == null) {
			inicio = aux;
			fim = aux;
		} else {
			fim.prox = aux;
			fim = aux;
	}
}
}

public class Lista {

	No inicio;
	No fim;
	int tamanho;
	
	// método para inserir um nó no fim da lista:
	
		public void inserirFim(int ra, String nome) {
			
			No aux = new No(ra, nome);

			if (tamanho == 0) {
				fim = aux;
				inicio = aux;
			} else {
				aux.esq = fim;
				fim.dir = aux;
				fim = aux;
			}

			tamanho++;

		}
	
	// método para inserir um nó no início da lista
	
	public void inserirInicio(int ra, String nome) {
		No aux = new No(ra, nome);
		
		if (tamanho==0) {
			inicio = aux;
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;
			inicio = aux;
		}
		
		tamanho++;
	}
	
	// método para imprimir os elementos da lista 
	
	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println("RA: " + aux.ra);
			System.out.println("Nome: " + aux.nome);
			System.out.println();
			aux = aux.dir;
			
			}
	}

	// método para pesquisar um aluno pelo RA
	
	public No pesquisar (int ra) {
		No aux = inicio;
		while (aux != null) {
			if(aux.ra == ra) {
				return aux;
			}
			aux = aux.dir;
		}
		
	return null;
	}
}

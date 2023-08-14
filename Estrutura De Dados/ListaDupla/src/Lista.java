
public class Lista {

	No inicio;
	No fim;
	int tamanho;
	
	// m�todo para inserir um n� no fim da lista:
	
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
	
	// m�todo para inserir um n� no in�cio da lista
	
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
	
	// m�todo para imprimir os elementos da lista 
	
	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println("RA: " + aux.ra);
			System.out.println("Nome: " + aux.nome);
			System.out.println();
			aux = aux.dir;
			
			}
	}

	// m�todo para pesquisar um aluno pelo RA
	
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

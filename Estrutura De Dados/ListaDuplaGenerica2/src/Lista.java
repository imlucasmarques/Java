public class Lista<T> {
    private No<T> inicio, fim;
    private int tamanho = 0;

    public void inserirInicio(T dado) {
        No<T> aux = new No<T>(dado);
        if (inicio == null && fim == null) {
            inicio = aux;
            fim = aux;
        } else {
        	aux.dir = inicio;
            inicio.esq = aux;
            inicio = aux;
        }

        tamanho++;
    }

    public void inserirFim(T dado) {
        No<T> aux = new No<T>(dado);
        if (inicio == null && fim == null) {
            inicio = aux;
            fim = aux;
        } else {
            aux.esq = fim;
            fim.dir = aux;
            fim = aux;
        }

        tamanho++;
    }

    public No<T> pesquisar(T busca) {
        No<T> aux = inicio;

        while (aux != null) {
            if (aux.dado.equals(busca)) {
                return aux;
            }
            aux = aux.dir;
        }

        return null;
    }

    public String consultar(T busca) {
        No<T> aux = inicio;

        while (aux != null) {
            if (aux.dado.equals(busca)) {
                return aux.dado.toString();
            }
            aux = aux.dir;
        }

        return null;
    }	
    
    public boolean remover(T busca) {
        No<T> nodoParaDeletar = pesquisar(busca);

        if (nodoParaDeletar == null) {
            return false;
        }

        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else if (nodoParaDeletar.equals(inicio)) {
            // NodoGenerico<T> nodoDepois = nodoParaDeletar.dir;
            // nodoDepois.esq = null;

            // inicio = nodoDepois;

            nodoParaDeletar.dir.esq = null;

            inicio = nodoParaDeletar.dir;
        } else if (nodoParaDeletar.equals(fim)) {
            // NodoGenerico<T> nodoAnterior = nodoParaDeletar.esq;
            // nodoAnterior.dir = null;

            // fim = nodoAnterior;

            nodoParaDeletar.esq.dir = null;

            fim = nodoParaDeletar.esq;
        } else {
            // NodoGenerico<T> nodoAnterior = nodoParaDeletar.esq;
            // NodoGenerico<T> nodoDepois = nodoParaDeletar.dir;

            // nodoAnterior.dir = nodoDepois;
            // nodoDepois.esq = nodoAnterior;

            nodoParaDeletar.esq.dir = nodoParaDeletar.dir;

            nodoParaDeletar.dir.esq = nodoParaDeletar.esq;
        }

        nodoParaDeletar = null;
        tamanho--;
        return true;
    }
    
    
    
    public No<T> getInicio() {
        return inicio;
    }

    public No<T> getFim() {
        return fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String dadosString = "[";
        No<T> curr = inicio;

        while (curr != null) {
            String formatString = "%s, ";
            if (this.fim.equals(curr)) {
                formatString = "%s";
            }

            dadosString += String.format(formatString, curr);

            curr = curr.dir;
        }

        dadosString += "]";

        String output = dadosString;

        return output;
    }

}


public class No<T> {
    T dado;
    No<T> esq, dir;

    public No(T dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return dado.toString();
    }

    public T getDado() {
        return this.dado;
    }

    public No<T> getLadoDireito() {
        return this.dir;
    }

    public No<T> getLadoEsquerdo() {
        return this.esq;
    }
}
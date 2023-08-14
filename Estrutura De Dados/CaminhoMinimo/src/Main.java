import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Grafo grafo = new Grafo();

		// inserindo as arestas
		grafo.adicionarAresta(new Aresta("A", "B", 6));
		grafo.adicionarAresta(new Aresta("B", "A", 6));
		grafo.adicionarAresta(new Aresta("A", "C", 2));
		grafo.adicionarAresta(new Aresta("C", "A", 2));
		grafo.adicionarAresta(new Aresta("C", "B", 1));
		grafo.adicionarAresta(new Aresta("B", "C", 1));
		grafo.adicionarAresta(new Aresta("C", "D", 2));
		grafo.adicionarAresta(new Aresta("D", "C", 2));
		grafo.adicionarAresta(new Aresta("C", "F", 3));
		grafo.adicionarAresta(new Aresta("F", "C", 3));
		grafo.adicionarAresta(new Aresta("F", "D", 2));
		grafo.adicionarAresta(new Aresta("D", "F", 2));
		grafo.adicionarAresta(new Aresta("F", "E", 4));
		grafo.adicionarAresta(new Aresta("E", "F", 4));
		grafo.adicionarAresta(new Aresta("D", "E", 2));
		grafo.adicionarAresta(new Aresta("E", "D", 2));
		grafo.adicionarAresta(new Aresta("B", "D", 4));
		grafo.adicionarAresta(new Aresta("D", "B", 4));

		// chamar o m�todo para calcular o caminho m�nimo
		String origem = "C";
		Map<String, Integer> caminhoMinimo = grafo.calcularCaminhoMinimo(origem);

		// Imprimir o caminho m�nimo do n� de origem at� todos os outros n�s
		for (String no : caminhoMinimo.keySet()) {
			int distancia = caminhoMinimo.get(no);
			System.out.println("Dist�ncia de " + origem + " at� " + no + ": " + distancia);
		}

	}
}

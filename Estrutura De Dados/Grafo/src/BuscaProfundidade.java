import java.util.ArrayList;
import java.util.List;

public class BuscaProfundidade {

	private int numVertices;
	List<List<Integer>> listaAdjacencia;
	
	public BuscaProfundidade (int numVertices) {
		this.numVertices = numVertices;
		this.listaAdjacencia = new ArrayList<>(numVertices);
		
		for(int i = 0; i < listaAdjacencia.size(); i++) {
			listaAdjacencia.add(new ArrayList<>());
		}
	}
	
	// m�todo para inserir um novo v�rtice (n�) no grafo
	
	public void addVertice(int origem, int destino) {
		
	}
	
}

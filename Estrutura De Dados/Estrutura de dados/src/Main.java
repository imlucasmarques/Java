
public class Main {
 
	public static void main (String[] args) {
		
		Lista lista = new Lista();
		
		//inserir no início da lista
		
		lista.inserirInicio("Selmini");
		lista.inserirInicio("Flávio");
		lista.inserirInicio("Sandra");
		
		
		//inserir no fim da lista 
		lista.inserirFim("Surian");
		lista.inserirFim("Lúcia");
		lista.inserirFim("Clebinho");
		
		
		// impressao da lista
		lista.imprimir();
	}
	

}

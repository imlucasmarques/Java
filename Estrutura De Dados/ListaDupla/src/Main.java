
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();
		
		lista.inserirInicio(1, "Surian");
		lista.inserirInicio(2, "Surjan");
		
		
		lista.inserirFim(3, "Sandra");
		lista.inserirFim(4, "Lucia");
		
		System.out.println(lista.pesquisar(20));
		
		lista.imprimir();
		
	}

}

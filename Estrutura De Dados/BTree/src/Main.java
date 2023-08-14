
public class Main {
	public static void main(String[] args) {
		
		Btree<Integer> tree = new Btree<>();
		tree.inserir(30);
		tree.inserir(40);
		tree.inserir(58);
		tree.inserir(48);
		tree.inserir(24);
		tree.inserir(11);
		tree.inserir(13);
		tree.inserir(26);
		
		//System.out.println("Pré Ordem");
		//System.out.println(tree.preOrdem());
		
		//System.out.println("Em Ordem");
		//System.out.println(tree.emOrdem());
		
		System.out.println("Pós Ordem");
		System.out.println(tree.posOrdem());

	}
}

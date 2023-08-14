import java.util.Scanner;

public class Util {

	Produto[] produto = new Produto[10];

	public boolean cadastrar(int id) {

		String Nome;
		int Quantidade;
		double Valor;

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Cadastre seu produto abaixo: \n");

		System.out.print(" Nome do produto: ");
		Nome = teclado.nextLine();

		for (int i = 0; i < id; i++) {

			if (Nome.equalsIgnoreCase(produto[i].nome)) {
				System.out.println("");
				System.out.println(" Esse nome já está cadastrado. ");
				System.out.println("");
				return false;
			}
		}

		System.out.print(" Valor do produto: ");
		Valor = teclado.nextDouble();
		System.out.print(" Quantidade do produto: ");
		Quantidade = teclado.nextInt();
		System.out.println("");
		System.out.println(" PRODUTO CADASTRADO. \n");
		teclado.nextLine();

		produto[id] = new Produto();

		produto[id].nome = Nome;
		produto[id].valor = Valor;
		produto[id].quantidade = Quantidade;

		return true;
	}

	public void pesquisar(int id) {

		Scanner teclado = new Scanner(System.in);

		String nomePesquisa;
		System.out.print(" Digite o nome do produto que você deseja encontrar: ");
		nomePesquisa = teclado.nextLine();
		boolean encontrado = false;

		for (int i = 0; i < id; i++) {

			if (nomePesquisa.equalsIgnoreCase(produto[i].nome)) {
				System.out.println("");
				System.out.println(" Valor: " + String.format("%.2f", produto[i].valor) + "\n" + " Quantidade: "
						+ (produto[i].quantidade));
				System.out.println("");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println(" Produto não encontrado. ");
		}

	}

	public void listar(int id) {

		for (int i = 0; i < id; i++) {
			System.out.println("");
			System.out.println(" Nome: " + (produto[i].nome) + "  || Valor: " + String.format("%.2f", produto[i].valor)
					+ "  || Quantidade: " + (produto[i].quantidade));
		}

		System.out.println("");

	}

	public void excluir(int id) {

		Scanner teclado = new Scanner(System.in);

		String nomeExcluir;
		System.out.print(" Digite o nome do produto que você deseja excluir: ");
		nomeExcluir = teclado.nextLine();
		System.out.println("");
		boolean Encontrado = false;

		for (int i = 0; i < id; i++) {
			if (nomeExcluir.equalsIgnoreCase(produto[i].nome)) {
				Encontrado = true;
			}

			if (Encontrado) {

				if (i == 9) {
					produto[i].nome = null;
					produto[i].valor = 0;
					produto[i].quantidade = 0;

				} else if (i != id && produto[i+1] != null) {
					produto[i].nome = produto[i + 1].nome;
					produto[i].valor = produto[i + 1].valor;
					produto[i].quantidade = produto[i + 1].quantidade;
				}
			}
		}

		id = id - 1;

	}

}

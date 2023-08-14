import static javax.swing.JOptionPane.*; // janela gráfica
import static java.lang.Integer.*; // int
import static java.lang.Double.*; // double

public class Util {

	Lista<Paciente> lista = new Lista<>();

	public void menu() {

		int opcao;

		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 5) {
				showMessageDialog(null, "Opção inválida!");
			} else {
				switch (opcao) {
				case 1:
					cadastrar();
					break;
				case 2:
					pesquisar();
					break;
				case 3:
					remover();
					break;
				case 4:
					listar();
					break;
				}
			}
		} while (opcao != 5);

	}

	private void listar() {
		showMessageDialog(null, lista.imprimir());
		
	}

	private void remover() {
		String nome = showInputDialog("Nome para remoção");

		if (lista.remover(new Paciente(nome)) == true) {
			showMessageDialog(null, nome + " removido com sucesso");
		} else {
			showMessageDialog(null, nome + " não foi removido "); // null para ficar centralizado

		}

	}

	private void pesquisar() {
		String nome = showInputDialog("Nome para pesquisa");

		if (lista.pesquisar(new Paciente(nome)) == null) {
			showMessageDialog(null, nome + " não é paciente");
		} else {
			showMessageDialog(null, nome + " é paciente"); // null para ficar centralizado

		}

	}

	private String gerarMenu() {

		String aux = "";
		aux += "1. Cadastrar\n";
		aux += "2. Pesquisar\n";
		aux += "3. Remover\n";
		aux += "4. Listar\n";
		aux += "5. Finalizar";
		return aux;

	}

	public void cadastrar() {
		String nome;
		int idade;
		double altura, peso, quadril;

		nome = showInputDialog("Nome");
		idade = parseInt(showInputDialog("Idade"));
		altura = parseDouble(showInputDialog("Altura (m)"));
		peso = parseDouble(showInputDialog("Peso"));
		quadril = parseDouble(showInputDialog("Quadril (cm)"));

		lista.inserirFim(new Paciente(nome, idade, peso, altura, quadril)); // ou fazer a inicializacao antes:
																			// paciente p = new paciente e colocar:
																			// lista.inserirFim(p);

	}

}
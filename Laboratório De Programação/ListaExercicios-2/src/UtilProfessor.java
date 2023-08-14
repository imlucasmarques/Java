import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class UtilProfessor {

	Professor[] professor = new Professor[5];
	
	int posicao = 0;

	// método para controlar o menu da aplicação

	public void menu() {

		String aux = " Escolha uma operação\n1. Cadastrar\n2. Pesquisar\n3. Listar\n4. Sair ";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, " Opção inválida ");
			} else {
				switch (opcao) {
				case 1:
					if(posicao >= professor.length) {
						showMessageDialog(null, " Banco de dados cheio ");
					}else {
						cadastrar();
						posicao++;
					}
					break;
				case 2:
					pesquisar();
					break;
				case 3:
					listar();

				}
			}
		} while (opcao != 4);
	}

	private void listar() {
		
		String aux = "";
		for (int i = 0; i < posicao; i++) {
			aux += professor[i].getDados() + "\n";
		}
		showMessageDialog(null, aux);
		
	}

	private void pesquisar() {
		
		String cpf = showInputDialog("CPF para pesquisar");
		for (int i = 0; i < posicao; i++) {
			if(professor[i].cpf.equals(cpf)) {
				showMessageDialog(null, professor[i].getDados());
			}
		}
		
	}

	private void cadastrar() {
		
		professor[posicao] = new Professor();
		professor[posicao].nome = showInputDialog("Nome");
		professor[posicao].cpf = showInputDialog("CPF");
		professor[posicao].totalDeAulas = parseInt(showInputDialog("Total de aulas"));
		professor[posicao].valorDaAula = parseDouble(showInputDialog("Valor da aula"));

	}

	
}

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class UtilReserva {

	Reserva[] reserva = new Reserva[5];
	Reserva[] espera = new Reserva[5];

	int posicao = 0;
	int posicaoespera = 0;

	public void menu() {

		String aux = " Restaurante SABOR SOFISTICADO\n1. Reservar mesa\n2. Pesquisar reserva\n3. Imprimir reservas\n4. Imprimir lista de espera\n5. Cancelar reserva\n6. Finalizar ";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, " Opção inválida ");
			} else {
				switch (opcao) {
				case 1:
					if (posicao >= reserva.length) {
						espera();
						posicaoespera++;

					} else {
						reservar();
						posicao++;
					}
					break;
				case 2:
					pesquisar();
					break;
				case 3:
					imprimir_reservas();
				case 4:
					imprimir_esperas();
				case 5:
					cancelar();
				}
			}
		} while (opcao != 6);
	}

	private void espera() { //

		espera[posicaoespera] = new Reserva();
		espera[posicaoespera].nome = showInputDialog("Nome");
		espera[posicaoespera].telefone = showInputDialog("Telefone");
		espera[posicaoespera].pagamento = showInputDialog("Forma de pagamento");

		showMessageDialog(null, " Você está na lista de espera ");
	}

	private void cancelar() {

	}

	private void imprimir_esperas() { //

		String aux = "";
		for (int i = 0; i < posicaoespera; i++) {
			aux += espera[i].getDados() + "\n";
		}
		showMessageDialog(null, aux);
	}

	private void imprimir_reservas() { // ---

		String aux = "";
		for (int i = 0; i < posicao; i++) {
			aux += reserva[i].getDados() + "\n";
		}
		showMessageDialog(null, aux);
	}

	private void pesquisar() { // ---

		String tel = showInputDialog("Telefone para pesquisar");

		if (posicao >= 1 || posicaoespera >= 1) {

			for (int i = 0; i < posicao; i++) {
				if (reserva[i].telefone.equals(tel)) {
					showMessageDialog(null, "Você tem reserva para jantar");
					break;
				}

			}

		} else {
			for (int i = 0; i < posicaoespera; i++) {
				if (espera[i].telefone.equals(tel)) {
					showMessageDialog(null, " Você está na posição " + (i + 1) + " da lista de espera");
					break;
				} else {
					showMessageDialog(null, "Você NÃO tem reserva para jantar");
				}
			}
		}
	}

	private void reservar() { //

		reserva[posicao] = new Reserva();
		reserva[posicao].nome = showInputDialog("Nome");
		reserva[posicao].telefone = showInputDialog("Telefone");
		reserva[posicao].pagamento = showInputDialog("Forma de pagamento");

	}

}

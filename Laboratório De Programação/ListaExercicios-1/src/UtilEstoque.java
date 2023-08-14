import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Random;

public class UtilEstoque {

	Estoque[] registro = new Estoque[5];

	// método para inserir os registros

	public void registrar() {

		Random gerador = new Random();

		for (int i = 0; i < registro.length; i++) {
			registro[i] = new Estoque();
			registro[i].id = gerador.nextInt(1000, 9999);
			registro[i].nome = showInputDialog(" Nome do produto: ");
			registro[i].preco = parseDouble(showInputDialog(" Preço: "));

			for (int j = 0; j < registro[i].baixas.length; j++) {
				registro[i].baixas[j] = gerador.nextInt(0, 100);
			}
		}

	}

	// método para imprimir o nome produto mais vendido + quantidade de vendas
	
	public void vendas() {

		int MaiorBaixa = 0;
		String aux = "";

		for (int i = 0; i < registro.length; i++) {
			for (int j = 0; j < registro[i].baixas.length; j++) {
				if (registro[i].baixas[j] > MaiorBaixa) {
					MaiorBaixa = registro[i].baixas[j];
					aux = registro[i].nome;
				}
			}

		}
		
		showMessageDialog(null, " O produto "+ aux + " foi o mais vendido " +"\n com " + MaiorBaixa + " vendas");
	}

}
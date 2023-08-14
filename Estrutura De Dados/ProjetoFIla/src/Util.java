import static javax.swing.JOptionPane.*;

import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	
	private Queue<Acao> fila = new LinkedList<>();
	
	public void menu() {
		
		String aux = "Qual op��o deseja: \n\n";
		aux += "1. Comprar\n";
		aux += "2. Vender\n";
		aux += "3. Finalizar";
		int opc = 0;
		
		do {
			try {
				opc = parseInt(showInputDialog(aux));
				if(opc < 1 || opc > 3) {
					throw new OpcaoInvalidaException("Op��o inv�lida.");
				}
				
				switch(opc) {
					case 1:
						comprar();
						break;
					case 2:
						vender();
						break;
				}
					
			} catch (NumberFormatException e) {
					showMessageDialog(null, "Op��o inv�lida.");
			} catch (OpcaoInvalidaException e) {
				showMessageDialog(null, e);
			} catch (Exception e) {
				showMessageDialog(null, "ERRO | " + e);
			}
		}while(opc != 3);
	}

	private void vender() {
		int qnt;
		double preco;
		double precoA = 0;
		try {
			qnt = parseInt(showInputDialog("Quantas a��es deseja vender? "));
			preco = parseDouble(showInputDialog("Qual o pre�o que deseja vender as a��es? "));
			
			do {
				if(fila.peek().getQnt() > qnt) {
					qnt -= fila.peek().getQnt();
					precoA += fila.peek().getPreco();
					fila.remove();
				}else {
					qnt -= fila.peek().getQnt();
					precoA += fila.peek().getPreco();
					fila.peek().setQnt(qnt);
				}
			}while(qnt == 0);
			
			showMessageDialog(null, "Quantidade: " + qnt + "\nPreco: " + precoA + "\nLucro: " + (precoA - preco));
			
		} catch (NumberFormatException e) {
			showMessageDialog(null, "Valor inv�lido!");
		}
		
		
		
	}

	private void comprar() {
		int qnt = 0;
		double preco = 0;
		try {
			qnt = parseInt(showInputDialog("Qual a quantidade de a��es?"));
			preco = parseDouble(showInputDialog("Qual o pre�o das a��es?"));
		} catch (NumberFormatException e) {
			showMessageDialog(null, "N�mero inv�lido!");
		}
		fila.add(new Acao(qnt, preco));
	}
	
}
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Scanner;

public class UtilCliente {

	Scanner teclado = new Scanner(System.in);
	
	Cliente[] cliente = new Cliente[5];
	
	
	public void cadastrar() {
		
		System.out.println(" CADASTRE OS 5 CLIENTES: \n");

		for (int i = 0; i < cliente.length; i++) {
			cliente[i] = new Cliente();
			System.out.print(" Digite o nome do cliente " + (i + 1)+ " : ");
			cliente[i].nome = teclado.next();
			System.out.print(" Digite o cpf do cliente " + (i + 1)+ " : ");
			cliente[i].cpf = teclado.next();
			System.out.print(" Digite o tempo (em minutos) que o cliente " + (i + 1) + " alugou o carro : ");
			cliente[i].tempo = teclado.nextInt();
			System.out.println();
		}
		
	}

	public void imprimir_aluguel() {
		
		System.out.println(" LISTA DOS ALUGUEIS DOS CLIENTES: \n");
		String aux = "";
		for (int i = 0; i < cliente.length; i++) {
			aux = cliente[i].getDados();
			System.out.println(aux);
		}
		
	}

	public void imprimir_maior_aluguel() {
		
		double maior = 0;
		double Aux = 0;
		
		for (int i = 0; i < cliente.length; i++) {
			Aux = cliente[i].getSalario();
			if(Aux > maior) {
				maior = Aux;
			}
		}
		
		
		for (int i = 0; i < cliente.length; i++) {
			if (maior == cliente[i].getSalario()) {
				System.out.println( " O CLIENTE  " + cliente[i].nome + " FOI O O QUE FICOU COM O CARRO ALUGADO POR MAIS TEMPO. ");
				break;
			}
		}
	}

	public void soma_alugueis() {
		
		double soma = 0;
		double Aux = 0;
		
		for (int i = 0; i < cliente.length; i++) {
			Aux = cliente[i].getSalario();
			soma += cliente[i].getSalario();
	}
		System.out.println(" \n O TOTAL DE ALUGUEIS QUE A LOJA RECEBEU FOI: R$ " + String.format("%.2f", soma));
}
}

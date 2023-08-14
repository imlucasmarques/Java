import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*; // janela gráfica

import javax.swing.JOptionPane;
public class Util {

	Lista<Usuario> usuario = new Lista<>();
	static Lista<BilheteUnico> bilhete = new Lista<>();
	
	// menu principal
	
	public void menu1() {
		
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(gerarMenu1()));
			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção inválida!");
			} else {
				switch (opcao) {
				case 1:
					administrador();
					break;
				case 2:
					usuario();
					break;
				}
			}
		} while (opcao != 3);
	}

	// menu administrador
	
	private void administrador() {
		 int opcao_admin;
	        do {
	            opcao_admin = Integer.parseInt(JOptionPane.showInputDialog(gerarMenu2()));
	            if(opcao_admin < 1 || opcao_admin > 4) {
	                JOptionPane.showMessageDialog(null, "Opcao invalida");
	            } else {
	                switch(opcao_admin) {
	                    case 1:
	                        Util.cadastrarBilhete();
	                        break;
	                    case 2:
	                        Util.consultarBilhete();
	                        break;
	                    case 3:
	                        Util.listarBilhetes();
	                        break;
	                }
	            }
	        } while(opcao_admin != 4);
		
	}

	private static void cadastrarBilhete() {
		
		// rever essa parte
		
		String nomeDoUsuario = JOptionPane.showInputDialog(" Digite o nome do usuário: ");
		String CPF = JOptionPane.showInputDialog(" Digite o cpf do usuário: ");
		BilheteUnico Abilhete = new BilheteUnico();
		
		Abilhete.setNumero(1212);
		
		
		
		
		
	}

	private static void consultarBilhete() {

		
	}
	
	private static void listarBilhetes() {
		
		
	}
	
	// menu usuário
	
	private void usuario() {
		
		  int opcao_usuario;
	        do {
	            opcao_usuario = Integer.parseInt(JOptionPane.showInputDialog(gerarMenu3()));
	            if(opcao_usuario < 1 || opcao_usuario > 4) {
	                JOptionPane.showMessageDialog(null, "Opcao invalida");
	            } else {
	                switch(opcao_usuario) {
	                    case 1:
	                        Util.consultarSaldo();
	                        break;
	                    case 2:
	                        Util.carregarBilhete();
	                        break;
	                    case 3:
	                        Util.passarCatraca();
	                        break;
	                }
	            }
	        } while(opcao_usuario != 4);
	}
	
	private static void consultarSaldo() {
		// TODO Auto-generated method stub
		
	}

	private static void carregarBilhete() {
		// TODO Auto-generated method stub
		
	}

	private static void passarCatraca() {
		// TODO Auto-generated method stub
		
	}

	// menus
	
	private String gerarMenu1() {

		String aux = "";
		aux += "1. Administrador\n";
		aux += "2. Usuário\n";
		aux += "3. Finalizar\n";
		return aux;

	}

	private String gerarMenu2() {

		String aux = "";
		aux += "1. Cadastrar Bilhete\n";
		aux += "2. Consultar Bilhete\n";
		aux += "3. Listar Bilhetes\n";
		aux += "4. Sair\n";
		return aux;

	}

	private String gerarMenu3() {

		String aux = "";
		aux += "1. Consultar Saldo\n";
		aux += "2. Carregar Bilhete\n";
		aux += "3. Passar na Catraca\n";
		aux += "4. Sair\n";
		return aux;

	}

}
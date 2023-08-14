import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.getRootFrame;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Menu {
	
	public static void abrir() {
		boolean programa = true;
		do {
			boolean opcS = true;
			int opca = 0;
			do {
				String opc = showInputDialog("Qual interface deseja acessar: \n\n1. Administrador\n2. Usu�rio\n3. Finalizar Programa");
				if(!opc.matches("[0-9]+")) {
					showMessageDialog(getRootFrame(), "Op��o inv�lida!");
				}else {
					opca = parseInt(opc);
					if(opca < 1 || opca > 3) {
						showMessageDialog(getRootFrame(), "Op��o inv�lida!");
					}else {
						opcS = false;
					}
				}	
			}while(opcS);
			
			if(opca == 1) {
				abrirAdm();
				programa = false;
			}else if(opca == 2) {
				abrirUser();
				programa = false;
			}else {
				showMessageDialog(getRootFrame(), "Programa finalizado com sucesso!");
				break;
			}
			
		}while(programa);
		
		
	}
	
	
	private static void abrirAdm() {
		boolean programa = true;
		do {
			boolean opcS = true;
			int opca = 0;
			do {
				String opc = showInputDialog("Qual op��o deseja: \n\n1. Cadastrar Bilhete\n2. Consultar Bilhete\n3. Listar Bilhetes\n4. Voltar");
				if(!opc.matches("[0-9]+")) {
					showMessageDialog(getRootFrame(), "Op��o inv�lida!");
				}else {
					opca = parseInt(opc);
					if(opca < 1 || opca > 4) {
						showMessageDialog(getRootFrame(), "Op��o inv�lida!");
					}else {
						opcS = false;
					}
				}	
			}while(opcS);
			
			if(opca == 1) {
				
				String nome = showInputDialog(getRootFrame(), "Qual o nome do titular?");
				
				String cpf = showInputDialog(getRootFrame(), "Qual o CPF do titular?");
				
				String tipo = "";
				
				boolean opcSb = true;
				int opcab = 0;
				
				do {
					String opcb = showInputDialog("Qual o tipo da tarifa? \n\n1. Normal\n2. Estudante\n3. Professor");
					if(!opcb.matches("[0-9]+")) {
						showMessageDialog(getRootFrame(), "Op��o inv�lida!");
					}else {
						opcab = parseInt(opcb);
						if(opcab < 1 || opcab > 3) {
							showMessageDialog(getRootFrame(), "Op��o inv�lida!");
						}else {
							opcSb = false;
						}
					}	
				}while(opcSb);
				
				if(opcab == 1) {
					tipo = "Normal";
				}else if(opca == 2) {
					tipo = "Estudante";
				}else {
					tipo = "Professor";
				}
				
				if(Util.gerarBilhete(nome, cpf, tipo)) {
					showMessageDialog(getRootFrame(), "Bilhete cadastrado com sucesso!");
				}else {
					showMessageDialog(getRootFrame(), "Esse usu�rio j� tem um bilhete cadastrado!");
				}
				
			}else if(opca == 2) {
				String ns = showInputDialog("Qual o n�mero do bilhete que deseja os dados?");
				int n = 0;
				if(!ns.matches("[0-9]+")) {
					showMessageDialog(getRootFrame(), "N�mero inv�lido!");
				}else {
					n = parseInt(ns);
					showMessageDialog(getRootFrame(), Util.pesquisarBilhete(n));
				}
				
				
				
			}else if(opca == 3) {
				showMessageDialog(getRootFrame(), Util.listarBilhetes());
			}else {
				programa = false;
				abrir();
			}
			
		}while(programa);

	}
	
	public static void abrirUser() {
		String ns = showInputDialog("Qual o n�mero do seu bilhete?");
		int n = 0;
		if(!ns.matches("[0-9]+")) {
			showMessageDialog(getRootFrame(), "N�mero inv�lido!");
		}else if(!Util.BilheteExistente(ns)) {
			showMessageDialog(getRootFrame(), "Esse bilhete n�o existe!");

		}else {
			n = parseInt(ns);
			boolean programa = true;
			do {
				boolean opcS = true;
				int opca = 0;
				do {
					String opc = showInputDialog("Qual op��o deseja: \n\n1. Consultar Saldo\n2. Carregar Bilhete\n3. Passar na Catraca\n4. Voltar");
					if(!opc.matches("[0-9]+")) {
						showMessageDialog(getRootFrame(), "Op��o inv�lida!");
					}else {
						opca = parseInt(opc);
						if(opca < 1 || opca > 4) {
							showMessageDialog(getRootFrame(), "Op��o inv�lida!");
						}else {
							opcS = false;
						}
					}	
				}while(opcS);
				
				if(opca == 1) {
					showMessageDialog(getRootFrame(), Util.consultarSaldo(n));
					
				}else if(opca == 2) {
					String svalor = showInputDialog("Qual valor voc� deseja carregar no seu bilhete?");
					
					Double valor = Double.parseDouble(svalor);
					
					if(valor <= 0 ) {
						showMessageDialog(getRootFrame(), "Valor inv�lido!");
					}else {
						Util.carregar(n, valor);
					}
					
				}else if(opca == 3) {
					if(Util.passarCatraca(n)) {
						showMessageDialog(getRootFrame(), "Voc� passou na catraca! \n Saldo Dispon�vel: " + Util.consultarSaldo(n));
					}else {
						showMessageDialog(getRootFrame(), "Saldo insulficiente!");
					}
				}else {
					programa = false;
					abrir();
				}
				
			}while(programa);
		}

	}
	
}

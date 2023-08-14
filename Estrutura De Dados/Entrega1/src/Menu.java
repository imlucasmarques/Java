import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;

public class Menu {
	
	Util util = new Util();
    
	double valorPassagem = 4.40;

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
        		
        		switch (opcao_admin) {
                case 1:
                    Usuario usuarioCadastrado = cadastrarUsuario();
                    if (usuarioCadastrado != null) {
                        cadastrarBilhete(usuarioCadastrado);
                    }
                    break;
                case 2:
                    String aux = " Bilhete único não encontrado!";
                    Usuario usuarioEncontrado = encontrarUsuario();
                    if (usuarioEncontrado != null) {
                    	
                        aux = util.consultarBilhete(usuarioEncontrado);


                    }
                    
                    
                    showMessageDialog(null,  util.consultarBilhete(usuarioEncontrado));
                    break;
                case 3:
                    showMessageDialog(null, listarBilhetes());
                    break;
                case 4:
                    return;
                
            }
        	 }
        } while (true);
    }

    private Usuario cadastrarUsuario() {
       
    	String nome = showInputDialog(null, " Digite o nome do usuário: ");

        String cpf = showInputDialog(null, " Digite o CPF do usuário: ");

        String tipoDeTarifa = gerarTipo1(new String[] { "Estudante", "Professor", "Normal" },
                new String[] { "estudante", "professor", "normal" });

        Usuario usuarioNovo = util.cadastrarUsuario(new Usuario(nome, cpf, tipoDeTarifa));
       
        if (usuarioNovo != null) {
            showMessageDialog(null, " Usuário cadastrado com sucesso! ");

        } else {
            showMessageDialog(null, " Erro ao inserir este usuário :( ");
        }

        return usuarioNovo;
    }
    
    private Usuario encontrarUsuario() {
       
    	String cpf = showInputDialog(null, " Digite o cpf do usuário: ");
    	
        return util.encontrarUsuario(cpf);
        
    }

    private void cadastrarBilhete(Usuario usuario) {

        double valorDaTarifa = 4.40;

        if (usuario.getTipoDeTarifa().equals("estudante") || usuario.getTipoDeTarifa().equals("professor")) {
            valorDaTarifa = valorDaTarifa * 0.5;
        }

        BilheteUnico resultado = null;
        do {
            resultado = util.cadastarBilhete(valorDaTarifa, usuario);
        } while (resultado == null);
    }

    private String listarBilhetes() {
       
    	BilheteUnico[] bilhetes = util.listarBilhetes();
        String aux = "";
        for (int i = 0; i < bilhetes.length; i++) {
            aux += bilhetes[i] + "\n";
        }

        return aux;
    }

    // menu usuário

    private void usuario() {
        int opcao_usuario;
        do {
        	opcao_usuario = Integer.parseInt(JOptionPane.showInputDialog(gerarMenu3()));
            if(opcao_usuario < 1 || opcao_usuario > 4) {
                JOptionPane.showMessageDialog(null, "Opcao invalida");
            } else {
          
            String aux = "";
            Usuario usuarioEncontrado = null;

            switch (opcao_usuario) {
                case 1:
                    aux = "Usuário não encontrado!";
                    usuarioEncontrado = encontrarUsuario();
                    if (usuarioEncontrado != null) {
                        BilheteUnico bilheteUnico = encontrarBilhete(usuarioEncontrado);
                        aux = String.format("Saldo atual: R$%.2f", bilheteUnico.getSaldo());
                    }
                    showMessageDialog(null, aux);
                    break;
                case 2:
                    usuarioEncontrado = encontrarUsuario();
                    if (usuarioEncontrado != null) {
                        BilheteUnico bilheteUnico = encontrarBilhete(usuarioEncontrado);
                        String valorRecarga = showInputDialog(null,
                                "Escreva o valor de recarga no bilhete único de " + usuarioEncontrado.getNome())
                                .replace(",", ".");

                        double recarga = Double.parseDouble(valorRecarga);
                        if (recarga <= 0) {
                            showMessageDialog(null, "Valor inválido!");
                            break;
                        }

                        bilheteUnico.carregarBilhete(recarga);
                    } else {
                        showMessageDialog(null, "Usuário não encontrado!");
                    }
                    break;
                case 3:
                    usuarioEncontrado = encontrarUsuario();
                    if (usuarioEncontrado != null) {
                        BilheteUnico bilheteUnico = encontrarBilhete(usuarioEncontrado);

                        if (bilheteUnico.passarNaCatraca()) {
                            showMessageDialog(null, "Usuário passou na catraca!");
                        } else {
                            showMessageDialog(null, "Usuário não tem saldo o suficiente para passar na catraca!");
                        }
                    } else {
                        showMessageDialog(null, "Usuário não encontrado!");
                    }
                    break;
                case 4:
                    return;

                default:
                    showMessageDialog(null, "Digite uma opção válida");
                    break;
            }
            }
        } while (true);
        
    }
   
   
    // método para consultar o saldo do bilhete único
    
    private BilheteUnico encontrarBilhete(Usuario usuario) {
       
    	return util.encontrarBilhete(usuario);
    }

   
    // tipo de usuário (estudante/ professor/ normal)
    
    private String gerarTipo1(String[] tipos, String[] valores) {
       
    	int opcao = gerarTipo2(tipos);

        return valores[opcao - 1];
    }
     
    private int gerarTipo2(String[] tipo) {
      
    	String aux = "";

        for (int i = 0; i < tipo.length; i++) {
            aux += (i + 1) + " - " + tipo[i] + "\n";
        }

        return Integer.parseInt(showInputDialog(null, aux));
    }

    // menus
	
 	
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

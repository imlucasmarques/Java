import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class Menu {
    
	Util util = new Util();
   
  
    // menu principal
    
    public void menu1() {
        
    	int opcao;
        boolean b = true;
        do {
        	
        	opcao = parseInt(showInputDialog(gerarMenu1()));
            switch (opcao) {
                case 1:
                    administrador();
                    break;
                case 2:
                    usuario();
                    break;
                case 3:
                    b = false;
                    break; 
                default:
                    showMessageDialog(null, "Op��o inv�lida!");
                    break;
            }
        
        } while (b);
    }

    // menu do admnistrador
    
    private void administrador() {
        int opcao_admin;
        
        do {
        	opcao_admin = Integer.parseInt(JOptionPane.showInputDialog(gerarMenu2()));

            switch (opcao_admin) {
                case 1:
                    Usuario usuarioCadastrado = cadastrarUsuario();
                    if (usuarioCadastrado != null) {
                        cadastrarBilhete(usuarioCadastrado);
                    }
                    break;
                case 2:
                    String aux = "Bilhete �nico n�o encontrado!";
                    Usuario usuarioEncontrado = consultarUsuario();
                    if (usuarioEncontrado != null) {
                        BilheteUnico bilheteUnico = consultarBilhete(usuarioEncontrado);
                        aux = bilheteUnico.toString();
                    }
                    showMessageDialog(null, aux);
                    break;
                case 3:
                    showMessageDialog(null, listarBilhete());
                    break;
                case 4:
                    return;

                default:
                    showMessageDialog(null, "Op��o inv�lida!");
                    break;
            }
        } while (true);
    }

    // menu usu�rio
    
    private void usuario() {
        
    	int opcao_usuario;
        
    	do {
    		
        	opcao_usuario = Integer.parseInt(JOptionPane.showInputDialog(gerarMenu3()));

            String aux = "";
            Usuario buscaUsuario = null;

            switch (opcao_usuario) {
                case 1:
                    aux = " Usu�rio n�o encontrado!";
                    buscaUsuario = consultarUsuario();
                    
                    if (buscaUsuario != null) {
                        BilheteUnico bilhete = consultarBilhete(buscaUsuario);
                        aux = String.format(" Saldo dispon�vel: R$%.2f", bilhete.getSaldo());
                    }
                    
                    showMessageDialog(null, aux);
                    break;
                case 2:
                	buscaUsuario = consultarUsuario();
                   
                	if (buscaUsuario != null) {
                        BilheteUnico bilhete = consultarBilhete(buscaUsuario);
                        String valorRecarga = showInputDialog(null, " Digite o valor da recarga: ") ;

                        double recarga = Double.parseDouble(valorRecarga);
                       
                        if (recarga <= 0) {
                            showMessageDialog(null, "Valor inv�lido!");
                            break;
                        }

                        bilhete.carregarBilhete(recarga);
                    } else {
                        showMessageDialog(null, "Usu�rio n�o encontrado!");
                    }
                    break;
                case 3:
                	buscaUsuario = consultarUsuario();
                   
                	if (buscaUsuario != null) {
                        BilheteUnico bilhete = consultarBilhete(buscaUsuario);

                        if (bilhete.passarNaCatraca()) {
                            showMessageDialog(null, "Usu�rio passou na catraca!");
                        } else {
                            showMessageDialog(null, "Usu�rio n�o tem saldo o suficiente para passar na catraca!");
                        }
                    } else {
                        showMessageDialog(null, "Usu�rio n�o encontrado!");
                    }
                    break;
                case 4:
                    return;

                default:
                    showMessageDialog(null, " Op��o inv�lida! ");
                    break;
            }
        } while (true);
    }

    // m�todo para inserir os dados do usu�rio do bilhete 
    
    private Usuario cadastrarUsuario() {
       
    	String nome = showInputDialog(null, " Digite o nome do usu�rio: ");

        String cpf = showInputDialog(null, " Digite o cpf do usu�rio: ");

        String tipoDeTarifa = gerarTipo1(new String[] { "Estudante", "Professor", "Normal" },
                new String[] { "estudante", "professor", "normal" });

        Usuario novoUsuario = util.verificarUsuario(new Usuario(nome, cpf, tipoDeTarifa));
       
        if (novoUsuario != null) {
            showMessageDialog(null, " Usu�rio cadastrado! ");

        } else {
            showMessageDialog(null, " N�o pode haver bilhetes com o mesmo nome e nem dois usu�rios com o mesmo cpf! ");
        }

        return novoUsuario;
    }

    // m�todo para calcular o valor da passagem de acordo com o tipo de usu�rio
    
    private void cadastrarBilhete(Usuario usuario) {

        double valorPassagem = 4.40;

        if (usuario.getTipoDeTarifa().equals("estudante") || usuario.getTipoDeTarifa().equals("professor")) {
        	valorPassagem = valorPassagem * 0.5;
        }

       BilheteUnico resultado = null;
        
       do {
            resultado = util.inserirBilhete(valorPassagem, usuario);
        } while (resultado == null);
    }

    // m�todo para consultar o usu�rio
    
    private Usuario consultarUsuario() {
        
    	String cpf = showInputDialog(null, " Digite o cpf do usu�rio: ");

        return util.encontrarUsuario(cpf);
    }

    // m�todo para consultar o bilhete �nico
    
    private BilheteUnico consultarBilhete(Usuario usuario) {
        
    	return util.encontrarBilhete(usuario);
    }

    // m�todo para listar todos os bilhetes
    
    private String listarBilhete() {
        
    	BilheteUnico[] bilhetes = util.listarBilhete();
        
    	String aux = "";
    	
        for (int i = 0; i < bilhetes.length; i++) {
            aux += bilhetes[i] + "\n";
        }

        return aux;
    }
   
    // tipo de usu�rio (estudante/ professor/ normal)
   
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
   
    // menus com as op��es
    
    private String gerarMenu1() {

 		String aux = "";
 		aux += "1. Administrador\n";
 		aux += "2. Usu�rio\n";
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

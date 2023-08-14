import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Menu {

	Util util = new Util();
	
	 public void menu() {
	        
	    	int opcao;
	        boolean b = true;
	        do {
	        	
	        	opcao = parseInt(showInputDialog(gerarMenu()));
	            switch (opcao) {
	                case 1:
	                    util.registrarCarga();
	                    break;
	                case 2:
	                    util.pesquisarCarga();
	                    break;
	                case 3:
		                util.imprimirCarga();
	                    break;
	                case 4:
		                util.excluirCarga();
	                    break;
	                case 5:
	                    b = false;
	                    break; 
	                default:
	                    showMessageDialog(null, "Opção inválida!");
	                    break;
	            }
	        
	        } while (b);
	    }
	  
	 private String gerarMenu() {

	 		String aux = "";
	 		aux += "Sistema de Reserva de Cargas\n";
	 		aux += "1. Reservar Carga\n";
	 		aux += "2. Pesquisar Carga\n";
	 		aux += "3. Imprimir Cargas Reservadas\n";
	 		aux += "4. Excluir Carga\n";
	 		aux += "5. Finalizar\n";
	 		return aux;

	 	}

}
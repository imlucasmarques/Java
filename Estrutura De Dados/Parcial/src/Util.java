import static javax.swing.JOptionPane.getRootFrame;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {

	private Lista<Carga> reservaCargas = new Lista<Carga>();
	
	int pI = 0; // peso inicial
	int pM = 10000; // peso máximo
	
	// método para reservar um carga
	public void registrarCarga() {
		
		// entrada de dados para a classe carga
		
		 String cnpj = showInputDialog(" Digite o CNPJ: ");
		 
	     String nomeEmpresa = showInputDialog(" Digite o nome da empresa: ");
	       
	     String destinoCarga = showInputDialog(" Digite o destino da carga: ");
	        
	        double pesoCarga = 0;

	        do {
	            String pesoCargaTotal = showInputDialog("Digite o peso total da carga:");

	            // try e catch (humberto ensinou)
	            
	            try {
	                pesoCarga = Double.parseDouble(pesoCargaTotal);
	            } catch (NumberFormatException e) {
	                showMessageDialog(getRootFrame(), " Valor inválido.");
	            }
	        } while (pesoCarga == 0);

	        if (pesoCarga + pI > pM) {
	            showMessageDialog(getRootFrame(), " O peso ultrapassou o limite. ");
	        } else {
	            pI += pesoCarga;
	            reservaCargas.inserirInicio(new Carga(cnpj, nomeEmpresa, destinoCarga, pesoCarga));
	        }

	    }
	
	// método para pesquisar e imprimir uma reserva especifica
	public void pesquisarCarga() {
		
		  String cnpj = showInputDialog(" Informe o CNPJ: ");
	        
		  	if (cnpj == null) {
	            return;
	        }

	        No<Carga> buscar = reservaCargas.pesquisar(new Carga(cnpj, null, null, 0));

	        if (buscar == null) {
	            showMessageDialog(getRootFrame(), " Carga não registrada no sistema. ");
	        } else {
	            showMessageDialog(getRootFrame(), buscar.getDado());
	        }
	    }
	
	// método para imprimir todas as reservas de cargas
	public void imprimirCarga() {
		
	String aux = "";
    	
        if (reservaCargas.getTamanho() > 0) {
           
        	No<Carga> imprimir = reservaCargas.getInicio();
            
            do {
               
            	aux += imprimir.getDado().toString();
                imprimir = imprimir.getLadoDireito();
                
            } while (imprimir != null);

        }
        
        showMessageDialog(getRootFrame(), aux);
        
	}

	// método para excluir uma reserv de carga
	public void excluirCarga() {
		
		 String cnpj = showInputDialog(" Informe o CNPJ: ");

	        boolean deletar = reservaCargas.remover(new Carga(cnpj, null, null, 0));

	        if (deletar) {
	            showMessageDialog(getRootFrame(), " Carga excluída. ");
	        } 

	        }
	  
}
	


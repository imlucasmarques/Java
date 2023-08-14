

import java.util.Map;
import java.util.TreeMap;
import static javax.swing.JOptionPane.getRootFrame;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;

public class Util {


	TreeMap<String, Carga> cargas = new TreeMap<>();
	
	int pM = 10000; // peso máximo
	
	// mtodo para reservar um carga
	public void registrarCarga() {
		
		if(pM <= 0) {
			 showMessageDialog(getRootFrame(), " O peso m�ximo foi atingido. ");
			 return;
		}
		
		boolean check = true;
		
		Carga carga = new Carga();
		
		carga.setCnpj(showInputDialog(" Digite o CNPJ: "));
		carga.setNomeEmpresa(showInputDialog(" Digite o nome da empresa: "));
		carga.setDestinoCarga(showInputDialog(" Digite o destino da carga: "));
		
		while(check) {
			
			carga.setPesoTotal(parseDouble(showInputDialog(" Digite o peso total da carga, peso disponivel  " + pM)));
			if (carga.getPesoTotal() == 0) {
				showMessageDialog(getRootFrame(), " O valor 0 n�o � valido. ");
				check = true;
				return;
			}else {
				check = false;
			}
			
			if((pM - carga.getPesoTotal()) < 0) {
				 showMessageDialog(getRootFrame(), " O peso ultrapassou o limite do navio. ");
				check = true;
				return;	
			}else {
				check = false;
			}
			
	}
			cargas.put(carga.getCnpj(), carga);
			pM -= carga.getPesoTotal();
			showMessageDialog(getRootFrame(), "Carga Registrada com sucesso!");
		}
		
	// metodo para pesquisar e imprimir uma reserva especifica
	public void pesquisarCarga() {
		
		 String cnpj = showInputDialog(" Informe o CNPJ: ");
		 
		 for (Map.Entry<String, Carga> carga : cargas.entrySet()) {
			 if(carga.getKey().equalsIgnoreCase(cnpj)) {
				 showMessageDialog(getRootFrame(),"Carga Encontrada");
				 showMessageDialog(getRootFrame(),carga.getValue());
				 return;
			 }
			 
		 }
		 
		 showMessageDialog(getRootFrame()," Carga n�o registrada no sistema. ");
}
		
	// metodo para imprimir todas as reservas de cargas
	public void imprimirCarga() {
		
	String aux = "";
	
	for (Map.Entry<String, Carga> carga : cargas.entrySet()) {
		aux += carga.getValue() + "\n";
	}
	 showMessageDialog(getRootFrame(), aux );
        
	}

	// metodo para excluir uma reserv de carga
	public void excluirCarga() {
		
		String cnpj = showInputDialog(" Informe o CNPJ: ");
		
		 for (Map.Entry<String, Carga> carga : cargas.entrySet()) {
			 if(carga.getKey().equalsIgnoreCase(cnpj)) {
				 pM += carga.getValue().getPesoTotal();
				 cargas.remove(cnpj);
				 showMessageDialog(getRootFrame(), " Carga exclu�da. ");
				 return;
			 }
		 }
	        }
	  
}
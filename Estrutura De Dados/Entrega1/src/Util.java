import java.util.Random;

public class Util {


		static Lista<BilheteUnico> bilhetes = new Lista<BilheteUnico>();
	    static Lista<Usuario> usuarios = new Lista<Usuario>();

	    public BilheteUnico cadastarBilhete(double valorDaTarifa, Usuario usuario) {
	       
	    	BilheteUnico bilhete = new BilheteUnico(geradorNumero(), 0.0, valorDaTarifa, usuario);

	        if (Util.bilhetes.pesquisar(bilhete) != null) {
	            return null;
	        }

	        Util.bilhetes.inserirInicio(bilhete);
	        return bilhete;
	    }

	    public BilheteUnico encontrarBilhete(Usuario usuario) {
		     
	    	No<BilheteUnico> buscar = bilhetes.pesquisar(new BilheteUnico(0, 0, 0, usuario));
	        if (buscar == null) {
	            return null;
	        } else {
	            return buscar.getDado();
	        }
	    }
	    
	    public String consultarBilhete(Usuario usuario) {
		     

	        	System.out.println("2");
	            return bilhetes.consultar(new BilheteUnico(usuario));
	        
	    }

	    public BilheteUnico[] listarBilhetes() {
	      
	    	No<BilheteUnico> aux = bilhetes.getInicio();
	        BilheteUnico[] output = new BilheteUnico[bilhetes.getTamanho()];
	        int lista = 0;

	        do {
	            output[lista] = aux.getDado();
	            aux = aux.getLadoDireito();
	            lista++;
	        } while (aux != null);

	        return output;
	    }
    
	    public Usuario cadastrarUsuario(Usuario usuarioNovo) {
		       
	    	if (Util.usuarios.pesquisar(usuarioNovo) != null) {
	            return null;
	        }

	        Util.usuarios.inserirInicio(usuarioNovo);
	        return usuarioNovo;
	    }

	    public Usuario encontrarUsuario(String cpf) {
	      
	    	No<Usuario> busca = usuarios.pesquisar(new Usuario("" , cpf, ""));
	        if (busca != null) {
	            return busca.getDado();
	        } else {
	            return null;
	        }
	    }
	    
	    private int geradorNumero() {
	      
	    	Random gerador = new Random();
	        int numero = gerador.nextInt(100, 5000);
	        return numero;
	    }

	 
}
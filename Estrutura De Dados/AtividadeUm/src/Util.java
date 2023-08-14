
import java.util.Random;

public class Util {
   
	//  manipula��o dos elementos que ficam armazenados na lista

	private Lista<BilheteUnico> bilhetes = new Lista<BilheteUnico>();
    private Lista<Usuario> usuarios = new Lista<Usuario>();

    // m�todo para salvar o bilhere na lista
    
    public BilheteUnico inserirBilhete(double valorDaTarifa, Usuario usuario) {
       
    	BilheteUnico bilhete = new BilheteUnico(geradorNumero(), 0.0, valorDaTarifa, usuario);

        if (this.bilhetes.pesquisar(bilhete) != null) {
            return null;
        }

        
        this.bilhetes.inserirInicio(bilhete);
        
        return bilhete;
    }

    // m�todo para buscar as informa��es do bilhete na lista
    
    public BilheteUnico encontrarBilhete(Usuario usuario) {
       
    	No<BilheteUnico> buscar = bilhetes.pesquisar(new BilheteUnico(0, 0, 0, usuario));
       
    	if (buscar == null) {
            return null;
        } else {
            return buscar.getDado();
        }
    }

    // m�todo para listar todos os bilhetes �nicos cadastardos na lista
    
    public BilheteUnico[] listarBilhete() {
       
    	No<BilheteUnico> aux = bilhetes.getInicio();
       
    	BilheteUnico[] dados = new BilheteUnico[bilhetes.getTamanho()];
       
    	int lista = 0;

        do {
            dados[lista] = aux.getDado();
            aux = aux.getLadoDireito();
            lista++;
        } while (aux != null);

        return dados;
    }
  
    // m�todo para verificar se o usu�rio j� foi cadastrado ou n�o, para ser inserido na lista
    
    public Usuario verificarUsuario(Usuario newUsuario) {
      
    	if (this.usuarios.pesquisar(newUsuario) != null) {
            return null;
        }

        this.usuarios.inserirInicio(newUsuario);
        return newUsuario;
    }

    // m�todo para buscar as informa��es do usu�rio na lista
    
    public Usuario encontrarUsuario(String cpf) {
       
    	No<Usuario> buscar = usuarios.pesquisar(new Usuario("", cpf, ""));
       
    	if (buscar != null) {
            return buscar.getDado();
        } else {
            return null;
        }
    }

    // m�todo para gerar o n�mero do bilhete
    
    private int geradorNumero() {
        
    	Random gerador = new Random();
    	
        int numero = gerador.nextInt(100, 5000);
        
        return numero;
    }
}

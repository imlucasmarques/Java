
public class exemplo1 {
	
		static int x = 10; // vari�vel global --> POO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // vari�veis locais --> escopo da vari�vel
		int y = 3;
		System.out.println(somar(x, y)); // x � um argumento --> valor que vai para o m�todo
		}
	
	public static int somar(int x, int y) { // x � um par�metro --> valor que chega no m�todo
		int resultado;
		resultado = x + y;
		return resultado;
}
	
}
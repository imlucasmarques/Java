
public class exemplo1 {
	
		static int x = 10; // variável global --> POO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // variáveis locais --> escopo da variável
		int y = 3;
		System.out.println(somar(x, y)); // x é um argumento --> valor que vai para o método
		}
	
	public static int somar(int x, int y) { // x é um parâmetro --> valor que chega no método
		int resultado;
		resultado = x + y;
		return resultado;
}
	
}
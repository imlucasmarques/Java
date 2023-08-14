
public class exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fatorial(3));
	}

	public static double fatorial(int valor) {
		
		if (valor == 1) return 1;
		
		return valor * fatorial(valor - 1);
}

}

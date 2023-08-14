
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(somar(x, x.length));
	}

	public static int somar (int[] x, int n) {
		if (n == 0) return 0;
		
		return x[n -1] + somar(x, n - 1);
	}
}

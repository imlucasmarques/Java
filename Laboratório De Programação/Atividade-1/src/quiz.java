
public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2, y = 3, z = 5;

       meuMetodo(x, y, z);

        System.out.println("E a surpresa é -> "+x);     

    }

   

    public static void meuMetodo(int x, int y, int z) {

        int aux = x;

        x = y;

        y = z;

        z = aux;
	}

}

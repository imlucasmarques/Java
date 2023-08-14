import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		 int[] m = {47, 19, 59, 35, 56, 2, 17, 42, 14, 23, 67, 32, 16};

         int u = 0;

         for(int i = 0; i < m.length; i++) {

              if(m[i] >= 42) {

                   u++;

              }

         }

         System.out.println(u);
	}

}

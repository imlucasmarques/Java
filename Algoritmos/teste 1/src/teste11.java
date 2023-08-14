
public class teste11 {

     public static void main(String[] args) {

         double y = 16.5, z = 2.1;

         int val = conta(y, z) + 5;

         System.out.println(val);

 

     }

    

     public static int conta(double m, double n) {

         int i = 10, res = 2;

         double k = 0.0;

         while(k <= m) {

              k = k + n * 2;

              i = i / res;

              res = res + i;

         }

         return res;

     }

}
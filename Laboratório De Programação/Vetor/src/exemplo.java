import java.util.Random;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random banana = new Random();
		
		int x = banana.nextInt()%100;
		double y = banana.nextDouble() * 200;
		

		System.out.println(x);
		System.out.println(y);
	
	}

}

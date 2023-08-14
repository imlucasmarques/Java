
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veiculo v = new Veiculo("ABC12", "Audi");
		Veiculo v1 = new Veiculo("ABC12", "Audi");
		
		System.out.println(v); // v.toString();
		
		if(v.equals(v1)) {
			System.out.println(" Os carros são iguais ");
		} else {
			System.out.println(" Os carros não são iguais");
		}
	}

}

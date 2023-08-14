import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Util util = new Util();
		
		Scanner teclado = new Scanner(System.in);
		
		int id = 0;

		int opcao;

		do {

			System.out.println(
					" Escolha uma opção: \n \n 1. Cadastrar produto \n 2. Pesquisar produto \n 3. Listar produto \n 4. Exluir produto \n 5. Finalizar");
			System.out.println("");
			System.out.print(" Opção: ");

			opcao = teclado.nextInt();
			System.out.println("");

			if (opcao > 5 || opcao < 1) {
				System.out.println(" ERRO! Escolha uma das opções diponíveis acima. Tente novamente.");
				return;
			} else if (opcao == 1) {
				if (id < 10) {
					if (util.cadastrar(id) && id <= 9) {
						id++;
					}
				} else {
					System.out.println(" Só é possível cadastrar até 10 produtos. ");
					System.out.println("");
				}

			} else if (opcao == 2) {
				util.pesquisar(id);

			} else if (opcao == 3) {
				util.listar(id);

			} else if (opcao == 4) {
				util.excluir(id);
				id--;

			} else {
				System.out.println(" Navegação finalizada. ");
				return;
			}

		} while (true);

	}

}

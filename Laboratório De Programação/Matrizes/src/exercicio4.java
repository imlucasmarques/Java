import java.util.Random;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int totalVendedor;
		double total;
		double maiorVenda, menorVenda;
		int linhaMaiorVenda, linhaMenorVenda;
		
		System.out.print(" total de vendedores: ");
		totalVendedor = teclado.nextInt();
		
		String[] mes = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN"};
		double[][] venda = new double[totalVendedor][mes.length+1];
		String[] vendedor = new String[totalVendedor];
		
		// entrada do nome dos vendedores e geração das vendas
		
		teclado.nextLine();
		
		for(int i = 0; i < totalVendedor; i++) {
			System.out.print(" Nome do vendedor " + (i+1) +  " : " );
			vendedor[i] = teclado.nextLine();
			
			// gerar as vendas
			total = 0;
			for(int j = 0; j < mes.length; j++) {
				venda[i][j] = gerador.nextInt(4);
				total += venda[i][j];
			}
			venda[i][mes.length] = total;
		}
		
		// impressão da tabela de vendas
		System.out.println("\nTabela de vendas");
		for(int i = 0; i < totalVendedor; i++) {
			for(int j = 0; j < mes.length; j++) {
				System.out.print(String.format("%.2f\t", venda[i][j]));
			}
			System.out.println();
		}
		
		// a --> impressão do total de vendes por vendedor
		System.out.println();
		System.out.println("Total de vendas por vendedor");
		for(int i = 0; i < totalVendedor; i++) {
			System.out.println(vendedor[i] + " --> R$ " + String.format("%.2f\t", venda[i][mes.length]));
		}
		// b --> impressão do total de vendas pro mês
		System.out.println();
		System.out.println("Total de vendas por mês");
		for(int j = 0; j < mes.length; j++) {
			total = 0;
			for(int i = 0; i < vendedor.length; i++) {
				total += venda[i][j];
			}
			System.out.println(mes[j] + " --> R$ " + String.format("%.2f", total));
		}
		
		// c --> vendedor que teve a maior venda
		System.out.println();
		System.out.println("Vendedor com a maior venda");
		maiorVenda = Double.MIN_VALUE;
		linhaMaiorVenda = 0;
		for(int i = 0; i < totalVendedor; i++) {
			if(venda[i][mes.length] > maiorVenda) {
				maiorVenda = venda[i][mes.length];
				linhaMaiorVenda = i;
			}
		}
		System.out.println(vendedor[linhaMaiorVenda]);
		
		// d --> vendedor que teve a menro venda
		System.out.println();
		System.out.println("Vendedor com a menor venda");
		menorVenda = Double.MAX_VALUE;
		linhaMenorVenda = 0;
		for(int i = 0; i < totalVendedor; i++) {
			if(venda[i][mes.length] > menorVenda) {
				menorVenda = venda[i][mes.length];
				linhaMenorVenda = i;
			}
		}
		System.out.println(vendedor[linhaMenorVenda]);
		
	}

	}


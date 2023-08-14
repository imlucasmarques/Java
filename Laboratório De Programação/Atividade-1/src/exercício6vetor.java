import java.util.Scanner;

public class exercício6vetor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		
		int qnt; // quantidade de salas de aula
		
		System.out.print(" Quantas salas de aula há na universidade? " );
		qnt = teclado.nextInt();
		System.out.println("");

		int salas [] = new int [qnt];
		
		// FOR para digitar a quantidade de alunos de cada sala de aula
		for(int i = 0; i < salas.length; i++) {
			System.out.print(" Quantos alunos há na sala " + (i+1) + " ? ");
			salas[i] = teclado.nextInt();
		    }
		
			System.out.println("");
			
			// FOR das salas 
			for(int i = 0; i < salas.length; i++) {
				System.out.println("");
				System.out.println(" DIGITE AS MÉDIAS DE CADA ALUNO DA SALA " + (i+1));
				double notas[] = new double[salas[i]]; 
				double media = 0; 
				double acima = 0; // alunos acima da média
				double x; //porcentagem de alunos acima da média
				
				    // FOR para  para digitar a média de cada aluno de cada sala
				    for(int j = 0; j < salas[i]; j++) {
				    	System.out.print(" Média do aluno(a) " + (j+1) + " da sala " + (i+1) + " : ");
				    	notas[j] = teclado.nextDouble();
				    }
				    
				    // FOR para somar as notas de todos os alunos de uma sala
				    for(int k = 0; k < salas[i]; k++) {
				       media = media + notas[k];
				    }  
				    
				    media = media / salas[i];
				    
				    // FOR para saber quantos alunos estão acima da media (porcentagem)
				    for(int l = 0; l < salas[i]; l++) {
				    	if(notas[l] > media  ) {
				    		acima++;
				    	}
				    }
				    
				    // porcentagem de alunos acima da média
				    
				    x = acima * 100 / salas[i];
				    
				    // média de cada sala
				    
				    System.out.println(" A média da sala " + (i+1) + " é : " + media );
				    
				    System.out.println(" Número de alunos acima da média : " + acima);
				    
				    System.out.println(" Porcentagem de alunos acima da média : " + String.format("%.3f", x) + "%");	    
	    } 
	}
}

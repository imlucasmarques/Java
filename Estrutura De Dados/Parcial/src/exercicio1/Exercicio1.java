package exercicio1;

import java.util.Stack;

public class Exercicio1 {
   
	   public static void main(String[] args) {
	       
	    	Stack<Integer> pilha = new Stack<>();
	       
	    	pilha.push(15);
	        pilha.push(16);
	        pilha.push(17);
	        pilha.push(18);
	        
	        Stack<Integer> pilha2 = new Stack<>();
	       
	        pilha2.push(15);
	        pilha2.push(16);
	        pilha2.push(17);
	        pilha2.push(18);
	        
	        boolean iguais = comparador(pilha, pilha2);
	        
	        System.out.println(iguais); 
	        
	        pilha2.pop();
	        pilha2.push(4);
	        
	        iguais = comparador(pilha, pilha2);
	        System.out.println("As pilhas são iguais? --> " + iguais);
	    }
	
    public static boolean comparador(Stack<Integer> pilha, Stack<Integer> pilha2) {
      
       
    	if (pilha.size() != pilha2.size()) {
            return false;
        }
        
     
        while (!pilha.isEmpty()) {
         
        	int x = pilha.pop();
            int y = pilha2.pop();
            
            if (x != y) {
                return false;
            }
        }
        
        return true;
    }
    
 
}


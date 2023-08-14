package Adega;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// declaração das variáveis
		Stack<Vinho> adega = new Stack<>();
		Stack<Vinho> aux = new Stack<>();
		
		// inserir 7 vinhos na adega
		adega.push(new Vinho("a", 2000));
		adega.push(new Vinho("b", 1976));
		adega.push(new Vinho("c", 1945));
		adega.push(new Vinho("d", 2010));
		adega.push(new Vinho("e", 2002));
		adega.push(new Vinho("f", 2018));
		adega.push(new Vinho("g", 2021));
		
		// vinho para abrir em uma ocasião especial
		System.out.println(" Vinho para abrir em uma ocasião especial ");
		System.out.println(adega.peek());
		
		// 5 vinhos mais antigos da adega
		System.out.println();
		System.out.println(" Vinhos mais antigos: ");
		while(adega.size() > 5) {
			aux.push(adega.pop());
		}
		
		while(!adega.empty()) {
			System.out.println(adega.peek());
			aux.push(adega.pop());
		}
		
		// voltando as garrafas para a adega
		
		while (!aux.empty()) {
			adega.push(aux.pop());
		}
	}
}

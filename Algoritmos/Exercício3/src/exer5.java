
import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		String t1, t2, t3;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("O animal é vertebrado ou invertebrado? ");
		t1 = teclado.next();

		while (!t1.equalsIgnoreCase("vertebrado") && !t1.equalsIgnoreCase("invertebrado")) {
			System.out.println("");
			System.out.println("Digite apenas se o animal é vertebrado ou invertebrado.");
			System.out.println("");
			System.out.print("O animal é vertebrado ou invertebrado? ");
			t1 = teclado.next();
		}
		if (t1.equalsIgnoreCase("Vertebrado")) {
			System.out.print("O animal é uma ave ou um mamifero? ");
			t2 = teclado.next();

			while (!t2.equalsIgnoreCase("ave") && !t2.equalsIgnoreCase("mamifero")) {
				System.out.println("");
				System.out.println("Digite apenas se o animal é uma ave ou um mamífero.");
				System.out.println("");
				System.out.print("O animal é uma ave ou um mamifero? ");
				t2 = teclado.next();
			}

			if (t2.equalsIgnoreCase("ave")) {
				System.out.print("O animal é carnivoro ou onivoro? ");
				t3 = teclado.next();

				while (!t3.equalsIgnoreCase("carnivoro") && !t3.equalsIgnoreCase("onivoro")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal é carnivoro ou onivoro.");
					System.out.println("");
					System.out.print("O animal é uma carnivoro ou onivoro? ");
					t3 = teclado.next();
				}
				if (t3.equalsIgnoreCase("carnivoro")) {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma águia.");
				} else {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma pomba.");
				}

			} else {
				System.out.print("O animal é onivoro ou herbivoro? ");
				t3 = teclado.next();
				while (!t3.equalsIgnoreCase("onivoro") && !t3.equalsIgnoreCase("herbivoro")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal é onivoro ou herbivoro.");
					System.out.println("");
					System.out.print("O animal é onivoro ou herbivoro? ");
					t3 = teclado.next();
				}
				if(t3.equalsIgnoreCase("onivoro")) {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é um homem.");
				}else {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma vaca.");
				}
			}
		}else {
			if (t1.equalsIgnoreCase("Invertebrado")) {
				System.out.print("O animal é um inseto ou um anelideo? ");
				t2 = teclado.next();

				while (!t2.equalsIgnoreCase("inseto") && !t2.equalsIgnoreCase("anelideo")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal é um inseto ou um anelideo.");
					System.out.println("");
					System.out.print("O animal é um inseto ou um anelideo? ");
					t2 = teclado.next();
				}

				if (t2.equalsIgnoreCase("inseto")) {
					System.out.print("O animal é hematofago ou herbivoro? ");
					t3 = teclado.next();

					while (!t3.equalsIgnoreCase("hematofago") && !t3.equalsIgnoreCase("herbivoro")) {
						System.out.println("");
						System.out.println("Digite apenas se o animal é hematofago ou herbivoro.");
						System.out.println("");
						System.out.print("O animal é uma hematofago ou onivoro? ");
						t3 = teclado.next();
					}
					if (t3.equalsIgnoreCase("hematofago")) {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma pulga.");
					} else {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma lagarta.");
					}

				} else {
					System.out.print("O animal é hematofago ou onivoro? ");
					t3 = teclado.next();
					while (!t3.equalsIgnoreCase("hematofago") && !t3.equalsIgnoreCase("onivoro")) {
						System.out.println("");
						System.out.println("Digite apenas se o animal é hematofago ou onivoro.");
						System.out.println("");
						System.out.print("O animal é hematofago ou onivoro? ");
						t3 = teclado.next();
					}
					if(t3.equalsIgnoreCase("hematofago")) {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é um sanguessuga.");
					}else {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal é uma minhoca.");
					}
				}
			}
		}
	}
}


import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		String t1, t2, t3;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("O animal � vertebrado ou invertebrado? ");
		t1 = teclado.next();

		while (!t1.equalsIgnoreCase("vertebrado") && !t1.equalsIgnoreCase("invertebrado")) {
			System.out.println("");
			System.out.println("Digite apenas se o animal � vertebrado ou invertebrado.");
			System.out.println("");
			System.out.print("O animal � vertebrado ou invertebrado? ");
			t1 = teclado.next();
		}
		if (t1.equalsIgnoreCase("Vertebrado")) {
			System.out.print("O animal � uma ave ou um mamifero? ");
			t2 = teclado.next();

			while (!t2.equalsIgnoreCase("ave") && !t2.equalsIgnoreCase("mamifero")) {
				System.out.println("");
				System.out.println("Digite apenas se o animal � uma ave ou um mam�fero.");
				System.out.println("");
				System.out.print("O animal � uma ave ou um mamifero? ");
				t2 = teclado.next();
			}

			if (t2.equalsIgnoreCase("ave")) {
				System.out.print("O animal � carnivoro ou onivoro? ");
				t3 = teclado.next();

				while (!t3.equalsIgnoreCase("carnivoro") && !t3.equalsIgnoreCase("onivoro")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal � carnivoro ou onivoro.");
					System.out.println("");
					System.out.print("O animal � uma carnivoro ou onivoro? ");
					t3 = teclado.next();
				}
				if (t3.equalsIgnoreCase("carnivoro")) {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma �guia.");
				} else {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma pomba.");
				}

			} else {
				System.out.print("O animal � onivoro ou herbivoro? ");
				t3 = teclado.next();
				while (!t3.equalsIgnoreCase("onivoro") && !t3.equalsIgnoreCase("herbivoro")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal � onivoro ou herbivoro.");
					System.out.println("");
					System.out.print("O animal � onivoro ou herbivoro? ");
					t3 = teclado.next();
				}
				if(t3.equalsIgnoreCase("onivoro")) {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � um homem.");
				}else {
					System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma vaca.");
				}
			}
		}else {
			if (t1.equalsIgnoreCase("Invertebrado")) {
				System.out.print("O animal � um inseto ou um anelideo? ");
				t2 = teclado.next();

				while (!t2.equalsIgnoreCase("inseto") && !t2.equalsIgnoreCase("anelideo")) {
					System.out.println("");
					System.out.println("Digite apenas se o animal � um inseto ou um anelideo.");
					System.out.println("");
					System.out.print("O animal � um inseto ou um anelideo? ");
					t2 = teclado.next();
				}

				if (t2.equalsIgnoreCase("inseto")) {
					System.out.print("O animal � hematofago ou herbivoro? ");
					t3 = teclado.next();

					while (!t3.equalsIgnoreCase("hematofago") && !t3.equalsIgnoreCase("herbivoro")) {
						System.out.println("");
						System.out.println("Digite apenas se o animal � hematofago ou herbivoro.");
						System.out.println("");
						System.out.print("O animal � uma hematofago ou onivoro? ");
						t3 = teclado.next();
					}
					if (t3.equalsIgnoreCase("hematofago")) {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma pulga.");
					} else {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma lagarta.");
					}

				} else {
					System.out.print("O animal � hematofago ou onivoro? ");
					t3 = teclado.next();
					while (!t3.equalsIgnoreCase("hematofago") && !t3.equalsIgnoreCase("onivoro")) {
						System.out.println("");
						System.out.println("Digite apenas se o animal � hematofago ou onivoro.");
						System.out.println("");
						System.out.print("O animal � hematofago ou onivoro? ");
						t3 = teclado.next();
					}
					if(t3.equalsIgnoreCase("hematofago")) {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � um sanguessuga.");
					}else {
						System.out.println("De acordo com as escolhas: " + t1 + ", " + t2 + " e " + t3 + ". O animal � uma minhoca.");
					}
				}
			}
		}
	}
}

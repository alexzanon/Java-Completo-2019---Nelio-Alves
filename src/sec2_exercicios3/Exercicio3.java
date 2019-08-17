package sec2_exercicios3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int produto = sc.nextInt();
		
		while (produto != 4) {
			if (produto == 1) {
				alcool = alcool + 1;
			}
			else if (produto == 2) {
				gasolina = gasolina + 1;
			}
			else if (produto == 3) {
				diesel = diesel + 1;
			}
			
			produto = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}

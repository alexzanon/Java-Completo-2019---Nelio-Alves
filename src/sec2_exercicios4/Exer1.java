package sec2_exercicios4;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int resultado = 0;
		
		if (n > 2 && n < 1000) {
			
			for (int i = 1; i <= 10 ; i++) {
				resultado = i * n;
				System.out.println(i + " x " + n + " = " + resultado);
				resultado = 0;
			}
			
		}
		else {
			System.out.println("Valor nao suportado");
		}
		
		sc.close();

	}

}

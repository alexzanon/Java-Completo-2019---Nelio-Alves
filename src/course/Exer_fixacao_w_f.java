package course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer_fixacao_w_f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList valores = new ArrayList();
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int numero = 0;
		
		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();	
		}
		
		for (int i=1; i<=n; i++) {
			System.out.print("Value #" + i + ": ");
			numero = sc.nextInt();
			valores.add(numero);
		}
	
		Collections.sort(valores);
		int maior = (int) valores.get(valores.size()-1);
		System.out.println("Higher = " + maior);
		
		sc.close();

	}

}

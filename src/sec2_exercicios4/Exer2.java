package sec2_exercicios4;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			max = x;
			min = y;
		}
		
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}

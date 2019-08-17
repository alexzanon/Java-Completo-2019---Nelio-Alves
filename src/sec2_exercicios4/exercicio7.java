package sec2_exercicios4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n>=0) {
			
			for (int i=1; i<=n; i++) {
				int a = i * i;
				int b = i * i * i;
				System.out.printf("%d %d %d%n", i, a, b);
				a = 0;
				b = 0;
			}
		}
		
		sc.close();

	}

}

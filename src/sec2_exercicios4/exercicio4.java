package sec2_exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}

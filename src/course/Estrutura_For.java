package course;

import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many intenger numbers are you going to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Value #" + i);
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();

	}

}

package course;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_While {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative number");
		
		sc.close();

	}

}

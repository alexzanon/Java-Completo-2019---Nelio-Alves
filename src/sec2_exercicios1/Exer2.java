package sec2_exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio de um circulo:");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();

	}

}

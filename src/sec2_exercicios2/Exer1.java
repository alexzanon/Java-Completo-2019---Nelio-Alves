package sec2_exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double primeiro, segundo, nota;
		
		System.out.println("Informe a nota do primeiro semestre:");
		primeiro = sc.nextDouble();
		
		System.out.println("Informe a nota do segundo semestre:");
		segundo = sc.nextDouble();
		
		nota = primeiro + segundo;
		
		System.out.printf("NOTA FINAL = %.1f%n", nota);
		
		if (nota < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}

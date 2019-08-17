package sec2_exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a largura do terreno:");
		double largura = sc.nextDouble();
		
		System.out.println("Informe o comprimento do terreno:");
		double comprimento = sc.nextDouble();
		
		System.out.println("Informe o valor do metro quadrado do terreno:");
		double valor = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valor;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}

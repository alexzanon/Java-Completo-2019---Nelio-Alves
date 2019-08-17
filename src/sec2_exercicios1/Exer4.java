package sec2_exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero do funcionario:");
		int numero = sc.nextInt();
		
		System.out.println("Informe o numero de horas trabalhadas:");
		int horas = sc.nextInt();
		
		System.out.println("Informe o valor da hora trabalhada:");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}

package sec2_exercicios1;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo valor inteiro:");
		int b = sc.nextInt();
		
		int total = a + b;
		
		System.out.println("Soma = " + total);
		
		sc.close();

	}

}

package exercicio01;

import java.util.Scanner;

public class ComparadorABC {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, somaAB;
		System.out.println("Digite o número A:");
		a = input.nextInt();
		System.out.println("Digite o número B:");
		b = input.nextInt();
		System.out.println("Digite o número C:");
		c = input.nextInt();
		somaAB = a + b;
		
		System.out.printf("%d + %d = %d ", a, b, somaAB);
		if (somaAB < c) {
			System.out.printf("< %d\n", c);
			System.out.println("A soma de A + B é Menor do que C");
		}
		if (somaAB == c) {
			System.out.printf("= %d\n", c);
			System.out.println("A soma de A + B é Igual a C");
		}
		if (somaAB > c) {
			System.out.printf("> %d\n", c);
			System.out.println("A soma de A + B é Maior do que C");
		}
	}
}

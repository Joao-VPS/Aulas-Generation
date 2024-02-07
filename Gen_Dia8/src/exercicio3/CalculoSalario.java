package exercicio3;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário:");
		Float bruto = leia.nextFloat();
		System.out.println("Digite o valor do adicional noturno:");
		Float noturno = leia.nextFloat();
		System.out.println("Digite o valor da hora extra:");
		Float extras = leia.nextFloat();
		System.out.println("Digite o valor dos descontos:");
		Float descontos = leia.nextFloat();
		
		Float result = bruto + noturno + (extras * 5) - descontos;
		System.out.printf("O salário final é igual a R$%.2f", result);
	}

}

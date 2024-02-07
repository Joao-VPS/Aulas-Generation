package exercicio1;

import java.util.Scanner;

public class AlterarSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o valor do salário:");
		Float salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono:");
		Float abono = leia.nextFloat();
		
		Float result = salario + abono;
		System.out.printf("O valor total da soma é R$%.2f", result);
	}

}

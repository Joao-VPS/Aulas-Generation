package exercicio4;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		Float n1 = leia.nextFloat();
		System.out.println("Digite o segundo valor");
		Float n2 = leia.nextFloat();
		System.out.println("Digite o terceiro valor");
		Float n3 = leia.nextFloat();
		System.out.println("Digite o quarto valor");
		Float n4 = leia.nextFloat();
		
		Float diferenca = (n1 * n2) - (n3 * n4);
		System.out.printf("Diferença: %.2f", diferenca);
	}

}

package exercicio01;

import java.util.Scanner;

public class MultiplosTresCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int inicio, fim;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		inicio = input.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		fim = input.nextInt();
		
		if (inicio < fim) {
			for (int i = inicio; i < fim; i++) {
				if (isMultiple(i)) System.out.printf("%d é múltiplo de 3 e 5\n", i);
			}
		} else {
			System.out.println("Intervalo inválido!");
		}
		
		input.close();
	}

	public static boolean isMultiple(int num) {
		return num % 3 == 0 && num % 5 == 0;
	}
}

package exercicio04;

import java.util.Scanner;

public class SomaDiagonais {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite um número para adicionar à matriz: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.printf("\n\033[1mElementos da diagonal principal:\033[0m %d, %d, %d\n", matriz[0][0], matriz[1][1], matriz[2][2]);
		System.out.printf("\033[1mElementos da diagonal principal:\033[0m %d, %d, %d\n", matriz[0][2], matriz[1][1], matriz[2][0]);
		System.out.printf("\033[1mSoma dos elementos da diagonal principal:\033[0m %d\n", matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.printf("\033[1mSoma dos elementos da diagonal secundária:\033[0m %d\n",matriz[0][2] + matriz[1][1] + matriz[2][0]);
		
		entrada.close();
	}
}

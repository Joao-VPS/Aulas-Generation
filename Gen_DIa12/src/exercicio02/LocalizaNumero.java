package exercicio02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LocalizaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int userNumber;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		while (numeros.size() < 10) {
			int rand = new Random().nextInt(0, 10);
			if (!numeros.contains(rand)) {
				numeros.add(rand);
			}
		}
		
		System.out.println("List: " + numeros);
		System.out.print("Digite o número que você deseja encontrar: ");
		userNumber = entrada.nextInt();
		
		if (numeros.contains(userNumber)) {
			System.out.printf("O número %d está localizado na posição %d", userNumber, numeros.indexOf(userNumber));
		} else {
			System.out.printf("O número %d não foi encontrado!", userNumber);
		}
	}

}

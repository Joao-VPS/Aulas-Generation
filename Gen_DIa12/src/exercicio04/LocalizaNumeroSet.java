package exercicio04;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LocalizaNumeroSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int userNumber;
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		while (numeros.size() < 10) {
			numeros.add(new Random().nextInt(0, 10));
		}
		
		System.out.println("List: " + numeros);
		System.out.print("Digite o número que você deseja encontrar: ");
		userNumber = entrada.nextInt();
		
		if(numeros.contains(userNumber)) {
			System.out.printf("O número %d foi encontrado!", userNumber);
		} else {
			System.out.printf("O número %d não foi encontrado!", userNumber);
		}
	}

}

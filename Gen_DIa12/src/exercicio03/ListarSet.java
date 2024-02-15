package exercicio03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ListarSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numeros.add(entrada.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}

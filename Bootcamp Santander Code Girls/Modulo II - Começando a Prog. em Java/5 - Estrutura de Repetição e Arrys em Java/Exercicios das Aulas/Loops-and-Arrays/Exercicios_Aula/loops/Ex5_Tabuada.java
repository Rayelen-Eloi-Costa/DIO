package loops;

import java.util.Scanner;

/**
 * 
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informaar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaix:
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ....
 * 5 X 10 = 50
 *
 */

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		
		System.out.println("Loop Tabuada");
		System.out.println("=====================================================");
		
		System.out.println("Digite qual Tabuada deseja ver: ");
		int tabuada = scan.nextInt();
		System.out.println("-----------------------------------------------------");
		System.out.println("Tabuada do " + tabuada + ":");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
		
		System.out.println("========================================================");
	}
}



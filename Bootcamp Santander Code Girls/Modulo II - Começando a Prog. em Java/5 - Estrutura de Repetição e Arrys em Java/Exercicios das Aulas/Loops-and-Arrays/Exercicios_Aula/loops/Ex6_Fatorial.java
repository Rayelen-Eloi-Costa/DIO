package loops;

import java.util.Scanner;

/**
 * 
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 *
 */

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Loop Fatorial");
		System.out.println("=====================================================");
		
		System.out.println("Fatorial de: ");
		int fatorial = scan.nextInt();
		System.out.println("-----------------------------------------------------");
		
		int multiplicacao = 1;
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println("Fatorial de " + fatorial + " é " + multiplicacao + ".");
		System.out.println("========================================================");
	}

}

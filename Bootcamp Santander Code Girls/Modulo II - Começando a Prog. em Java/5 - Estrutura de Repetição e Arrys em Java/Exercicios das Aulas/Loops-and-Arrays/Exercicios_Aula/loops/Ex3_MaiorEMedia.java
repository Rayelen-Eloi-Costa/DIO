package loops;

import java.util.Scanner;

/**
 * 
 * Faça um programa que leia 5 números, e informe o maior número e a média desse números.
 *
 */

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		System.out.println("Loop Maior Número e Media");
		System.out.println("-----------------------------------------------------");
		
		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			System.out.println("-----------------------------------------------------");
			count = count + 1;
		} while (count < 5);
		
		System.out.println("A soma de todos os número é " + soma + ".");
		System.out.println("A média de todos os número é " + soma/5 + ".");
		System.out.println("O maior número digitado foi " + maior + ".");
		System.out.println("-----------------------------------------------------");
	}

}

package loops;

import java.util.Scanner;

/**
 * 
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de
 * números pares e a quantidade de números impares.
 *
 */

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		
		System.out.println("Loop Par e Impar");
		System.out.println("=====================================================");
		
		System.out.println("Digite a Quantidade de Números: ");
		quantNumeros = scan.nextInt();
		System.out.println("-----------------------------------------------------");
		
		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			System.out.println("-----------------------------------------------------");
			count++;
		} while (count < quantNumeros);
		
		System.out.println("Quantidade de Pares: " + quantPares);
		System.out.println("Quantidade de Ímpares: " + quantImpares);
		System.out.println("========================================================");
	}

}

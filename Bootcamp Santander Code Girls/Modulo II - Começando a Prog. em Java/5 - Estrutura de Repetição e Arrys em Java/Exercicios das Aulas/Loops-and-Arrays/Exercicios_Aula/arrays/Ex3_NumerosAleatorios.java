package arrays;

import java.util.Random;

/**
 * 
 * Faça um programa que leia 20 números aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 *
 */

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [] numAleatorios = new int [20];
		
		System.out.println("Arrays - Númeroos Aleatorios");
		System.out.println("=============================================");
		
		for (int i = 0 ; i < numAleatorios.length ; i++ ) {
			int numero = random.nextInt(100);
			numAleatorios[i] = numero;
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Números Aleatorios: ");
		for (int numero : numAleatorios) {
			System.out.println(numero + " ");
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Sucessores dos Números Aleatorios: ");
		for (int numero : numAleatorios) {
			System.out.println((numero + 1) + " ");
		}
		
		System.out.println("=============================================");
	}

}

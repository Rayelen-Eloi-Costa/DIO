package arrays;

import java.util.Scanner;

/**
 * 
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 *
 */

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String[] consoantes = new String [6];
		int quantConsoantes = 0;
		
		System.out.println("Arrays - Consoantes");
		System.out.println("=============================================");
		
		int count = 0;
		
		do {
			
			System.out.println("Digite a Letra: ");
			String letra = scan.next();
			
			if (letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") | 
					letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u")) {
				consoantes [count] = letra;
				quantConsoantes++;
			}
			
			count++;
			
		} while(count < consoantes.length);
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Consoantes: ");
		for (String consoante :  consoantes) {
			
			if (consoante != null) {
				System.out.println(consoante + " ");
			}
		}
		System.out.println("=============================================");
	}
}

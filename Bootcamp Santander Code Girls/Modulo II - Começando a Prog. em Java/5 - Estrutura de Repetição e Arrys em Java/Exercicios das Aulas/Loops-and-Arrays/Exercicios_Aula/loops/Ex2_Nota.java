package loops;

import java.util.Scanner;

/**
 * 
 * 
 * Faça um programa que peça uma nota, entre 0 e 10.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até o usuário informar um valor válido.
 *
 */

public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Loop Nota");
		System.out.println("-----------------------------------------------------");
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("NOTA INVÁLIDA !!");
			System.out.println("Digite Novamete: ");
			nota = scan.nextInt();
			System.out.println("-----------------------------------------------------");
		}
	}
}



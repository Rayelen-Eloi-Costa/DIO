package loops;

import java.util.Scanner;

/**
 * 
 * 
 * Faça um programa que leia conjunto de dois valores, o primeiro representa o nome do aluno e o segundo representa a sua idade.
 * (Pare o programa inserido o vaor 0 no campo nome)
 *
 */

public class Ex1_NomeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Loop Nome e Idade");
		System.out.println("(para encerrar no campo 'Nome:' digite 0.)");
		System.out.println("-----------------------------------------------------");
		
		while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			
			if (nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
			System.out.println("-----------------------------------------------------");
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Continue aqui...");
		
	}

}

package dio;

import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// TODO: complete os espaços em branco com sua solução para o problema
		
		System.out.println("Infomre o Número de Habitantes: ");
		int habitantes = input.nextInt();
		
		System.out.println("Infomre o Número de Votos Brancos: ");
		int brancos = input.nextInt();
		
		System.out.println("Infomre o Número de Votos Nulos: ");
		int nulos = input.nextInt();
		
		System.out.println("Infomre o Número de Votos Validos: ");
		int validos = input.nextInt();     

		 
		int pBrancos = (brancos * 100) / habitantes;
		int pNulos = (nulos * 100) / habitantes;
		int pValidos = (validos * 100) / habitantes;


		System.out.println("Brancos: " + pBrancos + "%");

		System.out.println("Nulos: " + pNulos + "%");

		System.out.println("Validos: " + pValidos + "%");

	}

}

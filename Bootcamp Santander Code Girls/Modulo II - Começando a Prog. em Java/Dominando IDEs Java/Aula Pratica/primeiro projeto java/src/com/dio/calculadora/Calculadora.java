package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Informe o Primero Número: ");
		a = scan.nextInt();
		System.out.println("Informe o Segundo Número: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);

	}

	public static int soma (int a, int b) {
		return a + b;
	}
	
	public static int subtracao (int a, int b) {
		return a - b;
	}
	
	public static int divisao (int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
	
}

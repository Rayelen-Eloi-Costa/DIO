package exercicio_1;

/**
 * 
 * @author Rayelen Costa
 * Calcule as 4 operções básicas: soma, subtração, multiplicação e divisão.
 * Sempre 2 valores devem ser passados.
 *
 */

public class Calculadora {
	
	// Soma
	public static void soma (double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
				
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " é igual a " + resultado + ".");
	}
	
	// Subtração
	public static void subtracao (double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
				
		System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é igual a " + resultado + ".");		
	}
	
	// Multiplicação
	public static void mutiplicacao (double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
				
		System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é igual a " + resultado + ".");
	}
	
	// Divisão
	public static void divisao (double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
				
		System.out.println("A divisão de " + numero1 + " por " + numero2 + " é igual a " + resultado + ".");
	}


}

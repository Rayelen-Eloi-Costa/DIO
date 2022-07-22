package exercicio_2;

/**
 * 
 * @author Rayelen Costa
 * Classe de exemplo para  exercicio da Aula 2 de Métodos.
 *
 */

public class Quadrilatero {

	public static void area(double lado) {
		System.out.println("Área do Quadrado: " + lado * lado);
	}
	
	public static void area(double lado, double lado2) {
		System.out.println("Área do Retângulo: " + lado * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do Trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Área do Losangolo: " + (diagonal1 * diagonal2) / 2);
	}


}

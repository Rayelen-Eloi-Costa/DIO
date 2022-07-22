package exercicio_3;

/**
 * 
 * @author Rayelen Costa
 * Classe de exemplo para  exercicio da Aula 3 de Métodos.
 *
 */

public class Quadrilatero {

	public static double area(double lado) {
		return lado * lado;
	}
	
	public static double area(double lado, double lado2) {
		return lado * lado2;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	public static double area(float diagonal1, float diagonal2) {
		return (diagonal1 * diagonal2) / 2;
	}

}

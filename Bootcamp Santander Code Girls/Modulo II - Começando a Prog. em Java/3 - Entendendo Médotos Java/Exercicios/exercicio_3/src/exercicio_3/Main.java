package exercicio_3;

public class Main {

	public static void main(String[] args) {

		// Quadrilatero
		System.out.println("EXERCCICIO RETORNOS");
		double areaQuadrado = Quadrilatero.area(4);
		System.out.println("Área do Quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(10, 4);
		System.out.println("Área do Retângulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(22, 12,7);
		System.out.println("Área do Trapézio: " + areaTrapezio);
		
		double areaLosangolo = Quadrilatero.area(10F, 6F);
		System.out.println("Área do Losangolo: " + areaLosangolo);
	}

}

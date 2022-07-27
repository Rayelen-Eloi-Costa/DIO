package Exercicios_Proposto_01;

 /*Faça um programa que recebe a temperatura média os 6 meses iniciais do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e a maioria das temperaturas acima desta média, e em que mês de fevereiro elas foram entregues etc.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
	        List<Double> temperaturas = new ArrayList<Double>();

	        // Adicionando as Temperaturas na Lista
	        int count = 0;
	        
	        while (true) {
	            if (count == 13) break;
	            
	            if (count == 1) {
	    			System.out.println("Digite a temperatura de Janeiro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 2) {
	    			System.out.println("Digite a temperatura de Fevereiro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 3) {
	    			System.out.println("Digite a temperatura de Março: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 4) {
	    			System.out.println("Digite a temperatura de Abril:");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 5) {
	    			System.out.println("Digite a temperatura de Maio: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 6) {
	    			System.out.println("Digite a temperatura de Junho: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 7) {
	    			System.out.println("Digite a temperatura de Julho: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 8) {
	    			System.out.println("Digite a temperatura de Agosto: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 9) {
	    			System.out.println("Digite a temperatura de Setembro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 10) {
	    			System.out.println("Digite a temperatura de Outubro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 11) {
	    			System.out.println("Digite a temperatura de Novembro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else if (count == 12) {
	    			System.out.println("Digite a temperatura de Dezembro: ");
	    			double temp = scan.nextDouble();
		            temperaturas.add(temp);
	    		} else {
	    			System.out.println("Numero Invalido !!");
	    		}
	            
	            count++;
	        }
	        
	        // Exibindo todas as Temperaturas
	        System.out.println("---------------------------------------------");
	        System.out.print("Todas as temperaturas: ");
	        temperaturas.forEach(t -> System.out.print(t + " "));

	        // Calculando e exibindo a média das Temperaturas
	        double media = temperaturas.stream()
	                .mapToDouble(Double::doubleValue)
	                .average()
	                .orElse(0d);
	        System.out.printf("\nMédia das temperaturas: %.1f\n", media);
	        

	        // Exibindo as temperaturas acima da média25
	        System.out.print("Temperaturas acima da média: ");
	        temperaturas.stream()
	                .filter(t -> t > media)
	                .forEach(t -> System.out.printf("%.1f ", t));

	        // Exibindo o mês das temperaturas acima da média por extenso
	        System.out.println("\n\n Meses das temperaturas acima da média: ");
	        Iterator<Double> iterator = temperaturas.iterator();

	        count = 0;
	        while (iterator.hasNext()) {
	            Double temp = iterator.next();
	            if (temp > media) {
	                switch (count) {
	                    case (0):
	                        System.out.printf("1 - Janeiro: %.1f\n ", temp);
	                        break;
	                    case (1):
	                        System.out.printf("2 - Fevereiro: %.1f\n", temp);
	                        break;
	                    case (2):
	                        System.out.printf("3 - Março: %.1f\n", temp);
	                        break;
	                    case (3):
	                        System.out.printf("4 - Abril: %.1f\n", temp);
	                        break;
	                    case (4):
	                        System.out.printf("5 - Maio: %.1f\n", temp);
	                        break;
	                    case (5):
	                        System.out.printf("6 - Junho: %.1f\n", temp);
	                        break;
	                    case (6):
	                        System.out.printf("7 - Julho: %.1f\n", temp);
	                        break;
	                    case (7):
	                        System.out.printf("8 - Agosto: %.1f\n", temp);
	                        break;
	                    case (8):
	                        System.out.printf("9 - Setembro: %.1f\n", temp);
	                        break;
	                    case (9):
	                        System.out.printf("10 - Outubro: %.1f\n", temp);
	                        break;
	                    case (10):
	                        System.out.printf("11 - Novembro: %.1f\n", temp);
	                        break;
	                    case (11):
	                        System.out.printf("12 - Dezembro: %.1f\n", temp);
	                        break;
	                    default:
	                        System.out.println("Não houve temperatura acima da média.");
	                }
	            }
	            count++;
	            
	        }
	        System.out.println("---------------------------------------------");
	}
}

package Exercicios_Proposto_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
*/

public class Semestral {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        List<Double> temperaturasSemestral = new ArrayList<Double>();
        
        double soma = 0.0;
        
        for (int i = 1; i <= 12; i++) {
            System.out.print("Qual a temperatura do Mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }
        
        double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "℃");
        System.out.println("-----------------------------------------------------");
        
        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " ℃");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " ℃");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " ℃");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " ℃");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " ℃");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " ℃");
                        break;
                    case 6:
                        System.out.println((index + 1) + " - JULHO: " + temp + " ℃");
                        break;
                    case 7:
                        System.out.println((index + 1) + " - AGOSTO: " + temp + " ℃");
                        break;
                    case 8:
                        System.out.println((index + 1) + " - SETEMBRO: " + temp + " ℃");
                        break;
                    case 9:
                        System.out.println((index + 1) + " - OUTUBRO: " + temp + " ℃");
                        break;
                    case 10:
                        System.out.println((index + 1) + " - NOVEMBRO: " + temp + " ℃");
                        break;
                    case 11:
                        System.out.println((index + 1) + " - DEZEMBRO: " + temp + " ℃");
                        break;
                    default:
                        break;
                }
            }
        }
	}

}

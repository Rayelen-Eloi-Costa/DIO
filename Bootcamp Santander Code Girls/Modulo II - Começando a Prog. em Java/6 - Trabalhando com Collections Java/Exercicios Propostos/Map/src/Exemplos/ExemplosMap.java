package Exemplos;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/

public class ExemplosMap {

	public static void main(String[] args) {
		
		System.out.println("Exemplos Map - Parte 1");
		System.out.println("==============================================================================");
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Substitua o consumo do Gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));

//        System.out.println("Exiba o terceiro modelo adicionado: ");

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba os Modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba os Consumos dos Carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba o modelo Mais Econômico e seu Consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo Mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        
        System.out.println("==============================================================================");
        System.out.println("Exemplos Map - Parte 2");
		System.out.println("==============================================================================");
        System.out.println("Exiba o modelo Menos Econômico e seu Consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo Menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        
        System.out.println("------------------------------------------------------------------------------");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba a Média dos Consumos deste dicionário de Carros: " + (soma/carrosPopulares.size()));

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o Consumo Igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba todos os Carros na Ordem em que foram Informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
        	put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exiba o dicionário Ordenado pelo Modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares.toString());


        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Confira se o Dicionário 1 está vazio: " + carrosPopulares.isEmpty());
        System.out.println("Confira se o Dicionário 2 está vazio: " + carrosPopulares2.isEmpty());
        System.out.println("==============================================================================");

	}

}

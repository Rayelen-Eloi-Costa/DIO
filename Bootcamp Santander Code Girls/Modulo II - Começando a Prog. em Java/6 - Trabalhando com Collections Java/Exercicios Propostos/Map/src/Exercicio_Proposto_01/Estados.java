package Exercicio_Proposto_01;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 
- Crie um dicionário e relacione os estados e suas populações;
- Substitua a população do estado do RN por 3.534.165;
- Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
- Exiba a população PE;
- Exiba todos os estados e suas populações na ordem que foi informado;
- Exiba os estados e suas populações em ordem alfabética;
- Exiba o estado com o menor população e sua quantidade;
- Exiba o estado com a maior população e sua quantidade;
- Exiba a soma da população desses estados;
- Exiba a média da população deste dicionário de estados;
- Remova os estados com a população menor que 4.000.000;
- Apague o dicionário de estados;
- Confira se o dicionário está vazio.

 */

public class Estados {

	public static void main(String[] args) {
		System.out.println("Crie um dicionário que Relacione os Estados e suas respectivas Populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("MG", 21411923);
            put("SP", 12396372);
        }};
        System.out.println(populaçãoEstadosNE);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Substitua a População do estado RN por 3.534.165: ");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);

        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Confira se o Estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);
        
        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Exiba a população do Estado PE: " + populaçãoEstadosNE.get("PE"));

        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Exiba Todos os Estados e suas Populaçãos na Ordem em que foram Informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("MG", 21411923);
            put("SP", 12396372);
            put("PB", 4039277);
        }};
        System.out.println(populaçãoEstadosNE2);

        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Exiba Todos os Estados e suas Populações na Ordem Alfabética: ");
        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
        System.out.println(populaçãoEstadosNE3);

        
        System.out.println("--------------------------------------------------------------------------------------");
        Collection<Integer> populacao = populaçãoEstadosNE.values();
        String estadoMaiorPopulacao = " ";
        String estadoMenorPopulacao = " ";
        for (Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o Estado com o Menor População (%s) e seu respectivo Valor (%d)\n", estadoMenorPopulacao, Collections.min(populacao));
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Exiba o Estado com a Maior População (%s) e seu respectivo Valor (%d)\n", estadoMaiorPopulacao, Collections.max(populacao));

        
        System.out.println("--------------------------------------------------------------------------------------");
        int soma = 0;
        Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a Soma das Populações desses Estados: " + soma);
        int soma2 = 0;
       	for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
           soma2 += entry.getValue();
       	}


       	System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Exiba a Média da População deste dicionário de Estados: " + (soma / populaçãoEstadosNE.size()));
        
        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Remova os Estados com a População Menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populaçãoEstadosNE);

        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Apague o dicionario de Estados com suas respectivas Populações Estimadas: ");
        populaçãoEstadosNE.clear();
        System.out.println(populaçãoEstadosNE);

        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Confira se a Lista está Vazia: " + populaçãoEstadosNE.isEmpty());

	}

}

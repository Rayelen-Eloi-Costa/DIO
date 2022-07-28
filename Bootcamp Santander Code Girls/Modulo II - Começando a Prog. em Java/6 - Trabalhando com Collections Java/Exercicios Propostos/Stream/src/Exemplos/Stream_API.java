package Exemplos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_API {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println(" Stream API - Parte 1");
		System.out.println("=====================================================================");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
	      numerosAleatorios.stream()
	               .forEach(System.out::println);
	      //numerosAleatorios.forEach(System.out::println);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
	      /*
	      numerosAleatorios.stream()
	              .limit(5)
	              .collect(Collectors.toSet())
	              .forEach(System.out::println);
	      */
	      Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
	              .limit(6)
	              .collect(Collectors.toSet());
	      System.out.println(numerosAleatorios5Primeiros);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Transforme esta Lista de String em uma Mista de Números Inteiros.");
	      /*
	      numerosAleatorios.stream()
	      		.map(new Function<String, Integer>() {

					@Override
					public Integer apply(String t) {
						return Integer.parseInt(t);
					}
	      		});
	      */
	      numerosAleatorios.stream()
	      		.map(Integer::parseInt)
	      		.collect(Collectors.toList())
	      		.forEach(System.out::println);;
	      
	      System.out.println("=====================================================================");
	      System.out.println(" Stream API - Parte 2");
	      System.out.println("=====================================================================");
	      
	      
	      List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
	             .map(Integer::parseInt).collect(Collectors.toList());
	      
	      List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());
	      		//.forEach(System.out::println);


	      System.out.println("Pegue os Números Pares e Maiores que 2 e coloque em uma Lista:");
	      numerosAleatorios.stream()
	              .map(Integer::parseInt)
	              .filter(i -> i % 2 == 0 && i > 2)
	              .collect(Collectors.toList())
	              .forEach(System.out::println);
	      /*
	      List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
	              .map(Integer::parseInt)
	              .filter(i -> (i % 2 == 0 && i > 2))
	              .collect(Collectors.toList());
	      System.out.println(listParesMaioresQue2);
	       */
	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Mostre a Média dos Números: ");
	      numerosAleatorios.stream()
	              .mapToInt(Integer::parseInt)
	              .average()
	              .ifPresent(System.out::println); //OptionDouble
	      
	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Remova os Valores Ímpares: ");
	      /*
	      numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
	      System.out.println(numerosAleatorios1);
	      */
	      numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
	      System.out.println(numerosAleatoriosInteger);
	      
	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Ignore os 3 Primeiros Elementos da Lista e Imprima o Restante: ");
	      numerosAleatoriosInteger.stream()
	              .skip(3)
	              .forEach(System.out::println);

	      
	      System.out.println("---------------------------------------------------------------------");
	      long countNumerosUnicos = numerosAleatoriosInteger.stream()
	              .distinct()
	              .count();
	      System.out.println("Retirando os Números Repetidos da Lista, quantos números ficam? " + countNumerosUnicos);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.print("Mostre o Menor Valor da Lista: ");
	      numerosAleatoriosInteger.stream()
	              .mapToInt(Integer::intValue)
	              .min()
	              .ifPresent(System.out::println);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.print("Mostre o Maior Valor da Lista: ");
	      numerosAleatoriosInteger.stream()
	              .mapToInt(Integer::intValue)
	              .max()
	              .ifPresent(System.out::println);;

	      
	      System.out.println("---------------------------------------------------------------------");
	      int somaDosNumerosPares = numerosAleatoriosInteger.stream()
	              .filter(i -> (i % 2 == 0))
	              .mapToInt(Integer::intValue)
	              .sum();
	      System.out.println("Pegue apenas os Números Pares e Some: " + somaDosNumerosPares);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Mostre a Lista na Ordem Númerica: ");
	      List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
	              .sorted(Comparator.naturalOrder())
	              .collect(Collectors.toList());
	      System.out.println(numerosOrdemNatural);

	      
	      System.out.println("---------------------------------------------------------------------");
	      System.out.println("Agrupe os Valores Ímpares Múltiplos de 3 ou de 5:");
	      Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
	              .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
	      System.out.println(collectNumerosMultiplosDe3E5);
		
	      System.out.println("=====================================================================");
      

	}

}

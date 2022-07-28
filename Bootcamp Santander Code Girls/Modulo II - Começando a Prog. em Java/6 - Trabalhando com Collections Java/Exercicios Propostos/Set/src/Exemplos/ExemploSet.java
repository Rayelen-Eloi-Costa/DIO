package Exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], fachada:

public class ExemploSet {

	public static void main(String[] args) {
		
		System.out.println("Exemplos Set");
		System.out.println("===========================================================");
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(7d));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("-----------------------------------------------------------");
		Iterator <Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma de todas as notas: " + soma);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exiba a média de todas as notas: " + (soma/notas.size()));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas.toString());
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator <Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Apague todo o conjunto.");
		notas.clear();
		notas3.clear();
		System.out.println(notas);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		System.out.println("Confira se a lista 2 está vazia: " + notas2.isEmpty());
		System.out.println("Confira se a lista 3 está vazia: " + notas3.isEmpty());
		
		System.out.println("===========================================================");
		
		
	}

}

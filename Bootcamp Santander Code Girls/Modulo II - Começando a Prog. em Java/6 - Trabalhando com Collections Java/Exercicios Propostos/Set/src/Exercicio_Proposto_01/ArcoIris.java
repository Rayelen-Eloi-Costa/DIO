package Exercicio_Proposto_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra 'V';
f) Remova todas as cores que não começam com a letra 'V';
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {

	public static void main(String[] args) {
		
		System.out.println("Crie uma conjunto contendo as cores do Arco-Íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Azul-Escuro");
        coresArcoIris.add("Violeta");
        System.out.println(coresArcoIris);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Exiba todas as cores o Arco-Íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("A quantidade de cores que o Arco-Íris tem: " + coresArcoIris.size());
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Exiba as cores em Ordem Alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Exiba as cores na Ordem Inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Azul-Escuro", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Exiba todas as cores que começam com a letra 'V': ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("V")) System.out.println(cor);
        }
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Remova todas as cores que não começam com a letra 'V': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(coresArcoIris);
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
        System.out.println("----------------------------------------------------------------");

	}

}

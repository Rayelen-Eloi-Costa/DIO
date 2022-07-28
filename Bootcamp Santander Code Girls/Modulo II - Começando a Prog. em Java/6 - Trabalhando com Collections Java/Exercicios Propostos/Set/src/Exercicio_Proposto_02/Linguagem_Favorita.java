package Exercicio_Proposto_02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Linguagem_Favorita {

	public static void main(String[] args) {
		
		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 2005, "Geany"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("HTML", 1990, "Adobe Dreamweaver"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1991, "Visual Studio Code"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 2001, "Eclipse"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 2005, "Geany"),
                        new LinguagemFavorita("HTML", 1990, "Adobe Dreamweaver"),
                        new LinguagemFavorita("JavaScript", 1991, "Visual Studio Code"),
                        new LinguagemFavorita("Java", 2001, "Eclipse")
                )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);
        
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------\t Ordem Natural: Nome \t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------\t Ordem IDE \t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------\t Ordem Ano de Criacao e Nome \t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------\t Ordem Nome - Ano de Criacao - IDE \t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

	}

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" + "Nome: '" + nome + '\'' + ", Ano de Criação: " + anoDeCriacao + ", IDE: '" + ide + '\'' + '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

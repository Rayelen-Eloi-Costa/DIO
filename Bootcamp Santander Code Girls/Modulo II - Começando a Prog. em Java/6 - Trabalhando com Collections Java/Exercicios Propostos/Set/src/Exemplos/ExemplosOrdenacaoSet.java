package Exemplos;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
chore um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo do episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, gênero: drama, tempo Episódio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemplosOrdenacaoSet {

	public static void main(String[] args) {
		
		 System.out.println("--\t Ordem Aleatória \t--");
		 Set<Serie> minhasSeries = new HashSet<>(){{
	            add(new Serie("American Horror Story", "Terros", 74));
	            add(new Serie("Grey's Anatomy", "Drama", 43));
	            add(new Serie("South Park", "Comédia", 22));
	        }};
	     for (Serie serie: minhasSeries) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());

	     System.out.println("--------------------------------------------------");
		 System.out.println("--\t Ordem de Inserção \t--");
		 Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
	            add(new Serie("American Horror Story", "Terros", 74));
	            add(new Serie("Grey's Anatomy", "Drama", 43));
	            add(new Serie("South Park", "Comédia", 22));
	        }};
	     for (Serie serie: minhasSeries2) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());
		 
	     
	     System.out.println("--------------------------------------------------");
		 System.out.println("--\t Ordem Natural (Tempo de Episodio - Crescente) \t--");
		 Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
	     for (Serie serie: minhasSeries3) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());
		 
	     
	     System.out.println("--------------------------------------------------");
	     System.out.println("--\t Ordem de Gênero \t--");
		 Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
	     minhasSeries4.addAll(minhasSeries);
	     for (Serie serie: minhasSeries4) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());
	     
	     System.out.println("--------------------------------------------------");
	     System.out.println("--\t Ordenar por Tempo Episódio (Decrescente) \t--");
	     Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
	     minhasSeries5.addAll(minhasSeries);
	     for (Serie serie: minhasSeries5) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());
	     
		 System.out.println("--------------------------------------------------");
		 System.out.println("--\t Ordenar por Nome/Gênero/TempoEpisodio \t--");
		 Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
	        minhasSeries6.addAll(minhasSeries);
	     for (Serie serie: minhasSeries6) System.out.println("Série: " + serie.getNome() + " | Gênero: " + serie.getGenero() + " | Duração: " + serie.getTempoEpisodio());
		 
		 
	}

}

class Serie implements Comparable<Serie>{ 
	private String nome;
    private String genero;
    private Integer tempoEpisodio;
    

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	
	@Override
	public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

    
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

	@Override
    public int compare(Serie g1, Serie g2) {
        int genero = g1.getGenero().compareTo(g2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(g1.getTempoEpisodio(), g2.getTempoEpisodio());
    }
	
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

	@Override
    public int compare(Serie tp1, Serie tp2) {
        int tempoEpisodio = tp2.getTempoEpisodio().compareTo(tp1.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return Integer.compare(tp1.getTempoEpisodio(), tp2.getTempoEpisodio());
    }
	
}


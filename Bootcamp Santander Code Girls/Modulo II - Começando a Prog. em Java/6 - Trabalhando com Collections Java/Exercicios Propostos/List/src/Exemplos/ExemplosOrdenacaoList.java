package Exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dados as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
(nome - idade - cor);
 
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */

public class ExemplosOrdenacaoList {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add (new Gato ("Jon", 18, "preto"));
			add (new Gato ("Simba", 6, "tigrado"));
			add (new Gato ("Jon", 12, "amarelo"));
		}};
		
		System.out.println("--\t Ordem de Inserção \t---");
		System.out.println(meusGatos);
		
		System.out.println("----------------------------------------");
		System.out.println("--\t Ordem de Aleatoria \t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("----------------------------------------");
		System.out.println("--\t Ordem de Natual (Nome) \t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("----------------------------------------");
		System.out.println("--\t Ordem de Idade \t---");
		Collections.sort(meusGatos, new ComparatorIdade());
		// meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("----------------------------------------");
		System.out.println("--\t Ordem de Cor \t---");
		Collections.sort(meusGatos, new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("----------------------------------------");
		System.out.println("--\t Ordenar por Nome/Cor/Idade \t---");
		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
	
		
}

class ComparatorIdade implements Comparator<Gato> {
	
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}


class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}


class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return nome;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
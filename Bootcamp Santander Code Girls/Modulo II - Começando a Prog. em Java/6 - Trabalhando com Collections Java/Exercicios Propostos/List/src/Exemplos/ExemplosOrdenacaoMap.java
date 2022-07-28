package Exemplos;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemplosOrdenacaoMap {

	public static void main(String[] args) {
		
		System.out.println("--\t Ordem Aleatória \t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
        	put(" Austen, Jane", new Livro("Orgulho e Preconceito", 288));
        	put(" Orwell, George", new Livro("1984", 416));
        	put(" Saint-Exupéry, Antoine de", new Livro("O Pequeno Príncipe", 96));
        	put(" Zusak, Markus", new Livro("A Menina que Roubava Livros", 480));
        	put(" Green, Jonh", new Livro("A Culpa é das Estrelas", 255));
        	put(" Collins, Suzanne", new Livro("Jogos Vorazes - Vol. 1", 400));
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--\t Ordem de Inserção \t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
        	put(" Austen, Jane", new Livro("Orgulho e Preconceito", 288));
        	put(" Orwell, George", new Livro("1984", 416));
        	put(" Saint-Exupéry, Antoine de", new Livro("O Pequeno Príncipe", 96));
        	put(" Zusak, Markus", new Livro("A Menina que Roubava Livros", 480));
        	put(" Green, Jonh", new Livro("A Culpa é das Estrelas", 255));
        	put(" Collins, Suzanne", new Livro("Jogos Vorazes - Vol. 1", 400));
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--\t Ordem Alfabética - Autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--\t Ordem Alfabética - Nomes dos Livros \t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
        System.out.println(livro.getValue().getNome() + " - " + livro.getKey());

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--\t Ordem de Número de Página \t--"); 
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
        System.out.println(livro.getValue().getNome() + " - " + livro.getKey() + " - " + livro.getValue().getPaginas());
	}
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome: '" + nome + '\'' +
                ", Paginas:" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}


class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> pg1, Entry<String, Livro> pg2) {
		return pg1.getValue().getPaginas().compareTo(pg2.getValue().getPaginas());
	}

    
}



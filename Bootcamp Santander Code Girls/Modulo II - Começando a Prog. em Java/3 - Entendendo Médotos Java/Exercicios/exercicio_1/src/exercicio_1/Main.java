package exercicio_1;

/**
 * 
 * @author Rayelen Costa
 *
 */

public class Main {


	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("EXERCICIO DA CALCULADORA");
		Calculadora.soma(9, 2.7);
		Calculadora.subtracao(7, 85);
		Calculadora.mutiplicacao(6.8, 9);
		Calculadora.divisao(1000, 5);
		System.out.println("");
		
		// Mensagem
		System.out.println("EXERCICIO DA MENSAGEM");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		System.out.println("");
		
		// Emprétimo
		System.out.println("EXERCICIO DO EMPRESTIMO");
		Emprestimo.calcular(10000, Emprestimo.getQuatroParcelas());
		Emprestimo.calcular(10000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(10000, 5);
		System.out.println("");

	}

}


package exercicio_1;

/**
 * 
 * @author Rayelen Costa
 * Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * Taxas e parcelas influenciam.
 * Defina arbitrariamente as faixas que influenciam nos valores.
 *
 */

public class Emprestimo {
	
	// Parcelas
	public static int getDuasParcelas() {
		return 2;
	}
	public static int getTresParcelas() {
		return 3;
	}
	public static int getQuatroParcelas() {
		return 4;
	}
	public static int getCincoParcelas() {
		return 5;
	}
	
	// Taxas das Parcelas
	public static double getTaxasDuasParcelas () {
		return 0.3;
	}
	public static double getTaxasTresParcelas () {
		return 0.45;
	}
	public static double getTaxasQuatroParcelas () {
		return 0.556;
	}
	public static double getTaxasCincoParcelas () {
		return 1.02;
	}

	// Calcular os Valores
	public static void calcular (double valor, int parcelas) {
		
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxasDuasParcelas());
			
			System.out.println("O valor final do emprétimo para 2 parcelas: R$ " + valorFinal);
		} else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxasTresParcelas());
			
			System.out.println("O valor final do emprétimo para 3 parcelas: R$ " + valorFinal);
		} else if (parcelas == 4) {
			double valorFinal = valor + (valor * getTaxasQuatroParcelas());
			
			System.out.println("O valor final do emprétimo para 4 parcelas: R$ " + valorFinal);
		} else if (parcelas == 5) {
			double valorFinal = valor + (valor * getTaxasCincoParcelas());
			
			System.out.println("O valor final do emprétimo para 5 parcelas: R$ " + valorFinal);
		} else {
			System.out.println("Quantidade de Parcelas NÃO ACEITA !!!");
		}
	}

	
}

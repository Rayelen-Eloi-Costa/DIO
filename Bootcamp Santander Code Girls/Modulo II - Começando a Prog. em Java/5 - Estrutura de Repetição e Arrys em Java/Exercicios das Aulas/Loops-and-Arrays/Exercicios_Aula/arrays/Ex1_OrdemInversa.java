package arrays;

/**
 * 
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 *
 */
public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		int [] vetor = {2, 5, 50, 33, 84, 10};
		
		System.out.println("Arrays - Ordem Inversa");
		System.out.println("=============================================");
		
		System.out.println("Vetor: ");
		int count = 0;
		
		while(count < (vetor.length)) {
			System.out.println(vetor[count] + " ");
			count++;
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Vetor Inverso: ");
		
		for(int i = (vetor.length - 1); i >= 0 ; i--) {
			System.out.println(vetor[i] + " ");
		}
		
		System.out.println("=============================================");
	}

}

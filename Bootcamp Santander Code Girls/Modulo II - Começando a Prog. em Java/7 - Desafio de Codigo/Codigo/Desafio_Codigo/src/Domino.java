import java.util.Scanner;

public class Domino {

	public static void main(String[] args) {
		
		System.out.println("Digite um número inteiro: ");
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		 
		System.out.println("-----");
	    System.out.println((n + 1) * (n + 2)/2);

	}

}

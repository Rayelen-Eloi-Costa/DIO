import java.util.Scanner;

public class Selecao_Vetor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
        String[] nomes = new String[5];
        
        for (int i = 0; i < nomes.length; i++)
        {
//TODO: complete os espaços em branco com sua solução para o problema
        	System.out.println("Digite o Nome: ");
            nomes[i] = input.nextLine();
        }
        
        System.out.println("------------------------");
        System.out.println("Digite o Vetor: ");
        int pos = input.nextInt();
        System.out.println("ID: " + pos + " | Nome: " + nomes[pos]);

	}

}

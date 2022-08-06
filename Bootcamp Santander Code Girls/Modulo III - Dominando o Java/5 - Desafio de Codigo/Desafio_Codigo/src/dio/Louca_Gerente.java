package dio;

import java.util.Scanner;

public class Louca_Gerente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		
		System.out.println("Infomre o Desconto: ");
		int desconto = input.nextInt();
		System.out.println("Infomre o Preço Antigo: ");
		int precoAntigo = input.nextInt();


		int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
		System.out.println(precoNovo);
	}

}

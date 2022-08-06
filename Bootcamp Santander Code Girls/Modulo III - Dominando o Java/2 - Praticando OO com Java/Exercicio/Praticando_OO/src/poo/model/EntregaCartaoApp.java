package poo.model;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "18132-852";
		// Dados do Endereço
		
		Cliente cliente = new Cliente();
		
		// Dados do Cliente
		
		
		// Precisamos Inicializar a Lista
		//if (cliente.enderecos == null) {
			//cliente.enderecos = new ArrayList<Endereco>();
		//}
		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereços adicionado com sucesso!");

		} catch (Exception e) {
			System.err.println("Houve um erro ao Adicionar Endereço: " + e.getMessage());
		}
		
		
	}

}

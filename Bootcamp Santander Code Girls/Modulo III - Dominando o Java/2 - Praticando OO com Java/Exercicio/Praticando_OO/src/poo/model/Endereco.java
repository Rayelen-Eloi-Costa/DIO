package poo.model;

public class Endereco extends Object {
	
	// Para saber de onde é o endereço
	public enum TipoEndereco {
		RESIDENCIAL, 
		ENTREGA, 
		TRABALHO}
	
	public String endereco;
	public String numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	

}

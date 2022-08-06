package poo.model;

import java.util.ArrayList;
import java.util.List;

// Classe / Objeto
public class Cliente extends Pessoa {
	
	//public Endereco endereco;
	//public Endereco enderecoEntrega;
	//public Endereco enderecoTrabalho;
	
	public String nunCartao;
	private List<Endereco> enderecos;
	
	// Encapsulamento
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço Não pode ser NULO!");
		}
		
		if (endereco.cep == null) {
			throw new NullPointerException("CEP Não pode ser NULO!");
		}
		
		getEnderecos().add(endereco);
	}
	
	// Não queremos que você possa adicionar enderecos
	// public void setEnderecos(List<Endereco> enderecos) {
		//this.enderecos = enderecos;
	// }
	
	// Encapsular minha Validação de Endereco
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}



}

package poo.model;

public class Pessoa {
	
	public enum TipoPessoa {
		FISICA, 
		JURIDICA}
	
	// Boas Praticas
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;

	// Propeirdade Codigo e Atributo Nome
	public Integer codigo;
	public String nome;
	private String documento;
	public TipoPessoa tipo;
	
	public String getDocumento() {
		return documento;
	}
	
	// Encapsulamento do setDocumento
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio!");
		}
		
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
		} else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Documento invalido para Pessoa Fisica ou Juridica!");
		}
		
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	public TipoPessoa getTipo() {
		return tipo;
	}
}

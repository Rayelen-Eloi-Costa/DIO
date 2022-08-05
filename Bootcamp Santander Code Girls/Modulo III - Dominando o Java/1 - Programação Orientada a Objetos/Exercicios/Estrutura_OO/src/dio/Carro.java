package dio;

public class Carro {
	
	String cor;
	String modelo;
	int capacidade_tanque;
	
	// Construtor e Sobrecarga
	Carro() {
    }
	
	Carro(String cor, String modelo, int capacidade_tanque) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.capacidade_tanque = capacidade_tanque;
	}

	// Get e Set
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade_tanque() {
		return capacidade_tanque;
	}

	public void setCapacidade_tanque(int capacidade_tanque) {
		this.capacidade_tanque = capacidade_tanque;
	}

	// Método Calcular Tanque
	double totalValorTanque (Double combustivel) {
		return capacidade_tanque * combustivel;
	}
	
}

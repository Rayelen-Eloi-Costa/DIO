package dio.Aula_4_2;

class RodarAplicacao {

    public static void main(String[] args) {
    	
    	// Classe com Objeto Instanciado dentro dela
        Funcionario funcionario = new Funcionario();
        
        // Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        
        // Downcast
        // Apesar de ser um conceito válido, ele não é recomendado para OO
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
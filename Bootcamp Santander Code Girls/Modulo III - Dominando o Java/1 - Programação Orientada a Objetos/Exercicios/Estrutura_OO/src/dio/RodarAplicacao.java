package dio;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		// Construtor Default- Sem parâmetros
		// Exempo com Construtor Padrão
        Carro carro1 = new Carro();
        
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidade_tanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidade_tanque());
        System.out.println(carro1.totalValorTanque(6.39));
        
        System.out.println("");
        
     	// Exempo Objeto com Valores
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidade_tanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }

}

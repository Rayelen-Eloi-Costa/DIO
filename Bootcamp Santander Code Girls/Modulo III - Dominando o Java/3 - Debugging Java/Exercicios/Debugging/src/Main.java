
public class Main {

	public static void main(String[] args) {
		System.out.println("=======================================================");
		System.out.println("Iniciou do programa no Método Main.");
		System.out.println("=======================================================");
        a();
        System.out.println("=======================================================");
        System.out.println("Finalizou do programa no Método Main.");
        System.out.println("=======================================================");
    }

    static void a() {
        System.out.println("Entrou no Método A.");
        b();
        System.out.println("Finalizou o Método A.");
    }

    static void b() {
        System.out.println("Entrou no método B.");
        for(int i = 0; i <= 4; i++) {
        	System.out.println(i);
        }
        	
        c();
        System.out.println("Finalizou o Método B.");
    }

    static void c(){
        System.out.println("Entrou no Método C.");
        //Thread.dumpStack(); // Erro Proposital.
        System.out.println("Finalizou o Método C.");
    }

}
package dio;

import javax.swing.JOptionPane;

public class unchecked_exception {

	public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Inválida, informe um Número Inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um Número por 0.");
            }
            finally {
                System.out.println("Chegou no Finally!");
            }
        } while(continueLooping);


        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
    
}

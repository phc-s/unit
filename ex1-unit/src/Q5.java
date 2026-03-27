import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 5, Conversor de Centímetros para Polegadas.");

            System.out.println("\nInsira o valor em centímetros (cm): ");
            double cm = scantool.nextDouble();     

            System.out.println("\nResultados:\n");
            
            System.out.println(cm + " equivalem a " + cm / 2.54 + " polegadas.");

        } catch (Exception e) {

            System.err.println("\nERRO: Insira um número real (use vírgula se for decimal).");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
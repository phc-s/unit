import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 30 - Contador de Maiores de Idade");

            int adultCounter = 0;

            for (int i = 1; i <= 10; i++) {

                System.out.print("Idade da Pessoa " + i + ": ");
                int ageInput = scantool.nextInt();

                if (ageInput >= 18) {

                    adultCounter++;

                }
                
            }

            System.out.println("\nResultados:\n");
            System.out.println("Total de adultos: " + adultCounter );

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}

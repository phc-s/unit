import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 29 - Verificador de Faixa (100-200)");

            for (int i = 1; i <= 5; i++) {
    
                System.out.print("Valor " + i + ": ");
                long inputNumber = scantool.nextLong();

                if (inputNumber >= 100 && inputNumber <= 200) {

                    System.out.println("Você digitou um número entre 100 e 200\n");

                } else {

                    System.out.println("Tu colocou um número fora do intervalo de 100 e 200.\n");

                }

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
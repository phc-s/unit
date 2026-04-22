import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 14 - Verificação de Valor (Zero, Positivo ou Negativo)");

            System.out.print("\nInsira um valor inteiro: ");
            long n = scantool.nextLong();

            System.out.println("\nResultados:\n");
            if (n == 0) {

                System.out.println("O valor digitado é ZERO.");

            } else if (n > 0) {

                System.out.println("O valor " + n + " é POSITIVO.");

            } else {

                System.out.println("O valor " + n + " é NEGATIVO.");
                
            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
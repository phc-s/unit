import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 15 - Par ou Ímpar");

            System.out.print("\nInsira um valor: ");
            long n = scantool.nextLong();

            System.out.println("\nResultados:\n");
            if (n % 2 == 0) {

                System.out.println("O número " + n + " é PAR.");

            } else {

                System.out.println("O número " + n + " é ÍMPAR.");

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
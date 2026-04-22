import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 16 - Positivo ou Invertido");

            System.out.print("\nInsira um valor inteiro: ");
            long n = scantool.nextLong();

            System.out.println("\nResultados:\n");
            if (n >= 0) {

                System.out.println("Valor positivo mantido: " + n);

            } else {

                System.out.println("Valor negativo invertido: " + (n * -1));

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
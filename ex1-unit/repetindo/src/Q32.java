import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        
        try (Scanner scantool = new Scanner(System.in)) {
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 32 - Encontrar o Maior de 20 Números");

            long major = 0;

            for (long i = 1; i <= 20; i++) {

                System.out.print("Digite o " + i + "º número inteiro: ");
                long current = scantool.nextInt();

                if (current > major) {

                    major = current;

                }

            }

            System.out.println("\nO maior valor fornecido foi: " + major);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
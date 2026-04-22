import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 20 - Ordenação Crescente (Sem Arrays)");

            System.out.print("Insira o valor 1: ");
            long n1 = scantool.nextLong();
            System.out.print("Insira o valor 2: ");
            long n2 = scantool.nextLong();
            System.out.print("Insira o valor 3: ");
            long n3 = scantool.nextLong();

            long minor;
            long mid;
            long major;

            // Lógica de comparação manual
            if (n1 <= n2 && n1 <= n3) {

                minor = n1;

                if (n2 <= n3) {

                    mid = n2;
                    major = n3;

                } else {

                    mid = n3;
                    major = n2;

                }

            } else if (n2 <= n1 && n2 <= n3) {

                minor = n2;

                if (n1 <= n3) {

                    mid = n1;
                    major = n3;

                } else {

                    mid = n3;
                    major = n1;

                }

            } else {

                minor = n3;
                if (n1 <= n2) {

                    mid = n1;
                    major = n2;

                } else {

                    mid = n2;
                    major = n1;

                }
                
            }

            System.out.println("\nResultados:\n");
            System.out.println("Valores em ordem crescente: " + minor + ", " + mid + ", " + major);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
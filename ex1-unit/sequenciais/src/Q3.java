import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 3, Divisão Inteira (Quociente e Resto).");

            System.out.print("\nInsira o primeiro inteiro (Dividendo): ");
            long x = scantool.nextLong();
            System.out.print("Insira o segundo inteiro (Divisor): ");
            long y = scantool.nextLong();

            if (y == 0) {

                System.err.println("\nERRO: Divisão por zero não é permitida!");

            } else {

                System.out.println("\nResultados:\n");
                
                System.out.println("Quociente: " + (x / y));
                System.out.println("Resto: " + (x % y));

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
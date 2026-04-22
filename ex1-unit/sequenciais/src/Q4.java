import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 4, Soma, Produto & Quociente.");

            System.out.print("\nInsira o primeiro inteiro: ");
            long a = scantool.nextLong();
            System.out.print("Insira o segundo inteiro: ");
            long b = scantool.nextLong();

            System.out.println("\nResultados:\n");

            System.out.println("Soma: " + (a + b));
            System.out.println("Produto: " + (a * b));

            if (b == 0) {

                System.err.println("\nERRO: Divisão por zero não é permitida!");

            } else {

                System.out.println("Quociente: " + (a / b));

            }
            
        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
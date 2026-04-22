import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 22 - Calculadora de Operações");

            System.out.print("\nInsira o primeiro número: ");

            double num1 = scantool.nextDouble();

            System.out.print("Insira o segundo número: ");

            double num2 = scantool.nextDouble();

            System.out.println("\n Selecione a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.print("Opção: ");
            int option = scantool.nextInt();

            BigDecimal result = BigDecimal.ZERO;
            boolean valid = true;

            if (option == 1) {

                result = BigDecimal.valueOf(num1 + num2);

            } else if (option == 2) {

                result = BigDecimal.valueOf(num1 - num2);

            } else if (option == 3) {

                if (num2 == 0) {

                    System.err.println("ERRO: Divisão por zero!");
                    valid = false;

                } else {

                    result = BigDecimal.valueOf(num1 / num2);

                }

            } else if (option == 4) {

                result = BigDecimal.valueOf(num1 * num2);

            } else {

                System.err.println("ERRO: Invalida !");
                valid = false;

            }

            if (valid == true) {

                System.out.println("\nResultado: " + result.setScale(2, RoundingMode.HALF_UP));

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
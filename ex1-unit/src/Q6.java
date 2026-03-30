import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            scantool.useLocale(Locale.US);
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 6, Descobrindo a área do círculo com o valor do raio.");

            System.out.print("\nInsira o valor em raio (cm): ");
            double r = scantool.nextDouble();     
            BigDecimal re = BigDecimal.valueOf(Math.PI * (r * r)).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            
            System.out.println("A área do círculo equivale a: " + re + "cm.");

        } catch (Exception e) {

            System.err.println("\nERRO: Valor Incorreto!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
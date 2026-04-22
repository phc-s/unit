import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            scantool.useLocale(Locale.US);
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 7, Calculando área e volume de um cilindro.");

            System.out.print("\nInsira o valor do raio (r) em cm: ");
            double r = scantool.nextDouble();
            System.out.print("Insira o valor da altura (h) em cm: ");
            double h = scantool.nextDouble();

            BigDecimal area = BigDecimal.valueOf(2 * Math.PI * r * (h + r)).setScale(2, RoundingMode.HALF_UP);
            BigDecimal volume = BigDecimal.valueOf(Math.PI * (r * r) * h).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            System.out.println("A área do cilindro equivale a: " + area + " cm²");
            System.out.println("O volume do cilindro equivale a: " + volume + " cm³");

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");
            
        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
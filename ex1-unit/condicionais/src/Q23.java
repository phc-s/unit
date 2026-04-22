import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 23 - Equação do 2º Grau");

            System.out.print("\nInsira o valor A: ");
            double a = scantool.nextDouble();
            System.out.print("Insira o valor B: ");
            double b = scantool.nextDouble();
            System.out.print("Insira o valor C: ");
            double c = scantool.nextDouble();

            double delta = (b * b) - (4 * a * c);
            System.out.println("\nDelta (D): " + delta);

            if (delta < 0) {

                System.out.println("Sem solução real :( ");

            } else if (delta == 0) {

                double x = (-b) / (2 * a);
                BigDecimal root = BigDecimal.valueOf(x).setScale(2, RoundingMode.HALF_UP);
                System.out.println("2 soluçoes reais iguais: x1 = x2 = " + root);

            } else {

                double x1 = (-b + (delta * delta)) / (2 * a); 
                double x2 = (-b - (delta * delta)) / (2 * a);

                BigDecimal root1 = BigDecimal.valueOf(x1).setScale(2, RoundingMode.HALF_UP);
                BigDecimal root2 = BigDecimal.valueOf(x2).setScale(2, RoundingMode.HALF_UP);

                System.out.println("2 soluçoes reais distintas:");
                System.out.println("x1 = " + root1);
                System.out.println("x2 = " + root2);
                
            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
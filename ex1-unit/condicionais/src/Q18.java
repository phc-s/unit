import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 18 - Cálculo de Compra de Maçãs");

            System.out.print("\nQuantas maçãs deseja comprar? ");
            long quantity = scantool.nextInt();

            BigDecimal unitaryPrice;

            if (quantity < 12) {

                unitaryPrice = BigDecimal.valueOf(0.30);

            } else {

                unitaryPrice = BigDecimal.valueOf(0.25);

            }

            BigDecimal total = unitaryPrice.multiply(BigDecimal.valueOf(quantity)).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            System.out.println("Quantidade: " + quantity);
            System.out.println("Preço Unitário: R$ " + unitaryPrice.setScale(2, RoundingMode.HALF_UP));
            System.out.println("VALOR TOTAL: R$ " + total);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            scantool.useLocale(Locale.US);
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 8, Cálculo de Salário + 15% de Comissão.");

            System.out.print("\nInsira o salário fixo do vendedor (R$): ");
            double income = scantool.nextDouble();
            System.out.print("Insira o total de vendas efetuadas no mês (R$): ");
            double sales = scantool.nextDouble();

            BigDecimal initial_income = BigDecimal.valueOf(income).setScale(2, RoundingMode.HALF_UP);
            BigDecimal final_income = BigDecimal.valueOf( income + (sales * 0.15)).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            System.out.println("Salário Fixo: R$ " + initial_income);
            System.out.println("Salário Total (com 15% de comissão): R$ " + final_income);

        } catch (Exception e) {

            System.err.println("\nERRO: Valor Incorreto!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
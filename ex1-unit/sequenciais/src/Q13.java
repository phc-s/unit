import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        
        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 13 - Custo de Carro Novo");

            System.out.print("\nInforme o preço de fábrica do automóvel: R$ ");
            double factoryPrice = scantool.nextDouble();

            double taxesValue = factoryPrice * 0.45;      
            double dealerProfit = factoryPrice * 0.28; 
            double finalPrice = factoryPrice + taxesValue + dealerProfit;

            BigDecimal roundedFactory = BigDecimal.valueOf(factoryPrice).setScale(2, RoundingMode.HALF_UP);
            BigDecimal roundedTaxes = BigDecimal.valueOf(taxesValue).setScale(2, RoundingMode.HALF_UP);
            BigDecimal roundedProfit = BigDecimal.valueOf(dealerProfit).setScale(2, RoundingMode.HALF_UP);
            BigDecimal roundedFinal = BigDecimal.valueOf(finalPrice).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            
            System.out.println("Custo de Fábrica   : R$ " + roundedFactory);
            System.out.println("Impostos (45%)     : R$ " + roundedTaxes);
            System.out.println("Revendedor (28%)   : R$ " + roundedProfit);            
            System.out.println("PREÇO FINAL AO CONSUMIDOR: R$ " + roundedFinal);

        } catch (Exception e) {
            
            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");
            
        } finally {
            
            System.out.println("\nPrograma Encerrado!");
            
        }
    }
}
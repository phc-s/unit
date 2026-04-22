import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {

        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 24 - Cálculo de Energia Elétrica");

            System.out.print("\n Selecione a Classe do Consumidor (A, B, C): ");
            String consumerClass = scantool.next().toUpperCase();
            System.out.print("Insira o Consumo (kWh): ");
            double consumption = scantool.nextDouble();

            BigDecimal tariff;

            if (consumerClass.equals("A")) {

                tariff = BigDecimal.valueOf(0.5);

            } else if (consumerClass.equals("B")) {

                tariff = BigDecimal.valueOf(0.8); 

            } else if (consumerClass.equals("C")) {

                tariff = BigDecimal.valueOf(1.0); 

            } else {

                System.err.println("ERRO: Coloque `A`, `B` ou `C` somente!");
                return;
            }

            BigDecimal supplyValue = tariff.multiply(BigDecimal.valueOf(consumption));
            BigDecimal icms = supplyValue.multiply(BigDecimal.valueOf(0.3)); 
            BigDecimal totalToPay = supplyValue.add(icms).setScale(2, RoundingMode.HALF_UP); 

            System.out.println("\nResultados:\n");
            System.out.println("Valor do Fornecimento: R$ " + supplyValue.setScale(2, RoundingMode.HALF_UP));
            System.out.println("ICMS (30%): R$ " + icms.setScale(2, RoundingMode.HALF_UP));
            System.out.println("Total a pagar: R$ " + totalToPay);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
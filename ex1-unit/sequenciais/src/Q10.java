import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {
            
            scantool.useLocale(Locale.US);
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 10 - Caixa Eletrônico Inteligente");

            System.out.print("\nQual valor deseja sacar? R$ ");
            double totalValue = scantool.nextDouble();

            long remaining = (int) totalValue; //converti explicitamente o tipo com casting o totalValue.
            double coins = totalValue - remaining;

            long n200 = remaining / 200;
            remaining %= 200;

            long n100 = remaining / 100;
            remaining %= 100;

            long n50 = remaining / 50;
            remaining %= 50;

            long n20 = remaining / 20;
            remaining %= 20;

            long n10 = remaining / 10;
            remaining %= 10;

            long n5 = remaining / 5;
            remaining %= 5;

            long n2 = remaining / 2;
            remaining %= 2;

            double finalRest = remaining + coins;
            BigDecimal roundit = BigDecimal.valueOf(finalRest).setScale(2, RoundingMode.HALF_UP);


            System.out.println("\nResultados:\n");

            System.out.println("Notas de R$ 200,00: " + n200);
            System.out.println("Notas de R$ 100,00: " + n100);
            System.out.println("Notas de R$ 50,00 : " + n50);
            System.out.println("Notas de R$ 20,00 : " + n20);
            System.out.println("Notas de R$ 10,00 : " + n10);
            System.out.println("Notas de R$ 5,00  : " + n5);
            System.out.println("Notas de R$ 2,00  : " + n2);
            System.out.println("Troco total (moedas): R$ " + roundit);
        

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!");

        }
    }
}
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Q31 {
    public static void main(String[] args) {
        try {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 31 - Tabela de Conversão Fahrenheit para Celsius");

            System.out.println("\nFahrenheit | Celsius");

            for (int fahrenheit = 50; fahrenheit <= 65; fahrenheit++) {

                double celsiusValue = (5.0 / 9.0) * (fahrenheit - 32);
                BigDecimal result = BigDecimal.valueOf(celsiusValue).setScale(2, RoundingMode.HALF_UP);
                System.out.println(fahrenheit + "°F | " + result + "°C");

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
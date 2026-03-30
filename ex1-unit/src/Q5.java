import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            scantool.useLocale(Locale.US);
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 5, Conversor de Centímetros para Polegadas. (Use ponto (.) nas decimais) ");

            System.out.print("\nInsira o valor em centímetros (cm): ");
            double cm = scantool.nextDouble(); 
            BigDecimal re = BigDecimal.valueOf(cm / 2.54).setScale(2, RoundingMode.HALF_UP);

            System.out.println("\nResultados:\n");
            
            System.out.println(cm + " equivalem a " + re + " polegadas.");

        } catch (Exception e) {

            System.err.println("\nERRO: Valor Incorreto!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}
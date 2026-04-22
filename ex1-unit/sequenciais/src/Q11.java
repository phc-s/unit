import java.util.Locale;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 11 - Troco do Supermercado");

            System.out.print("\nQual valor total da compra? R$ ");
            double productValue = scantool.nextDouble();

            System.out.print("Qual valor dado pelo cliente? R$ ");
            double clientValue = scantool.nextDouble();
            double totalChange = clientValue - productValue;

            if (totalChange < 0) {
                System.out.println("\nValor insuficiente! Faltam R$ " + String.format("%.2f", Math.abs(totalChange)));
                return;
            }

            long remaining = Math.round(totalChange * 100);

            System.out.println("\nResultados:\n");
            System.out.println("\nTroco Total: R$ " + String.format("%.2f", totalChange) + "\n");


            long n200 = remaining / 20000; 
            remaining %= 20000;
            long n100 = remaining / 10000; 
            remaining %= 10000;
            long n50  = remaining / 5000;  
            remaining %= 5000;
            long n20  = remaining / 2000;  
            remaining %= 2000;
            long n10  = remaining / 1000;  
            remaining %= 1000;
            long n5   = remaining / 500;   
            remaining %= 500;
            long n2   = remaining / 200;   
            remaining %= 200;

            long r1   = remaining / 100;   
            remaining %= 100;
            long c50  = remaining / 50;    
            remaining %= 50;
            long c25  = remaining / 25;    
            remaining %= 25;
            long c10  = remaining / 10;    
            remaining %= 10;
            long c5   = remaining / 5;     
            remaining %= 5;
            long c1   = remaining;         

            if (n200 > 0) System.out.println("Notas de R$ 200,00: " + n200);
            if (n100 > 0) System.out.println("Notas de R$ 100,00: " + n100);
            if (n50 > 0)  System.out.println("Notas de R$ 50,00 : " + n50);
            if (n20 > 0)  System.out.println("Notas de R$ 20,00 : " + n20);
            if (n10 > 0)  System.out.println("Notas de R$ 10,00 : " + n10);
            if (n5 > 0)   System.out.println("Notas de R$ 5,00  : " + n5);
            if (n2 > 0)   System.out.println("Notas de R$ 2,00  : " + n2);
            
            System.out.println("---");
            if (r1 > 0)   System.out.println("Moeda de R$ 1,00  : " + r1);
            if (c50 > 0)  System.out.println("Moeda de R$ 0,50  : " + c50);
            if (c25 > 0)  System.out.println("Moeda de R$ 0,25  : " + c25);
            if (c10 > 0)  System.out.println("Moeda de R$ 0,10  : " + c10);
            if (c5 > 0)   System.out.println("Moeda de R$ 0,05  : " + c5);
            if (c1 > 0)   System.out.println("Moeda de R$ 0,01  : " + c1);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!");

        }
    }
}